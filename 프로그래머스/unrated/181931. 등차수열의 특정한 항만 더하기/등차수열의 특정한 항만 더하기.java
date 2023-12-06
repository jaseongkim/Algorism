class Solution {
    public int solution(int a, int d, boolean[] included) {
        int[] result = new int[included.length];
        int answer = 0;
        
        for(int i = 0; i<included.length; i++){
            result[i] = a + (d*i);
            if( included[i] == true) {
                answer += result[i];
            }
        }
        
        
        
        return answer;
    }
}