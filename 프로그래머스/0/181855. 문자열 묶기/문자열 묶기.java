class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        
        int[] cnt = new int[30];
        
        for(int i = 0; i<strArr.length; i++){
            cnt[strArr[i].length()-1] += 1;
        }
        
        for(int i = 0; i<cnt.length; i++){
            if(answer < cnt[i]){
                answer = cnt[i];
            }
        }
        
        
        return answer;
    }
}