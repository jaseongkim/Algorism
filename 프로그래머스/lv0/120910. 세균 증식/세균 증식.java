class Solution {
    public int solution(int n, int t) {
        int answer = n;
        
        for(int i = 1; i <= t; i++  ){
            if( t == 0) {
                answer = n;
            } else {
                answer *= 2;
            }
        }
                
        return answer;
    }
}