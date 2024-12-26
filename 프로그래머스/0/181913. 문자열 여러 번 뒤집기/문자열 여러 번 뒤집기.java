class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        
        for(int i = 0; i<queries.length; i++){
            
            String front = "";
            String back = "";
            String mid = "";
            
            String full = "";
            
            if(queries[i][0] != 0) {
                front = my_string.substring(0,queries[i][0]);
                
            }
        
            mid = my_string.substring(queries[i][0], queries[i][1]+1);
            
            
            if(queries[i][1] != my_string.length()){
                back = my_string.substring(queries[i][1]+1);
                
            }
            my_string = "";
            
            StringBuffer str = new StringBuffer(mid);
            
            my_string = front + str.reverse() + back;
            
            front = "";
            back="";
            mid = "";
           
        }
        answer = my_string;
        return answer;
    }
}