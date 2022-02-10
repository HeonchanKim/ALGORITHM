package Array;

import java.util.Scanner;

public class Q04 {
	public int[] solution(int num) {
		int[] arr = new int[num];
		arr[0] = 1;
		arr[1] = 1;
		
		for (int i = 2; i < num; i++) {
			arr[i] = arr[i-1]+arr[i-2];
		}
		
		return arr;
	}
	public static void main(String[] args) {
		Q04 T = new Q04();
		Scanner kb = new Scanner(System.in);
		int num = kb.nextInt();
		
		
		for(int y:T.solution(num)) {
			System.out.print(y+" ");
		}
	}
}