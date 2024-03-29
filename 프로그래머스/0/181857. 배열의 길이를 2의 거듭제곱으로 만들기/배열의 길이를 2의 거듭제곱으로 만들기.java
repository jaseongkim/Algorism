import java.util.ArrayList;
import java.lang.Math;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i<arr.length; i++) {
            list.add(arr[i]);
        }

        int powSize = 0;
        int size = list.size();
        
        for(int i = 0; i<11; i++) {
            if(size <= Math.pow(2,i)) {
                powSize = (int)Math.pow(2,i);
                break;
            }
        }
        
        if(size == powSize) {
            return arr;
        } else {
            for(int i = 0; i<powSize - size; i++) {
                list.add(0);
            }
        }
        
        answer = new int[list.size()];
        
        for(int i = 0; i< list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}