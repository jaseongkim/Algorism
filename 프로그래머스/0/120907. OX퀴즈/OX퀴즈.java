class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i = 0; i<quiz.length; i++) {
            String[] str = quiz[i].split(" ");
            
            int firstNum = Integer.parseInt(str[0]);
            int secondNum = Integer.parseInt(str[2]);
            int resultNum = Integer.parseInt(str[4]);
            
            if(str[1].equals("+")) {
                answer[i] = firstNum + secondNum == resultNum ? "O":"X";
            } else {
                answer[i] = firstNum - secondNum == resultNum ? "O":"X";
            }
        }
        
        
        
        
        return answer;
    }
}