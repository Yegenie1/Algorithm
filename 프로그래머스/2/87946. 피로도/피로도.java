class Solution {
    public static boolean[] visited;
	public static int answer;
    
    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
		dfs(0, k, dungeons);
        return answer;
    }
    public static void dfs(int depth, int k, int[][] dungeons) {
		for (int i = 0; i < dungeons.length; i++) {
			//방문하지 않은 상태면서 k가 최소피로도보다 크거나 같은 경우
			if (!visited[i] && dungeons[i][0] <= k) {
				visited[i] = true;
				dfs(depth + 1, k - dungeons[i][1], dungeons);
				visited[i] = false;
			}
		}
		
		answer = Math.max(answer, depth);
	}
}