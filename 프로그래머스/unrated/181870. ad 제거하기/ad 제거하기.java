class Solution {
    public String[] solution(String[] strArr) {
       String[] answer = {};

		int cnt = 0;
		for (int i = 0; i < strArr.length; i++) {
			if (!strArr[i].contains("ad")) {
				cnt++;
			}
		}
		
		answer = new String[cnt];
		
		for (int i = 0,j = 0; i < strArr.length; i++, j++) {
			if(strArr[i].contains("ad")) {
				j--;
				continue;
			}
			answer[j]=strArr[i];	
		}
        return answer;
    }
}