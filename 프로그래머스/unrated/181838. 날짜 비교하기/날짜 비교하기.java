class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        
        String num1="";
        String num2="";
        
        for(int i = 0; i< date1.length; i++) {
            num1 += date1[i];
            num2 += date2[i];
        }
        
        if(Integer.parseInt(num1) < Integer.parseInt(num2)){
            answer = 1;
        } else {
            answer = 0;
        }
        
        
        
        return answer;
    }
}