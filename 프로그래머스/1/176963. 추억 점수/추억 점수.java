import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < name.length; i++) {
            String nameItem = name[i];
            int point = yearning[i];
            
            map.put(nameItem, point);
        }
        
        for(int i = 0; i < photo.length; i++) {
            for(int j = 0; j<photo[i].length; j++){
                answer[i] += map.getOrDefault(photo[i][j], 0); 
            }
        
        }
        
        
        
        
        return answer;
    }
}