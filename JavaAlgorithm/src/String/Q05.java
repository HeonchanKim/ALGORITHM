package String;

import java.util.Scanner;

public class Q05 {
	public String solution(String str) {
		
		char[] c = str.toCharArray();
		int lt = 0, rt = c.length-1;
		
		// A65 Z90 , a97 z122
		while(lt < rt) {
			if(((c[lt] >= 65 && c[lt] <= 90) || (c[lt] >= 97 && c[lt] <= 122))&&((c[rt] >= 65 && c[rt] <= 90) || (c[rt] >= 97 && c[rt] <= 122))) {
				char tmp = c[lt];
				c[lt] = c[rt];
				c[rt] = tmp;
			}
			lt++;
			rt--;
		}
		String answer = String.valueOf(c);
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		Q05 T = new Q05();
		Scanner kb = new Scanner(System.in);
		String str = kb.next();
		
		System.out.println(T.solution(str));
	}
}