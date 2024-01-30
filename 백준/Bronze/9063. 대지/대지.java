import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[] arrX = new int[n];
        int[] arrY = new int[n];
        
        if (n < 2) {
			System.out.println(0);
		}else {
			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				
				arrX[i] = x;
				arrY[i] = y;
				
			}
			int maxX = arrX[0], minX = arrX[0];
			int maxY = arrY[0], minY = arrY[0];
			for (int i = 1; i < n; i++) {
				maxX = Math.max(maxX, arrX[i]);
				minX = Math.min(minX, arrX[i]);
				maxY = Math.max(maxY, arrY[i]);
				minY = Math.min(minY, arrY[i]);
			}
			System.out.println((maxX-minX)*(maxY-minY));
		}
        
        
        br.close();
	}
}