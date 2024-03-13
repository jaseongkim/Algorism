import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        
        ArrayList<Integer> list = new ArrayList<Integer>(); 
         
        while(n != 1) {
            if(n % 2 == 0) {
                list.add(n);
                n /= 2;
            } else if( n % 2 != 0) {
                list.add(n);
                n = 3 * n + 1;
            }
            if( n == 1) {
                list.add(n);
            }
        }
        
        answer = new int[list.size()];
        
        for(int i = 0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        
        return answer;
    }
}