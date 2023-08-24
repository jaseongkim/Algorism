class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        
        boolean bl = str1.toLowerCase().contains(str2.toLowerCase());
        
        if(bl == true){
            answer = 1;
        } else if(bl == false){
            answer = 2;
        }
        
        
        return answer;
    }
}