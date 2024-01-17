class Solution {
    public String solution(String s) {
        String answer = "";
        
        int alpha = s.length();
        String[] strArray = s.split(""); 
        
        if(alpha % 2 == 0){
            answer = strArray[(alpha / 2)-1] + strArray[(alpha / 2)];
        } else {
             answer = strArray[(alpha / 2)];
        }
        
        
        
        
        return answer;
    }
}