import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i<arr.length; i++){
            if(list.size() == 0) {
                list.add(arr[i]);
                continue;
            }    
            else if(list.size() != 0) {
                if(list.get(list.size()-1) == arr[i] ){
                    list.remove(list.size()-1);
                continue;
                }
                if(list.get(list.size()-1) != arr[i] ){
                    list.add(arr[i]);
                continue;
                }
            }
            
        }
        
        if(list.size() == 0) {
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        
        answer = new int[list.size()];
        
        int i = 0;
        
        for(int num : list) {
            answer[i] = num;
            i++;
        }
        
        
        return answer;
    }
}