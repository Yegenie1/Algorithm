import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = 2;
        int n = Integer.parseInt(br.readLine());
        while(n > 1) {
        	if (n % i == 0) {
        		n /= i;
				System.out.println(i);
				continue;
			}else {
				i++;
			}
        }
        
        br.close();
	}
}