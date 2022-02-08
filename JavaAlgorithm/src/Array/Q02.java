package Array;

import java.util.Scanner;

public class Q02 {
	public int solution() {
		int answer = 0;
		return answer;
	}
	public static void main(String[] args) {
		Q02 T = new Q02();
		Scanner kb = new Scanner(System.in);
		int num = kb.nextInt();
		int[] arr = new int[num];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = kb.nextInt();
		}
		
		System.out.println(T.solution());
	}
}
