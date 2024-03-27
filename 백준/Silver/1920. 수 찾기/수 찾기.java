import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static int[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			int num = Integer.parseInt(st.nextToken());
			if (binarySearch(num) >= 0) {
				System.out.println(1);
			}else {
				System.out.println(0);
			}
		}
		br.close();
	}
	public static int binarySearch(int key) {
		int low = 0;
		int high = arr.length-1;
		
		while(low <= high) {
			int mid = (low+high)/2;
			
			if (key < arr[mid]) {
				high = mid - 1;
			}else if(key > arr[mid]) {
				low = mid + 1;
			}else {
				return mid;
			}
		}
		return -1;
	}
}