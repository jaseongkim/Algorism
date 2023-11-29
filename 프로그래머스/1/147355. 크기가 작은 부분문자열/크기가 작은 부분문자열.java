class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        int cnt = (t.length() - p.length()) + 1;

        String[] str = new String[cnt];
           
        for(int i = 0; i<t.length(); i++){
            if((i+(p.length()-1)) > t.length()-1 ){
                break;
            }
            str[i]="";
            for( int j = i; j<= i+(p.length()-1); j++){
                str[i] += t.charAt(j);
            }
        }
        long numB = Long.parseLong(p);
        for(int i = 0; i < str.length; i++){
            Long numA = Long.parseLong(str[i]);
            if(numA <= numB) {
                 answer += 1;
            }
        }
        
        return answer;
    }
}