package whileEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q02_10951 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str;
		
		while((str=br.readLine()) != null) {
			int A = str.charAt(0)-'0';
			int B = str.charAt(2)-'0';
			sb.append(A+B).append("\n");
		}
		System.out.println(sb);
		
		br.close();		
	}
}