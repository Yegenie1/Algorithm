package 프로그래머스Lv0;

public class 합성수찾기 {

	public static void main(String[] args) {
		int n = 10;
		int answer = 0;
		int count = 0;
		for (int i = 1; i <= n; i++) {
			count = 0;//count 초기화
			for (int j = 1; j <=i; j++) {
				if (i%j==0) {
					count++;
				}
			}
			if (count>=3) {
				answer++;
			}
		}
		System.out.println(answer);

	}

}
