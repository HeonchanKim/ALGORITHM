package whileEx;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Q01_10952 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		ArrayList<Integer> al = new ArrayList<>();
		StringTokenizer st;
		int A,B;
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			
			if(A+B > 0) {
				al.add(A+B);
			}else {
				break;
			}
		}
		
		for (int i = 0; i < al.size(); i++) {
			bw.write(al.get(i)+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}