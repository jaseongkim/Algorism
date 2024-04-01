class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        
        int a = slicer[0];
        int b = slicer[1];
        int c = 1;
        
        if(n == 1) {
            a = 0;
        } else if(n == 2) {
            b = num_list.length - 1;
        } else if (n == 4) {
            c = slicer[2];
        }
        
        int size = ((b-a) / c) +1;
        answer = new int[size];
        
        int j = 0;
        for(int i = a; i<=b; i+=c) {
            answer[j] = num_list[i];
            j++;
        }
        
        
        return answer;
    }
}