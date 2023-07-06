class Solution {
    public int solution(int n) {
        int answer = n;
		int nOne = Integer.bitCount(n);
		
		while (true) {
			int answerOne = Integer.bitCount(++answer);
			if (nOne == answerOne) {
				break;
			}
		}
        return answer;
    }
}