class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String num1 = a+""+b;
        
        int num2 = 2 * a * b;
        
        int num3 = Integer.parseInt(num1);
        
        if(num3 >= num2) {
            answer = num3;
        } else {
            answer = num2;
        }
        
        
        
        return answer;
    }
}