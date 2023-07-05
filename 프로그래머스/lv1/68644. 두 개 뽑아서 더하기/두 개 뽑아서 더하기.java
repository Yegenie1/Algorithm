import java.util.*;

class Solution {
    public Object[] solution(int[] numbers) {
		HashSet<Integer> set = new HashSet<>();
		
		for (int i = 0; i < numbers.length-1; i++) {
			for (int j = i; j < numbers.length-1; j++) {
				set.add(numbers[i]+numbers[j+1]);
			}
		}
		
		Object[] answer = set.toArray();
        Arrays.sort(answer);
        return answer;
    }
}