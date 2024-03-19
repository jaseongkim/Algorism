class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        
        
        
        for(int i = 0; i<my_string.length(); i++){
            boolean flag = false;
            for(int j = 0; j<indices.length; j++) {
                if( i == indices[j]) {
                    flag = true;
                    break;
                }
            }
            if(!flag){
                answer += my_string.charAt(i);
                flag = false;
            } 
        }
        
        return answer;
    }
}