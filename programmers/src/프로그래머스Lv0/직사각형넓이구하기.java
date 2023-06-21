package 프로그래머스Lv0;

public class 직사각형넓이구하기 {
	public static void main(String[] args) {
		int[][] dots = {{1,1},{2,1},{2,2},{1,2}};
		int answer = 0;
		int x = dots[0][0];
		int y = dots[0][1];
		int w = 0;
		int h = 0;
		for (int i = 0; i < dots.length; i++) {
			if (x != dots[i][0]) {
				w = Math.abs(x - dots[i][0]);
			}
			if (y != dots[i][1]) {
				h = Math.abs(y - dots[i][1]);
			}
		}
		answer = w * h;
		System.out.println(answer);
	}

}
