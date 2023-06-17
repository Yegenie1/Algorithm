package 프로그래머스Lv0;

public class 칠의개수 {

	public static void main(String[] args) {
		int[] array = {7, 77, 17};
		int answer = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < array.length; i++) {
			sb.append(array[i]);
		}
		String[] arr = sb.toString().split("");
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("7")) {
				answer++;
			}
		}
		System.out.println(sb);
		System.out.println(answer);

	}

}
