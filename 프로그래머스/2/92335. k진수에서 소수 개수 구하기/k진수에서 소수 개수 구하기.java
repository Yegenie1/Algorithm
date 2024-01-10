class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        String st = Integer.toString(n, k);
        String[] P = st.split("0");
        long[] number = new long[P.length];
        
        for (int i = 0; i < P.length; i++) {
        	if (P[i].equals("")) {
				continue;
			}
			number[i] = Long.parseLong(P[i]);
		}
        
        boolean isPrime = true;
        
        for (int i = 0; i < number.length; i++) {
			if (number[i] >= 2) {
				for (int j = 2; j <= Math.sqrt(number[i]); j++) {
					if (number[i] % j == 0) {
						isPrime = false;
						break;
					}
				}
				if (isPrime) {
					answer++;
				} 
			}
		}
        return answer;
    }
}