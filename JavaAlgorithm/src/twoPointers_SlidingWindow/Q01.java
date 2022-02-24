package twoPointers_SlidingWindow;

import java.util.Scanner;

public class Q01 {
	public int[] solution(int n, int[] arr1, int m, int[] arr2) {
		int[] answer = new int[n+m];
		int tmp = 0;
		for (int i = 0; i < answer.length; i++) {
			if(i >= arr1.length) {
				answer[i] = arr2[i-arr1.length];
			}else {
				answer[i] = arr1[i];				
			}
			
			tmp = answer[i];
			int x = 0;
			for (int j = 0; j <= i; j++) {
				if(answer[j] > tmp) {
					x = answer[j];
					answer[j] = tmp;
					tmp = x;
					answer[i] = x;
				}
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		Q01 T = new Q01();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr1 = new int[n];
		for (int i = 0; i < n; i++) {
			arr1[i] = kb.nextInt();
		}
		
		int m = kb.nextInt();
		int[] arr2 = new int[m];
		for (int i = 0; i < m; i++) {
			arr2[i] = kb.nextInt();
		}
		
		for(int x:T.solution(n, arr1, m, arr2)) {
			System.out.print(x + " ");
		}
	}
}