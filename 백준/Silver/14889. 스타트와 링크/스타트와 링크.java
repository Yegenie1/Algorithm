import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] teamStart;
	static int[] teamLink;
	static int[][] arr;
	static int diff = 100;
	static int min = 100;
	static int n;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		teamStart = new int[n/2];
		teamLink = new int[n/2];
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		dfs(1, 0);
		System.out.println(min);
		
		br.close();
	}
	public static void dfs(int at, int depth) {
		if (depth == n/2) {
			int idx = 0;
	        for (int i = 1; i <= n; i++) {
	            if (!isPlayerInTeam(i, teamStart)) {
	                teamLink[idx++] = i;
	            }
	        }
			diff = Math.abs(teamScore(teamStart)-teamScore(teamLink));
			min = Math.min(diff, min);
			
			return;
		}
		
		for (int i = at; i <= arr.length; i++) {
			if (depth == 0 && i != 1) {
				break;
			}
			teamStart[depth] = i;
			dfs(i+1, depth + 1);
		}
	}
	public static boolean isPlayerInTeam(int player, int[] team) {
        for (int i = 0; i < team.length; i++) {
            if (team[i] == player)
                return true;
        }
        return false;
    }
	public static int teamScore(int[] team) {
		int score = 0;
		for (int i = 0; i < team.length; i++) {
			for (int j = i; j < team.length; j++) {
				score += arr[team[i]-1][team[j]-1] + arr[team[j]-1][team[i]-1];
			}
		}
		return score;
	}
	
}
