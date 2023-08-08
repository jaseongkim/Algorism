class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
for (int i = 1; i < 100; i++) {
			if (n == 1) {
				answer = 1;
			}

			else if ((slice * i) / n == 1) {
				answer = i;
				break;
			}
		}
        return answer;
    }
}