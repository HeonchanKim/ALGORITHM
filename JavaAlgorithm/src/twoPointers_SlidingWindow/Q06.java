package twoPointers_SlidingWindow;

import java.util.Scanner;

public class Q06 {
    public int solution(int n,int k,int[] arr){
        int answer = 0;
        int temp = 0;

        for(int i = 0;i < n;i++){
            if(arr[i] != 1){
                temp = i;
                arr[i] = 1;
                k++;

                if(k == 2){
                    answer = i;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Q06 T = new Q06();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];

        System.out.println(T.solution(n,k,arr));
    }
}
