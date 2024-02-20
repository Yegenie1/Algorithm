import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[][] arr = new int[9][9];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 9; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		dfs(0, 0);
		br.close();
	}
	public static void dfs(int row, int col) {
		StringBuilder sb = new StringBuilder();
		if (col == 9) {
			dfs(row + 1, 0);
			return;
		}
		
		if (row == 9) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					sb.append(arr[i][j]).append(' ');
				}
				sb.append('\n');
			}
			System.out.println(sb);
			
			System.exit(0);
		}
		
		if (arr[row][col] == 0) {
			for (int i = 1; i <= 9; i++) {
				if (possibility(row, col, i)) {
					arr[row][col] = i;
					dfs(row, col + 1);
				}
			}
			arr[row][col] = 0;
			return;
		}
		
		dfs(row, col + 1);
	}
	
	public static boolean possibility(int row, int col, int val) {
		int set_row = (row / 3)*3;
		int set_col = (col / 3)*3;
		
		for (int i = 0; i < 9; i++) {
			if (arr[row][i] == val) {
				return false;
			}
			if (arr[i][col] == val) {
				return false;
			}
		}
		
		for (int i = set_row; i < set_row + 3; i++) {
			for (int j = set_col; j < set_col + 3; j++) {
				if (arr[i][j] == val) {
					return false;
				}
			}
		}
		return true;
	}
	
}