class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        
           String result = Integer.toString(num);
	        String[] str = result.split("");
	        String n = Integer.toString(k);
	        
	        for(int i = 0; i< str.length; i++) {
	        	
	        	if(str[i].equals(n)) {
	        		answer = i+1;
	        		break;
	        	} else
	        		answer = -1;
	        }
        
        
        
        return answer;
    }
}