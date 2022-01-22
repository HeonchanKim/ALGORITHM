package String;

import java.util.Scanner;

public class Q02 {
	public String solution(String str) {
		String answer = "";
		char[] c = str.toCharArray();
		
		for (int i = 0; i < c.length; i++) {
			if((int)c[i] <= 90) {
				c[i] = (char)((int)c[i]+32);
			}else {				
				c[i] = (char)((int)c[i]-32);
			}
		}
		
		for (int i = 0; i < c.length; i++) {
			answer += ""+c[i];
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Q02 main = new Q02();
		
		String str = sc.next();
		
		System.out.println(main.solution(str));
	}
}
