class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        
        String[] str2 = my_string.split("");
        String[] str1 = new String[str2.length];
       
        for(int i = 0; i < str1.length; i++) {
            str1[i] ="";
            for( int j = i; j<str1.length; j++){
                str1[i] += str2[j];
            }      
        }
        
        for(int i = 0; i < str1.length; i++) {
            if(str1[i].equals(is_suffix)){
                answer = 1;
                break;
            }
        }
        
        return answer;
    }
}