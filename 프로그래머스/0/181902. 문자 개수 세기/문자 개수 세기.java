class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        for(int i = 0; i<my_string.length(); i++){
            int ascii = my_string.charAt(i);
            
            if(ascii >= 97) {
                answer[ascii - 71]++;
            } else {
                answer[ascii - 65]++;
            }
        }
        return answer;
    }
}