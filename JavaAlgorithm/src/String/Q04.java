package String;

import java.util.Scanner;

public class Q04 {
	public void solution(int N) {
		StringBuilder[] answer = new StringBuilder[N];
		StringBuilder[] str = new StringBuilder[N];
		Scanner kb = new Scanner(System.in);

		for (int i = 0; i < N; i++) {
			str[i] = new StringBuilder();
			String tmp = kb.next();
			str[i].append(tmp);
		}

		for (int i = 0; i < N; i++) {
			answer[i] = new StringBuilder();
			answer[i] = str[i].reverse();
			System.out.println(answer[i]);
		}

	}

	public static void main(String[] args) {
		Q04 T = new Q04();
		Scanner kb = new Scanner(System.in);
		int N = kb.nextInt();

		T.solution(N);
	}
}