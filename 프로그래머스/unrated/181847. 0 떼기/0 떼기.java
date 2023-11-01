class Solution {
    public String solution(String n_str) {
        String answer = "";
        
        String[] str = n_str.split("");
        
        if(!str[0].equals("0")) {
            answer = n_str;
        } else {
            for(int i = 0; i < str.length; i++) {
                if(str[i].equals("0")){
                     continue;   
                    }
                for(int j = i; j<str.length; j++) {
                   answer += str[j];
                }
                break;
            }
        }
        
        
        
        return answer;
    }
}