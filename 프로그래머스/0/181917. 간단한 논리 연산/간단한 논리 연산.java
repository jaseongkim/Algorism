class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = false; 
        
        boolean first = true;
        
        boolean second = true;
        
        if(x1 == false && x2 == false) {
            first = false;
        }
        
        if(x3 == false && x4 == false) {
            second = false;
        }
        
        if(first == true && second == true){
            answer = true;
        }
        
        return answer;
    }
}