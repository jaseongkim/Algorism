class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int numA = i; numA<= j; numA++){
            String[] str = (""+numA).split("");
            for(int numB = 0; numB<str.length; numB++){
                if(str[numB].equals(""+k)){
                    answer += 1;
                }
            }
        }
        
        
        
        
        return answer;
    }
}