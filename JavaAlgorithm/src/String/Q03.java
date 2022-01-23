package String;

import java.util.Scanner;

public class Q03 {
	public String solution(String str) {
		String answer = "";
		String[] arr = str.split(" ");
		int max = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].length() > max) {
				max = arr[i].length();
				answer = arr[i];
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		Q03 T = new Q03();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		
		System.out.println(T.solution(str));
	}
}