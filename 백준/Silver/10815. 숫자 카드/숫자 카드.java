import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] card = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
			card[i] = Integer.parseInt(st.nextToken());
		}
        Arrays.sort(card);
        
        int m = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
			int num = Integer.parseInt(st.nextToken());
			sb.append(binarySearch(card, n, num)).append(" ");
		}
        
        System.out.println(sb);
        br.close();
    }
    
    public static int binarySearch(int[] cards, int N, int search) {
        int first = 0;
        int last = N - 1;
        int mid = 0;
 
        while (first <= last) {
            mid = (first + last) / 2;
 
            if (cards[mid] == search) {
                return 1;
            }
 
            if (cards[mid] < search) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
 
        return 0;
    }
}