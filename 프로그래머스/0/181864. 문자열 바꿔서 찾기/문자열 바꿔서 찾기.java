class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        String[] str = myString.split("");
        String result = "";
        
        for(int i = 0; i<str.length; i++){
            if(str[i].equals("A")){
                str[i] = "B";
            } else {
                str[i] = "A";
            }
        }
        
        for(int i = 0; i<str.length; i++){
                result += str[i];
            
        }
        
        if(result.contains(pat)){
            answer = 1;
        }
        
        
        
        return answer;
    }
}