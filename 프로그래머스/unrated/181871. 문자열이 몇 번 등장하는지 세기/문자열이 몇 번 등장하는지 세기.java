class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;

		String[] str = myString.split("");

		for (int i = 0; i < str.length; i++) {
			String str1 = "";
			for (int j = i; j < str.length; j++) {
				str1 += str[j];
				if (str1.equals(pat)) {
					answer++;
				}
			}

		}

		return answer;
    }
}