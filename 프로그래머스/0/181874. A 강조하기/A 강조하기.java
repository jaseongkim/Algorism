class Solution {
    public String solution(String myString) {
        String answer = "";
        
        myString = myString.toLowerCase();
        
        String[] str = myString.split("");
        
        for(int i = 0; i<str.length; i++) {
            if(str[i].equals("a")) {
                str[i] = "A";
            }
        }
        for(int i = 0; i<str.length; i++) {
            answer += str[i];
        }
        
        
        return answer;
    }
}