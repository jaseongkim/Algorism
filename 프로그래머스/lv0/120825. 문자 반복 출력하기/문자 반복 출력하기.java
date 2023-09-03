class Solution {
    public String solution(String my_string, int n) {
     String answer = "";

		String[] str = my_string.split("");
		String[] str1 = new String[str.length];
		
		str1 =  my_string.split("");
		

		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < n-1; j++) {
				str1[i] += str[i];
			}
		}
		
		for(int i = 0; i< str.length; i++) {
			answer += str1[i];
		}
		
		return answer;
    }
}