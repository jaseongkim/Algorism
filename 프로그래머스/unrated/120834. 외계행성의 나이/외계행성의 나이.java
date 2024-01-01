class Solution {
    public String solution(int age) {
     String answer = "";

		char[] alphabet = new char[26];
		
		char lowerCase = 97;
		
		for(int i = 0; i<26; i++) {
			alphabet[i] = lowerCase; 
			lowerCase++;
		}
		
		String[] ageOne = (age+"").split(""); 
		
		for(int i=0; i<ageOne.length; i++) {
			int num = Integer.parseInt(ageOne[i]);
			answer += alphabet[num];
		}
		
        return answer;
    }
}