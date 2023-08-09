class Solution {
    public int solution(int M, int N) {
        int answer = 0;
        int x = Math.max(M, N);
		int y = Math.min(M, N);
		answer = (y - 1) + y * (x - 1);
        return answer;
    }
}