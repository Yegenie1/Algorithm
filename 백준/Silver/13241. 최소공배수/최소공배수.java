import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		StringTokenizer st = new StringTokenizer(br.readLine());
		Long a = Long.parseLong(st.nextToken());
		Long b = Long.parseLong(st.nextToken());
		
		Long d = gcd(a, b);
		
		System.out.println(a*b /d);
        br.close();
    }
    public static long gcd(long a, long b) {
		if (b == 0 ) {
			return a;
		}
		return gcd(b, a % b);
	}
}