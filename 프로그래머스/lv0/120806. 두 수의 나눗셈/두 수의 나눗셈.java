class Solution {
    public int solution(int num1, int num2) {
        double answer = 0;
        
        double num3 = num1;
        double num4 = num2;
        
        answer =  (num3 / num4) * 1000;
        
        int result = (int) answer;
        
        return result;
    }
}