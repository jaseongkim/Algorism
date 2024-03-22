class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        
        String[] str = my_string.split("");
        
        int cnt = 0;
        for(int i = 0; i<str.length; i++){
            if(i>=s && i<=e){
                answer += str[e-cnt];
                cnt++;
            } else {
                answer += str[i];
            }
        }
        
        return answer;
    }
}