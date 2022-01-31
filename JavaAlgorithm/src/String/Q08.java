package String;

import java.util.Scanner;

public class Q08 {
	public String solution(String s){
		String answer="NO";
		s=s.toUpperCase().replaceAll("[^A-Z]", "");
		String tmp=new StringBuilder(s).reverse().toString();
		if(s.equals(tmp)) answer="YES";
		return answer;
	}
	public static void main(String[] args) {
		Q08 T = new Q08();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.println(T.solution(str));
		
	}
}
