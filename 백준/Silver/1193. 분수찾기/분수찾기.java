import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int x = Integer.parseInt(br.readLine());
        int i = 1;
        int pre = 0;
        
        while((pre + i) < x) {
			pre += i++;
        }
	    if (i % 2 !=0) {
	    	System.out.println((i -(x - pre - 1)) + "/" + (x - pre));			
		}else {
			System.out.println((x - pre) + "/" + (i -(x - pre - 1)));						
		}
        
        br.close();
    }
}