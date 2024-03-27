import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        
            ArrayList<Integer> list = new ArrayList<>();
	        
	        
	        for(int i = 0; i<arr.length; i++) {
	            if(flag[i] == true) {
	                for(int j = 0; j<arr[i]*2; j++){
	                    list.add(arr[i]);
	                }
	            } else if(flag[i] == false) {
	                for(int j = 0; j<arr[i]; j++)
	                {        
	                	list.remove(list.size()-1);
	                }
	            }
	        }
	        
	    
	         answer = list.stream().mapToInt(Integer::intValue).toArray();
	        
	        
	        return answer;
    }
}