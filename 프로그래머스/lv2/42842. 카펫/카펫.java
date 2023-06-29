class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
		int sum = brown + yellow;
		
		for (int i = 3; i < sum; i++) {//yellow가 존재하기 위해서는 가로, 세로 3이상
			int j = sum / i;//sum의 약수 구하기
			
			if (sum % i == 0 && j >= 3) {
				int col = Math.max(i, j);//문제에서 가로가 더 길다고 했으므로 max
        int row = Math.min(i, j);//세로는 min
				int yellowArea = (col - 2) * (row - 2);
				
				if (yellowArea == yellow) {
					answer[0] = col;
					answer[1] = row;
					return answer;
				}
			}
		}
        
        return answer;
    }
}