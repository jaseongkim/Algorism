class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        String[] str = my_string.split("");
        
        for(int i = 0; i < str.length; i++){
            if(i == s) {
                answer += overwrite_string;
                i += ((overwrite_string.length())-1);
            } else {
                answer += str[i];    
            }
        }
        
        
        
        return answer;
    }
}