class Solution {
    public int[] solution(long n) {
     int[] answer = {};

		String[] str = (n + "").split("");
		
		answer = new int[str.length];
		
		int j = 0;
		for(int i = str.length-1; i>=0; i--) {
			answer[j] = Integer.parseInt(str[i]);
			j++;
		}
		
        
        
        
        return answer;
    }
}