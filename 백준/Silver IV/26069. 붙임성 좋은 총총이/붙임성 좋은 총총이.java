import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Set<String> set = new HashSet<String>();
		int n = Integer.parseInt(br.readLine());
		int seq = 0;
		set.add("ChongChong");
		for (int i = 0; i < n - seq; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String a = st.nextToken();
			String b = st.nextToken();
			if (set.contains(a)) {
				set.add(b);
			}else if(set.contains(b)){
				set.add(a);
			}
		}
		System.out.println(set.size());
		br.close();
	}
}
