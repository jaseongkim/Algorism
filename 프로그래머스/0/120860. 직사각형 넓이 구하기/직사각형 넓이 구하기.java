class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
       
        int[] x = new int[]{dots[0][0],dots[1][0],dots[2][0],dots[3][0]};
        int[] y = new int[]{dots[0][1],dots[1][1],dots[2][1],dots[3][1]};
        
        int maxX = x[0];
        int minX = x[0];
        
        int maxY = y[0];
        int minY = y[0];
        
        for(int i = 0; i< x.length; i++) {
            if(maxX < x[i]){
                maxX = x[i];
            }
            if(minX > x[i]){
                minX = x[i];
            }
            if(maxY < y[i]){
                maxY = y[i];
            }
            if(minY > y[i]){
                minY = y[i];
            }
            
        }
       
        answer = (maxX-minX) * (maxY-minY);
        
        return answer;
    }
}