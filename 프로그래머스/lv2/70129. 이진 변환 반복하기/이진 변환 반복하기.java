class Solution {
    public int[] solution(String s) {
        int[] answer = {0,0};
		
		while (!s.equals("1")) {
			int afterRemove = 0;
			String[] arr = s.split("");
			for (int i = 0; i < arr.length; i++) {
				if (arr[i].equals("0")) {
					answer[1]++;
				}else {
					afterRemove++;
				}
			}
			s = Integer.toBinaryString(afterRemove);
			answer[0]++;
		}
        return answer;
    }
}