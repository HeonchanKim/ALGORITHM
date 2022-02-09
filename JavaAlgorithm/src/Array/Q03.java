package Array;

import java.util.Scanner;

public class Q03 {
	public String solution(int num, int[] arr1, int[]arr2) {
		String answer = "";
		
		for (int i = 0; i < num; i++) {
			if((arr1[i]==1&&arr2[i]==2)||(arr1[i]==2&&arr2[i]==3)||(arr1[i]==3&&arr2[i]==1)) {
				answer += "B";
			}else if((arr1[i]==1&&arr2[i]==3)||(arr1[i]==2&&arr2[i]==1)||(arr1[i]==3&&arr2[i]==2)) {
				answer += "A";
			}else {
				answer += "D";				
			}
			answer += "\n";
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Q03 T = new Q03();
		Scanner kb = new Scanner(System.in);
		int num = kb.nextInt();
		int[] arr1 = new int[num];
		int[] arr2 = new int[num];
		
		for (int i = 0; i < num; i++) {
			arr1[i] = kb.nextInt();
		}
		for (int i = 0; i < num; i++) {
			arr2[i] = kb.nextInt();
		}
		
		System.out.println(T.solution(num,arr1,arr2));
	}
}