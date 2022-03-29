package twoPointers_SlidingWindow;

import java.util.Scanner;

public class Q03 {

	public int solution(int N, int K, int[] arr) {
		int answer = 0;
		
		for(int i = 0;i <= N-K;i++) {
			if(answer < arr[i]+arr[i+1]+arr[i+2]) {
				answer = arr[i]+arr[i+1]+arr[i+2];
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Q03 T = new Q03();
		Scanner kb = new Scanner(System.in);
		
		int N = kb.nextInt();
		int K = kb.nextInt();
		int[] arr = new int[N];
		
		for(int i = 0;i < N;i++) {
			arr[i] = kb.nextInt();
		}
		
		System.out.println(T.solution(N,K,arr));
		
	}
}