package HashMap_TreeSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Q03 {
    public String solution(int n, int k, int[] arr){
        String answer = "";
        HashMap<ArrayList<Integer>,Integer> map= new HashMap<>();
        

        for(int i = 0;i < k;i++){
            ArrayList<Integer> list = new ArrayList<>();
            
            for(int j = i;i < k+i;j++){
                list.add(arr[j]);
            }

            int lt = 0, rt = 1,cnt = k;
            while(lt < k-1){
                if(list.get(lt) == list.get(rt)){
                    cnt--;
                }
                rt++;
                if(rt > k){
                    rt = 1;
                    lt++;
                }
            }

            map.put(list,cnt);
        }


        return answer;
    }

    public static void main(String[] args) {
        Q03 T = new Q03();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, k, arr));
        kb.close();
    }
}
