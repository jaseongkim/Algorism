import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        Arrays.sort(numbers);
        
        int num = numbers.length;
        
        answer = numbers[num-2] * numbers[num-1];
        
        return answer;
    }
}