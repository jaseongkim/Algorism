import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i<intStrs.length; i++){
            
            int num = Integer.parseInt(intStrs[i].substring(s,s+l));
            
            if(num > k) {
                list.add(num);
                System.out.println(num);
            }
        }
        
        answer = new int[list.size()];
        
        int size = 0;
        
        for(int num : list){
            answer[size] = num;
            size++;
        }
        
        
        
        
        
        return answer;
    }
}