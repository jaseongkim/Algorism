class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        
        answer = my_string.trim().split("\\s+");
    
        for(int i = 0; i< answer.length; i++) {
            System.out.print(answer[i]);
        }
       
        
        
        return answer;
    }
}