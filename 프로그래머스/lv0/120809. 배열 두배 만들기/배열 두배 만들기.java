class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = numbers;
        int[] result = new int[answer.length];
        
        for(int i = 0; i<answer.length; i++){
            result[i] = numbers[i] * 2;
        }
        
        
        
        return result;
    }
}