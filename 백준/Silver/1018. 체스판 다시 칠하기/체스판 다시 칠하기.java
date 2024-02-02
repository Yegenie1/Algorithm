import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char[][] board = new char[n][m];
        int min = m*n;
        for (int i = 0; i < n; i++) {
			String s = br.readLine();
			for (int j = 0; j < m; j++) {
				board[i][j] = s.charAt(j);
			}
		}
        
        for (int i = 0; i < n-7; i++) {
			for (int j = 0; j < m-7; j++) {
				min = Math.min(min, cal(i, j, board));
			}
		}
        System.out.println(min);
      
        br.close();
    
    }
    
    public static int cal(int x, int y, char[][] arr) {
		int count = 0;
		for (int i = x; i < x+8; i++) {
			for (int j = y; j < y+8; j++) {
				if (i % 2 == 0) {
					if (j % 2 == 0) {
						if (arr[i][j] == 'W') {
							count++;
						}
					}else {
						if (arr[i][j] == 'B') {
							count++;
						}
					}
				}else {
					if (j % 2 == 0) {
						if (arr[i][j] == 'B') {
							count++;
						}
					}else {
						if (arr[i][j] == 'W') {
							count++;
						}
					}
				}
			}
		}
	    count = Math.min(count, 64-count);
		return count;
	}
}