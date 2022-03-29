package twoPointers_SlidingWindow;

import java.util.Scanner;

public class Q04 {
	
	public int solution(int N, int M, int[] arr) {
		int answer = 0;
		int sum = 0;
		
		
		for(int i = 0;i < N;i++) {
			sum = arr[i];
			
			for (int j = i+1; j < N; j++) {
				sum += arr[j];
				
				if(sum == M) {
					answer++;
					break;
				}else if(sum > M) {
					break;
				}
			}
			
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Q04 T = new Q04();
		Scanner kb = new Scanner(System.in);
		int N = kb.nextInt();
		int M = kb.nextInt();
		int[] arr = new int[N];
		
		for(int i = 0;i < M;i++) {
			arr[i] = kb.nextInt();
		}
		
		System.out.println(T.solution(N,M,arr));
		
	}
}