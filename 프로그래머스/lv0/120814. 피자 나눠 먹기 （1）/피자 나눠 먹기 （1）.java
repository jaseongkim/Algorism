class Solution {
    public int solution(int n) {
        
        int answer = 0;
        
        for(int i=1; i<16; i++){
            if(n < 7) {
                answer = 1;
                break;
            }
            else if( ((7*i)/ n) == 1 ) {
                answer = i;
                break;
            } 
        }
        
        return answer;
    }
}