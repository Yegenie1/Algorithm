import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int count = 0;
	static int k = 0;
	static int answer = -1;
	static int[] tmp;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		int[] A = new int[n];
		tmp = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		merge_sort(A, 0, n-1);
		System.out.println(answer);
		br.close();
	}
	public  static void merge_sort(int[] A, int p, int r) {
		if (p < r) {
			int q = (p+r)/2;
			merge_sort(A, p, q);
			merge_sort(A, q+1, r);
			merge(A, p, q, r);
		}
	}
	public static void merge(int[] A, int p, int q, int r) {
		int i = p;
		int j = q+1;
		int t = 0;
		while(i <= q && j <= r) {
			if (A[i] <= A[j]) {
				tmp[t++] = A[i++];
			}else {
				tmp[t++] = A[j++];				
			}
		}
		while(i <= q) {
			tmp[t++] = A[i++];
		}
		while(j <= r) {
			tmp[t++] = A[j++];
		}
		i = p;
		t = 0;
		while(i <= r) {
			count++;
			if (k == count) {
				answer = tmp[t];
				break;
			}
			A[i++] = tmp[t++];
		}
	}
}
