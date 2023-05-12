package 프로그래머스Lv0;

public class 합성수찾기 {

	public static void main(String[] args) {
		int n = 10;
		int answer=0;
		int count = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n; j++) {
				if (i*j==n) {
					count++;
				}
			}
		}
		answer = n-count;
		System.out.println(answer);

	}

}
