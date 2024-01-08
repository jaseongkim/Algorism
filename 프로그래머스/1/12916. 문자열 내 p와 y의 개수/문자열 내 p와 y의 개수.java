class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int a = 0;
        int b = 0;
        
        String str = s.toLowerCase();
        
        for(int i =0; i< str.length(); i++){
            if(str.charAt(i) == 'p'){
                a+=1;
            } else if(str.charAt(i) == 'y'){
                b+=1;
            }
        }
        
        if(a != b) {
            answer = false; 
        }

        return answer;
    }
}