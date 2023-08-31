class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String num = Integer.toString(n);
        
        String[] result = num.split("");
        
        int sum =0;
        for(int i = 0; i < result.length; i++){
             sum += Integer.parseInt(result[i]);
        }
        
        answer = sum;
        
        
        
        return answer;
    }
}