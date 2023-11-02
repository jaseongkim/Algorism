class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        
        int cnt = 0;
        for(int i=0; i<finished.length; i++){
            if(finished[i] == false){
                cnt++;
            }
        }
        
        answer = new String[cnt];
        
        int j = 0;
         for(int i=0; i<finished.length; i++){
            if(finished[i] == false){
                answer[j] = todo_list[i];
                j++;
            }
        }
        
        
        
        return answer;
    }
}