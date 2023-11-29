class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        boolean[] wall = new boolean[n+1];
		
		for (int i = 0; i < section.length; i++) {
			wall[section[i]] = true;
		}
		for (int i = 0; i < wall.length; i++) {
			if (wall[i] == true) {
				if (i+m-1 > n) {
					answer++;
					break;
				}else {
					i = i+m-1;
				}
				answer++;
			}
		}
        return answer;
    }
}