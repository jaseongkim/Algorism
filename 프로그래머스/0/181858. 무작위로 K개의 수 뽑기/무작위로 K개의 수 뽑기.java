import java.util.Arrays;
import java.lang.Math;


class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        
        int[] distinctArr = Arrays.stream(arr)
            .distinct()
            .toArray();
        
        int n = k - distinctArr.length;
        
        if(n <  0 ) {
            answer = Arrays.copyOf(distinctArr, distinctArr.length - Math.abs(n));
        } else if(n > 0) {
            answer = Arrays.copyOf(distinctArr,k);
            for(int i = k-n; i<k; i++){
                answer[i] = -1;
            }
        } else if(n == 0) {
            answer = distinctArr;
        }
        
        return answer;
    }
}