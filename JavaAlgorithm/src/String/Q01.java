package String;

import java.util.Scanner;

public class Q01 {
	public static int print1(String str1, String str2) {
		int result = 0;
		//charAt:������ index��°�� ���ڸ� ��ȯ�Ѵ�.
		
		for (int i = 0; i < str1.length(); i++) {
			String a = str1.toUpperCase().charAt(i)+"";
			String b = str1.toLowerCase().charAt(i)+"";
			if(str2.equals(a) || str2.equals(b)) {
				result++;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		System.out.println(print1(str1,str2));
	}
}
