import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
			long a = Long.parseLong(br.readLine());
			while(true) {
				if (isPrime(a)) {
					sb.append(a).append('\n');	
					break;
				}else {
					a++;
				}
			}
		}
        System.out.println(sb);
        br.close();
    }
    
    public static boolean isPrime (long a){
        
        if(a < 2) return false;
        
        for(int i = 2; i <= Math.sqrt(a); i++){
            if(a % i == 0){
                return false;
            }
        }
        return true;
    }
}