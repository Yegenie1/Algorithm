import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        int n = Integer.parseInt(br.readLine());
        int[] tree = new int[n];
        tree[0] = Integer.parseInt(br.readLine());
        int gcd = 0;
        for (int i = 1; i < n; i++) {
			tree[i] = Integer.parseInt(br.readLine());
			gcd = gcd(tree[i] - tree[i-1], gcd);
        }
        
        int addTree = (tree[n-1]-tree[0]) / gcd - n +1;
        System.out.println(addTree);
        br.close();
    }
    
    public static int gcd(int a, int b) {
    	if (b == 0) {
			return a;
		}
    	return gcd(b, a % b);
    }
}