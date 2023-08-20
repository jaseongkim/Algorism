class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        
        for(int result : array){
	        	if(result > height) {
	        		answer+=1;
	        	}
	        }
        
        
        return answer;
    }
}