class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for(int q=0; q<myString.length(); q++){
        	if(myString.charAt(q) < 'l') {
        		myString = myString.replace(myString.charAt(q), 'l');
        	}
        }
        
        answer = myString;
        
        return answer;
    }
}