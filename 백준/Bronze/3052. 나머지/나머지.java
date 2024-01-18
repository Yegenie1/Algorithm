import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        int[] remainder = new int[10];
        
		for (int i = 0; i < 10; i++) {
			int A = Integer.parseInt(br.readLine());
			remainder[i] = A % 42;
		}
		
		HashSet<Integer> set = new HashSet<>();
        
		for (int i : remainder) {
			set.add(i);
		}
        
		System.out.println(set.size());
		
		br.close();
	}

}