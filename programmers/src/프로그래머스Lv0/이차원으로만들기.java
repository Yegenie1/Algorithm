package 프로그래머스Lv0;

public class 이차원으로만들기 {

	public static void main(String[] args) {
		int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
		int n = 2;
		int[][] answer = new int[num_list.length/n][n];
		for (int i = 0; i < num_list.length; i++) {
			answer[i/n][i%n] = num_list[i];
		}
		for (int i = 0; i < answer.length; i++) {
			for (int j = 0; j < answer.length; j++) {
				System.out.print(answer[i][j]);
			}
			System.out.println();
		}
		

	}

}
