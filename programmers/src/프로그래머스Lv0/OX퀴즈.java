package 프로그래머스Lv0;

public class OX퀴즈 {

	public static void main(String[] args) {
		String[] quiz = {"3 - 4 = -3", "5 + 6 = 11"};
		String[] answer = new String[quiz.length];
		String[][] arr = new String[quiz.length][5];
		for (int i = 0; i < answer.length; i++) {
			arr[i] = quiz[i].split(" "); 
		}
		int num = 0;
		for (int i = 0; i < arr.length; i++) {
			int left = Integer.parseInt(arr[i][0]);
			int right = Integer.parseInt(arr[i][2]);
			int ans = Integer.parseInt(arr[i][4]);
			System.out.println(arr[i][1]);
			if (arr[i][1].equals("+")) {
				if (left+right == ans) {
					answer[i] = "O";
					System.out.println(1);
				}else {
					answer[i] = "X";System.out.println(2);
				}
			}else if(arr[i][1].equals("-")){
				if (left-right == ans) {
					answer[i] = "O";System.out.println(3);
				}else {
					answer[i] = "X";System.out.println(4);
				}
			}
			
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(answer[i]);
		}
		

	}

}
