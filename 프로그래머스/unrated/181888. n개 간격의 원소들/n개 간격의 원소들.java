class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        
        int cnt = 0;
        
        for(int i = 0; i <num_list.length; i+=n){
            cnt += 1;
        }
        
        answer = new int[cnt];
        
         for(int i = 0,j =0; i <num_list.length && j < answer.length; j++,i+=n){
           answer[j] = num_list[i];
        }
        
        
        
        return answer;
    }
}