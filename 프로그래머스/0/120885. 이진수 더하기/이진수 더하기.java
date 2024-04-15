import java.lang.Math;

class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        
        String[] binOne = bin1.split("");
        String[] binTwo = bin2.split("");
        
        int length1 = bin1.length();
        int length2 = bin2.length();
        
        double num = 0;
        
        for(int i = 0; i<length1; i++){
            if(binOne[i].equals("1")){
                num += Math.pow(2, (length1-1) - i); 
            }
        }
        
        for(int i = 0; i<length2; i++){
            if(binTwo[i].equals("1")){
                num += Math.pow(2, (length2-1) - i); 
            }
        }
        
        
        answer = Integer.toBinaryString((int)num);
        
        
        return answer;
    }
}