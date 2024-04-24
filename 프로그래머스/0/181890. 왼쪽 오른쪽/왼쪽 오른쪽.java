import java.util.ArrayList;

class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        
        ArrayList<String> list = new ArrayList<>();
        
        for(int i = 0; i<str_list.length; i++) {
            if(str_list[i].equals("l")) {
                if(i == 0) {
                    return answer;
                }
                
                for(int j = 0; j<i; j++) {
                    list.add(str_list[j]);
                }
                break;
            } else if(str_list[i].equals("r")) {
                if(i == str_list.length-1) {
                    return answer;
                }
                
                for(int j = i+1; j<str_list.length; j++){
                    list.add(str_list[j]);
                }
                break;
                
            }
        }
        
        answer = new String[list.size()];
        
        for(int i = 0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        
        
        return answer;
    }
}