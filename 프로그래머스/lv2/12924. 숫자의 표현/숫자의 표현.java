class Solution {
    public int solution(int n) {
        int sum = 0;
		int answer = 0;
		int j = 0;
		for (int i = 1; i <= n*n; i++) {
			if (sum == n) {
				answer++;
				sum = 0;
				j++;
				i = j;
			}else if (sum > n) {
				sum = 0;
				j++;
				i = j;
				
			}else if (sum < n) {
				sum += i;
			}
            if (i == n) {
				answer++;
				break;
			}
		}
        return answer;
    }
}