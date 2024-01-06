
import java.util.Arrays;

class Solution {
    public long solution(long n) {
       	long answer = 0;

		String[] str = (n+"").split("");
		
		Arrays.sort(str);
		
		String num = "";
		
		
		for(int i=str.length-1; i>=0; i--) {
			num += str[i];
		}
		
		answer = Long.parseLong(num);
		
        return answer;
    }
}