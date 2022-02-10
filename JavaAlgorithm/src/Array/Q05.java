package Array;

import java.util.Scanner;

public class Q05 {
	public int solution(int num) {
		int answer = 0;
		
		for (int i = 1; i <= num; i++) {
			boolean c = true;
			for (int j = i-1; j > 1; j--) {
				if(i%j==0) {
					c=false;
					break;
				}
			}
			if(c==true) {
				answer++;
			}
			
		}
		
		return answer;
	}
	public static void main(String[] args) {
		Q05 T = new Q05();
		Scanner kb = new Scanner(System.in);
		int num = kb.nextInt();
		System.out.println(T.solution(num));
	}
}