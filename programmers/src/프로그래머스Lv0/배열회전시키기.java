package 프로그래머스Lv0;

public class 배열회전시키기 {

	public static void main(String[] args) {
		int[] numbers = {4, 455, 6, 4, -1, 45, 6};
		String direction = "right";
		int[] answer = new int[numbers.length];
		if (direction.equals("right")) {
			int temp = numbers[numbers.length-1];
			for (int i = 0; i < answer.length-1; i++) {
				answer[i+1] = numbers[i];
			}
			answer[0] = temp;
		} else {
			int temp = numbers[0];
			for (int i = 0; i < answer.length-1; i++) {
				answer[i] = numbers[i+1];
			}
			answer[numbers.length-1] = temp;
		}
		
		for (int i : answer) {
			System.out.println(i);	
		}

	}

}
