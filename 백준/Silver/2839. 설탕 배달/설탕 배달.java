import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int bag = 0;
        int i = 0;
        while(true){
        	int temp = n - 3 * i;
            if (temp < 0) {
                System.out.println(-1);
                break;
            }
            if (temp % 5 == 0) { 
                bag = i + temp / 5;
                System.out.println(bag);
                break;
            }
        	i++;
        }
        
        br.close();
    
    }
}