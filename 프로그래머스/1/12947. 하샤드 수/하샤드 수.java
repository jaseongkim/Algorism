class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        
        String[] str = (x+"").split("");
        
        int y = 0;
        for(int i = 0; i<str.length; i++){
            y += Integer.parseInt(str[i]);
        }
        if(x % y == 0){
            answer = true;
        }
        
        
        return answer;
    }
}