import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
		
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i <= 9; i++) {
			list.add(i);
		}
		for (int i = 0; i < numbers.length; i++) {
			if (list.contains(numbers[i])) {
				list.remove(list.indexOf(numbers[i]));
			}
		}
		for (int i = 0; i < list.size(); i++) {
			answer += list.get(i);
		}
        return answer;
    }
}