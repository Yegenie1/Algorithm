import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine().toUpperCase();
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
		}
		int max = Collections.max(map.values());
		int cnt = 0;
        char ch = '?';
        for(Entry<Character, Integer> tmpMap : map.entrySet()) {
            if(tmpMap.getValue().equals(max)) {
                cnt++;
                ch = tmpMap.getKey();
            }
        }
        System.out.print(cnt > 1 ? '?' : ch);
		br.close();
	}

}