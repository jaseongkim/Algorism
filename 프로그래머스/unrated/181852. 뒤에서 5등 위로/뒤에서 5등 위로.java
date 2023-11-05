import java.util.Arrays;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer;
        
        Arrays.sort(num_list);
        
        int cnt = 0;
        for(int i=5; i<num_list.length; i++){
            cnt++;
        }
        
        answer = new int[cnt];
        
        for(int i=5, j=0; i<num_list.length; i++,j++){
            answer[j] = num_list[i];
        }
        
        
        return answer;
    }
}