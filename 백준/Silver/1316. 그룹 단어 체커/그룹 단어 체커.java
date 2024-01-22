import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		Set<Character> set;
		int count = N;
		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			set = new HashSet<Character>();
			char ch = s.charAt(0);
			set.add(ch);
			for (int j = 1; j < s.length(); j++) {
				if (ch == s.charAt(j)) {
					continue;
				}else {
					if (set.contains(s.charAt(j))) {
						count--;
						break;
					}else {
						ch = s.charAt(j);
						set.add(ch);
					}
				}
			}
		}
		
		System.out.println(count);
		br.close();
	}

}
