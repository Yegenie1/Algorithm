import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st;
        List<Integer> list;
        StringBuilder sb;
        int sum = 0;
        
        while (true) {
			st = new StringTokenizer(br.readLine());
			sb = new StringBuilder();
			list = new ArrayList<Integer>();
			sum = 0;
			int n = Integer.parseInt(st.nextToken());
			
			if (n == -1) break;
			
			for (int i = 1; i < n; i++) {
				if (n % i == 0) {
					list.add(i);
					sum += i;
				}
			}
			if (sum == n) {
				sb.append(n +" = ");
				for (int i = 0; i < list.size(); i++) {
					sb.append( list.get(i) + " + ");
				}
				sb.delete(sb.length()-3, sb.length());
				System.out.println(sb);
			}else {
				System.out.println(n + " is NOT perfect.");
			}
		}
		br.close();
    }
}