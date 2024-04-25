import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] sList = s.split(" ");
        
        int[] nList = new int[sList.length];
        
        for(int i = 0; i<sList.length; i++){
            nList[i] = Integer.parseInt(sList[i]);
        }
        
        
        int max = Arrays.stream(nList)
                        .max()
                        .orElse(0);
        
        int min = Arrays.stream(nList)
                        .min()
                        .orElse(0);
        
        answer = min + " " + max;
        
        return answer;
    }
}