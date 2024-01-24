import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
         int[] answer = new int[commands.length];
	        
	        for(int i = 0; i<commands.length; i++){
	            int z = 0;
	            int num = (commands[i][1] - commands[i][0]) + 1;
	            int[] arrays = new int[num];
	            for(int j =  commands[i][0]-1; j<commands[i][1]; j++){
	                arrays[z] = array[j];
	                z++;
	            }
	            Arrays.sort(arrays);
	            answer[i] = arrays[commands[i][2]-1];
	        }
	    
	        return answer;
    }
}