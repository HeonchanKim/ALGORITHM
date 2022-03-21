package twoPointers_SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q02 {
    public ArrayList<Integer> solution(int n, int[] a, int m, int[] b){
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int p1 = 0;
        int p2 = 0;

        while(p1<n){
            if(a[p1] == b[p2]){
                answer.add(b[p2]);
                p2=0;
                p1++;
            }else{
                if(p2 < m-1){
                    p2++;
                }else{
                    p2=0;
                    p1++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Q02 T = new Q02();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] a = new int[n];
        for(int i = 0;i < n;i++){
            a[i] = kb.nextInt();
        }

        int m = kb.nextInt();
        int[] b = new int[m];
        for(int i = 0;i < m;i++){
            b[i] = kb.nextInt();
        }

        for(int x:T.solution(n,a,m,b)){
            System.out.print(x+" ");
        }

        kb.close();
    }
}