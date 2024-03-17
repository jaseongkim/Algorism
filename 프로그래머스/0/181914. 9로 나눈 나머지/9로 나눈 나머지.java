class Solution {
    public long solution(String number) {
        long answer = 0;
        
        String[] str = number.split("");
        
        for(int i = 0; i < str.length; i++){
            answer += Integer.parseInt(str[i]);
        }
        
        answer = answer % 9;
        
       
        
        return answer;
    }
}