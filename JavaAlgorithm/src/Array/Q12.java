package Array;

import java.util.Scanner;

public class Q12 {
	public int solution(int n, int m, int[][] arr){
		int answer = 0;
		return answer;
	}

	public static void main(String[] args) {
		Q12 T = new Q12();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int m = kb.nextInt();
		int[][] arr = new int[m][n];
		
		for(int i = 0;i < m;i++){
			for(int j = 0;j < n;j++){
				arr[i][j] = kb.nextInt();
			}
		}
		
		System.out.println(T.solution(n, m, arr));
	}
}