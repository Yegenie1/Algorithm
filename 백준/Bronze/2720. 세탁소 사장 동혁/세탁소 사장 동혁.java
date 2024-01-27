import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int q, d, n, p = 0;
        for (int i = 0; i < N; i++) {
			int c = Integer.parseInt(br.readLine());
			q = c / 25;
			c %= 25;
			d = c / 10;
			c %= 10;
			n = c / 5;
			c %= 5;
			p = c;
			System.out.println(q + " " + d + " " + n + " " + p);
		}
        br.close();
    }
}