package String;

import java.util.Scanner;

public class Q07 {
	public String solution(String str) {
		String answer = "";
		String lowStr = str.toLowerCase();
		StringBuffer sb = new StringBuffer(str.toLowerCase());
		String x = sb.reverse().toString();

		if(lowStr.equals(x.toLowerCase())) {
			answer = "YES";
		}else {
			answer = "NO";			
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Q07 T = new Q07();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
				
		System.out.println(T.solution(str));
	}
}
