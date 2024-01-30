class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        
        String[] str = my_string.split("");
        
        String tmp = "";
        
        tmp = str[num1];
        str[num1] = str[num2];
        str[num2] = tmp;
        
        for(int i = 0; i<str.length; i++) {
            answer += str[i];
        }
        
        
        return answer;
    }
}