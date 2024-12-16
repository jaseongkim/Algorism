class Solution {
    public int[] solution(int[][] score) {
        double[] answer = new double[score.length];
        
        for(int i = 0; i<score.length; i++){
           answer[i]=(double)(score[i][0] + score[i][1])/2.0; 
        }
        
        int[] rank = new int[score.length];
        
        for(int i = 0; i<answer.length; i++) {
            rank[i] = 1;
            for(int j = 0; j<answer.length; j++) {
                if(i == j) continue;
                if(answer[i] < answer[j]) {
                    rank[i]++;
                }
                
            }
        }
        return rank;
    }
}