
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
       int[] answer ={};
	        
	        
	        
	        List<Integer> list  = new ArrayList<>();
	        
	        for(int i = 0; i<arr.length; i++) {
	        	boolean flag = false;
	        	for(int j = 0; j<delete_list.length; j++) {
	        		if(arr[i] == delete_list[j]) {
	        			flag = true;
	        			continue;
	        		} 
	        	}
	        	if(flag == false) {
	        		list.add(arr[i]);
	        	}
	        }
	        
	        answer  = new int[list.size()];
	        
	        for(int i = 0; i<list.size(); i++){
	            answer[i] = (int) list.get(i);
	        }
	    
        return answer;
    
    }
}