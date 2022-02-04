package String;

import java.util.Scanner;

public class Q11 {
	public String solution(String str) {
		String answer = "";
		
		int i = 0;
		int cnt = 1;
		while(i<str.length()) {
			cnt = 1;
			
			answer += Character.toString(str.charAt(i));
			for (int j = 1+i; j < str.length(); j++) {
				if(str.charAt(i)==str.charAt(j)) {
					cnt++;
				}else {
					break;					
				}
			}// end of for
			
			if(cnt >=2) {
				i += cnt;
				answer += cnt;
			}else {
				i++;				
			}
		}// end of while
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		Q11 T = new Q11();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		System.out.println(T.solution(str));
	}
}