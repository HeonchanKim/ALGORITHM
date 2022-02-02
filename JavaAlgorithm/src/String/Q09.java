package String;

import java.util.Scanner;

public class Q09 {
	public int solution(String str) {
		int answer = 0;
		char[] c = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < c.length; i++) {
			if(Character.isDigit(c[i])) {
				sb.append(c[i]);
			}
		}
		
		if(sb.charAt(0) == '0') {
			sb.deleteCharAt(0);
		}
		answer = Integer.parseInt(sb.toString());		
		
		return answer;
	}
	
	public static void main(String[] args) {
		Q09 T = new Q09();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}