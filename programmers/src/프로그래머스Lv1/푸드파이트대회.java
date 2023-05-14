package 프로그래머스Lv1;

public class 푸드파이트대회 {
	public static void main(String[] args) {
		int[] food = {1, 3, 4, 6};
		String answer = "";
		StringBuilder foodSeq = new StringBuilder();
		for (int i = 1; i < food.length; i++) {
			for (int j = 0; j < food[i]/2; j++) {
				foodSeq.append(i);
			}
		}
		answer = foodSeq.toString()+"0"+foodSeq.reverse();
		System.out.println(foodSeq);
		System.out.println(answer);

	}
}
