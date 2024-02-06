import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static boolean[] prime;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++){
			int count = 0;
			int n = Integer.parseInt(br.readLine());
			prime = new boolean[n+1];
			get_prime();
			for (int j = 2; j <= n/2; j++) {
				if (!prime[j] && !prime[n - j]) {
					count++;
				}
			}
			sb.append(count).append('\n');
		}
        System.out.println(sb);
        br.close();
    }
    
    public static void get_prime() {
    	prime[0] = prime[1] = true;
    	
    	for (int i = 2; i <= Math.sqrt(prime.length); i++) {
			if (prime[i])continue;
			for (int j = i*i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
    }
}