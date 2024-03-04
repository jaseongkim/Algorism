class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        
        String[] banana = my_string.split(""); 
        
        String str = "";
        
        
        for(int i = 0; i<banana.length; i++) {
            str += banana[i];
            if(str.equals(is_prefix)) {
                answer = 1;
                break;
            }
        }
        
        
        
        return answer;
    }
}