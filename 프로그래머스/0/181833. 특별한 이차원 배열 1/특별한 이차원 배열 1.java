class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        for(int i = 0; i<n; i++) {
            for(int j=0; j<i+1; j++) {
                if(i == j) {
                    answer[i][j] = 1;
                }
            }
        }
        
        return answer;
    }
}