import java.util.*;

class Solution {
    public int[] solution(String s) {
        String[] arr = s.split("}");
		int[] answer = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i].substring(2);
		}
		
		Arrays.sort(arr, Comparator.comparingInt(String::length));
		List<Integer> list = new ArrayList<>();

		for (String x : arr) {
			String[] temp = x.split(",");
			
			for (int i = 0; i < temp.length; i++) {
				int n = Integer.parseInt(temp[i]);
				if (!list.contains(n)) {
					list.add(n);
				}
			}
		}
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
        return answer;
    }
}