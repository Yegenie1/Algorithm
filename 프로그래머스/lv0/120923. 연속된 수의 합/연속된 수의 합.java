class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
		int left = num/2 - 1;
		int center = num/2;
		int j = 0;
		int k = 0;
		if (num % 2 == 0) {
			
			for (int i = left; i < num; i++) {
				answer[i] = total / num + j;
				j++;
			}
			
			for (int i = left; i >= 0; i--) {
				answer[i] = total / num - k;
				k++;
			}
		}else{
			for (int i = center; i < num; i++) {
				answer[i] = total / num + j;
				j++;
			}
			for (int i = center; i >= 0; i--) {
				answer[i] = total / num - k;
				k++;
			}
		}
        return answer;
    }
}