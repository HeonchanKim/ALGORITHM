package String;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q10 {
	public String solution(String str) {
		String answer = "";
		StringTokenizer st = new StringTokenizer(str);
		String s = st.nextToken();
		char[] c = s.toCharArray();
		char t = st.nextToken().charAt(0);
		
		for (int i = 0; i < c.length; i++) {
			if(c[i] == t) {
				c[i] = 48;
				int num = 48;
				
				for (int j = i-1; j >= 0; j--) {
					if(c[j]==48) {
						break;
					}else {
						num++;
						c[j] = (char)num;
					}
				}// end of 2for
			}// end of if
		} //end of for
		
		for (int i = 0; i < c.length; i++) {
			if(c[i] == 48) {
				int num = 48;
				
				for (int j = i+1; j < c.length; j++) {
					if(c[j]==48) {
						break;
					}else if(c[j]>num){
						num++;
						c[j] = (char)num;
					}
				}// end of 2for
			}// end of if
		} //end of for
		
		
		answer = String.copyValueOf(c);
		for (int i = 0; i < answer.length()-1; i++) {
			answer.charAt(i);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Q10 T = new Q10();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(T.solution(str));
		
	}
}