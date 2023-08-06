class Solution {
    public int solution(int[] array) {
        int answer = array[0];
        int max = 0;
        int[] array2 = new int[1000];
        
        for(int i = 0; i< array.length; i++ ){
            array2[array[i]]++;
            
            if(max < array2[array[i]]){
                max = array2[array[i]];
                answer = array[i];
            }
        }
        
        int temp =0;
        for(int j=0; j<1000; j++){
            if(max == array2[j]) temp++;
            if(temp > 1) answer = -1;
        }
        
        
        return answer;
    }
}