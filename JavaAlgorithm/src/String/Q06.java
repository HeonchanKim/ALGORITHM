package String;

import java.util.Scanner;

public class Q06 {
	public String solution(String str) {
		String answer="";
		char[] x = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			if(answer.indexOf(x[i])==-1) {
				answer += x[i];
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		Q06 T = new Q06();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		
		System.out.println(T.solution(str));
	}
}