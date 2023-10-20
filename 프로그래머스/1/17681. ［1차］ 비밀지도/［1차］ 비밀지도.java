class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        
		String[] answer = new String[n];
		
		for (int i = 0; i < n; i++) {
			StringBuilder row = new StringBuilder();
			String bi1 = Integer.toBinaryString(arr1[i]);
			String bi2 = Integer.toBinaryString(arr2[i]);
			
			String[] s1 = addZero(bi1, n);
			String[] s2 = addZero(bi2, n);
			
			for (int j = 0; j < n; j++) {
				if ("1".equals(s1[j]) || "1".equals(s2[j])) {
					row.append("#");
				}else {
					row.append(" ");
				}
			}
			
			answer[i] = row.toString();
		}
        return answer;

	}
	public String[] addZero(String s, int n) {
		if (s.length() < n) {
			String zero = "";
			for (int i = 0; i < n - s.length(); i++) {
				zero += "0";
			}
			s = zero + s;
		}
		return s.split("");
		
	}
    
}