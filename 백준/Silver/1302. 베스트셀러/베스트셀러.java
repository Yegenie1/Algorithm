import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			map.put(s, map.getOrDefault(s, 0)+1);
		}
		
		List<String> keySet = new ArrayList<String>(map.keySet());
		Collections.sort(keySet,(e1,e2)->{
			if (map.get(e1) == map.get(e2)) {
				return e1.compareTo(e2);
			}
			return Integer.compare(map.get(e2), map.get(e1));
			
		});
		System.out.println(keySet.get(0));
		bw.flush();
		br.close();
	}
}