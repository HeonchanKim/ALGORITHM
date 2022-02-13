package Array;

import java.util.Scanner;

public class Q07 {
	public int solution(int n, int[] arr) {
		int answer = 0;
		int cnt = 0;
		
		for (int i = 0; i < n; i++) {
			if(arr[i] == 1) {
				cnt++;
				answer+= cnt;
			}else {
				cnt = 0;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Q07 T = new Q07();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.println(T.solution(n ,arr));
	}
}