import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] card = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
			card[i] = Integer.parseInt(st.nextToken());
		}
        Arrays.sort(card);
        
        int m = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
			int num = Integer.parseInt(st.nextToken());
			if (Arrays.binarySearch(card, num) < 0) {
				sb.append(0).append(" ");
			}else {
				sb.append(1).append(" ");
			}
		}
        
        System.out.println(sb);
        br.close();
    }
}