import java.util.*;

class Solution {
    public int solution(int n, String control) {
        int answer = n;
        
        Map<String, Integer> map = new HashMap<>(); 
        
        map.put("w", 1);
        map.put("s", -1);
        map.put("d", 10);
        map.put("a", -10);
        
        String[] str = control.split("");
        
        for(int i = 0; i<str.length; i++){
            answer += map.get(str[i]);
        }
        
        
        return answer;
    }
}