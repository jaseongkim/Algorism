 import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        String answer = "";

        BigInteger numA = new BigInteger(a);
        BigInteger numB = new BigInteger(b);
    
        answer = (numA.add(numB)) + "";
        
        return answer;
    }
}