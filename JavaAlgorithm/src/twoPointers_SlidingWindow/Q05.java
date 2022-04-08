package twoPointers_SlidingWindow;

import java.util.Scanner;

public class Q05 {
	public int solution(int n) {
		int answer = 0, sum = 0,lt = 1;
		
		for(int rt = 1;rt < n;rt++) {
			
			sum += rt;
			if(n == sum) {
				answer++;
			}
			
			while(sum >= n) {
				
				sum -= lt++;
				
				if(n == sum) {
					answer++;
					break;
				}
				
			}// end of while
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		Q05 T = new Q05();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		
		System.out.println(T.solution(n));
	}
}