package String;

import java.util.Scanner;

public class Q12 {
	public String solution(int num, String str2) {
		String answer = "";
		String[] strArr = new String[num];
		char[] c = new char[num];
		int start = 0;
		int end = 7;
		int i = 0;
		str2 = str2.replace("#", "1").replace("*", "0");	
		
		while(i<num) {
			strArr[i]=str2.substring(start, end);
			c[i] = (char)Integer.parseInt(strArr[i],2);
			answer += Character.toString(c[i]);
			i++;
			start += 7;
			end += 7;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Q12 T = new Q12();
		Scanner kb = new Scanner(System.in);
		int num = kb.nextInt();
		String str2 = kb.next();
		System.out.println(T.solution(num,str2));
		
	}
}