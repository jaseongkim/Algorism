class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String[] str = Integer.toString(order).split("");
        
        for(int i = 0; i< str.length; i++){
            int num = Integer.parseInt(str[i]);
            if( num == 0) {
                continue;
            } else {
                if(num % 3 == 0){
                answer +=1;
            }
            }
            
        }
        
        
        
        return answer;
    }
}