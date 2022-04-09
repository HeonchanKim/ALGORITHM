package HashMap_TreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class Q02 {
    public String solution(String arr1, String arr2){
        String answer = "YES";
        String temp = arr1+arr2;
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(char x :temp.toCharArray()){
            map.put(x,map.getOrDefault(x, 0)+1);
        }
        
        for(char x :temp.toCharArray()){
            if(map.get(x)%2!=0){
                answer="NO";
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Q02 T = new Q02();
        Scanner kb = new Scanner(System.in);
        String str1 = kb.next();
        String str2 = kb.next();
        System.out.print(T.solution(str1,str2));
        kb.close();
    }
}
