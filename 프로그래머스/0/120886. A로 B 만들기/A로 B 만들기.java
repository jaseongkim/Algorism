import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        String[] A = before.split("");
        
        String[] B = after.split("");
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i = 0; i<A.length; i++){
            if(!(A[i].equals(B[i]))) {
                answer = 0;
                return answer;
            }
        }
        return answer;
    }
}