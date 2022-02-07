package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Q01 {
	public ArrayList<Integer> solution(int N, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		answer.add(arr[0]);
		
		for (int i = 1; i < N; i++) {
			if(arr[i]>arr[i-1]) {
				answer.add(arr[i]);
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		Q01 T = new Q01();
		Scanner kb = new Scanner(System.in);
		int N = kb.nextInt();
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = kb.nextInt();
		}
		
		for(int x:T.solution(N, arr)) {
			System.out.print(x+" ");
		}
		
	}
}