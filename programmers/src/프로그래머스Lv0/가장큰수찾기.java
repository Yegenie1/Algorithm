package 프로그래머스Lv0;

public class 가장큰수찾기 {

	public static void main(String[] args) {
		int[] array = {1, 8, 3};
		int[] answer = new int[2];
		int max = 0;
		for (int i = 0; i < array.length-1; i++) {
			max = Math.max(array[i], array[i+1]);
			
		}
		for (int j = 0; j < array.length; j++) {
			if (array[j]==max) {
				answer[1] = j;
				break;
			}
		}
		answer[0] = max;
		
		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
		
		

	}

}
