class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        for (int i = 0; i < A.length(); i++) {
			if (A.equals(B)) {
				break;
			}else {
				String temp = A.substring(A.length()-1);
				String sub = A.substring(0, A.length()-1);
				A = temp + sub;
				System.out.println(A);
				answer++;
			}
			
		}
		if (answer == A.length()) {
			answer = -1;
		}
        return answer;
    }
}