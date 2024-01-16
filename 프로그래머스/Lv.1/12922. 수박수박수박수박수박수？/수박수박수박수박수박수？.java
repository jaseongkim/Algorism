class Solution {
    public String solution(int n) {
        String answer = "";
        
        StringBuilder stringBuilder = new StringBuilder();
        
        int evenOdd = n % 2;
        int count = n / 2;
        
        for(int i = 0; i< count; i++){
            stringBuilder.append("수박");
        }
        
        if(evenOdd == 1) {
             stringBuilder.append("수");
        }
        
        answer = stringBuilder.toString();
        
        return answer;
    }
}