import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < n; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	String name = st.nextToken();
        	String note = st.nextToken();
        	if (note.equals("leave")) {
				map.remove(name);
			}else {
				map.put(name, 0);
			}
		}
        List<String> keySet = new ArrayList<String>(map.keySet());
        
        Collections.sort(keySet, (e1, e2)->{
        	return e2.compareTo(e1);
        });
        for (String key : keySet) {
			System.out.println(key);
		}
        
        br.close();
    }
}