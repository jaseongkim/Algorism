import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        ArrayList<Integer> list = new ArrayList<>();
    
        for(int i = 0; i<arr.length; i++) {
            if(arr[i] == 2) {
                list.add(i);
            }
        }
        
        if(list.size() == 0) {
            answer = new int[1];
            answer[0] = -1;
            return answer;
        } 
        
        int lastNum = list.size() - 1;
        int size = (list.get(lastNum) - list.get(0)) + 1; 
        
        answer = new int[size];
        
        int j = 0;
        
        for(int i = list.get(0); i<=list.get(lastNum); i++){
            answer[j] = arr[i];
            j++;
        }
        
        return answer;
    }
}