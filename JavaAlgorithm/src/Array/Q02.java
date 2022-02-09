package Array;

import java.util.Scanner;

public class Q02 {
	public int solution(int[] arr) {
		int answer = 1;
		
		for (int i = 1; i < arr.length; i++) {
			boolean c = true;
			for(int j = 0;j < i;j++) {
				if(arr[i]<=arr[j]) {
					c = false;
					break;
				}
			}	
			
			if(c) {
				answer++;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Q02 T = new Q02();
		Scanner kb = new Scanner(System.in);
		int num = kb.nextInt();
		int[] arr = new int[num];
		
		for (int i = 0; i < num; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.println(T.solution(arr));
	}
}