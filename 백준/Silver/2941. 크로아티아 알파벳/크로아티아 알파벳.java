import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		String[] alphabet = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		
		for (int i = 0; i < alphabet.length; i++) {
			if (s.contains(alphabet[i])) {
				s = s.replaceAll(alphabet[i], "a");
			}
		}
		System.out.println(s.length());
				
		br.close();
	}

}
