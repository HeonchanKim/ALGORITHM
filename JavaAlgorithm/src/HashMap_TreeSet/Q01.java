package HashMap_TreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class Q01 {
    public int solution(int n,String str){
        int answer = 0;
        HashMap<String, Integer> map = new HashMap<>();
        
        // map.put("A",0);
        // map.put("B",0);
        // map.put("C",0);
        // map.put("D",0);
        // map.put("E",0);

        for(int i = 0;i < str.length();i++){
            if (str.indexOf(i) == 'A'){
                int result = Integer.parseInt(map.get("A").toString());
                map.put("A",++result);
            }else if(str.indexOf(i) == 'B'){
                int result = Integer.parseInt(map.get("B").toString());
                map.put("B",++result);
            }else if(str.indexOf(i) == 'C'){
                int result = Integer.parseInt(map.get("C").toString());
                map.put("C",++result);
            }else if(str.indexOf(i) == 'D'){
                int result = Integer.parseInt(map.get("D").toString());
                map.put("D",++result);
            }else if(str.indexOf(i) == 'E'){
                int result = Integer.parseInt(map.get("E").toString());
                map.put("E",++result);
            }
        }
        
        System.out.println(map.values());

        return answer;
    }

    public static void main(String[] args) {
        Q01 T = new Q01();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();
        System.out.print(T.solution(n,str));
        kb.close();
    }
}