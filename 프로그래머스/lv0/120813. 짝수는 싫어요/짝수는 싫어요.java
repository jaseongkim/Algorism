class Solution {
    public int[] solution(int n) {
        
        int num=0;
        
        for(int i = 1; i<=n;  i++){
            if(i % 2 == 1) {
                num++;              
            }
        }
        
        int[] answer = new int[num];
        int num2 = 0;
        for(int i = 1; i<=n;  i++){
            if(i % 2 == 1) {
                for(int j = num2; j<num2+1; j++){
                    answer[j] = i;
                }
                num2++;
            }
        }
        return answer;
    }
}