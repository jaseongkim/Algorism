import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] str = s.split("");
        
        for(int i=0; i<str.length; i++) {
            int cnt = 0;
            for(int j = 0; j<str.length; j++){
                if(str[i].equals(str[j])){
                    cnt+=1;
                }
            }
            if(cnt == 1) {
                answer += str[i];
            }
        }
        
        String[] array = answer.split("");
        
        Arrays.sort(array);
        
        answer = "";
        
        for(int i = 0; i<array.length; i++) {
            answer += array[i];
        }
        
        return answer;
    }
}