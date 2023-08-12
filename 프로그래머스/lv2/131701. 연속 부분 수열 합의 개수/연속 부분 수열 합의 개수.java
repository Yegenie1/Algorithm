import java.util.HashSet;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        HashSet<Integer> set = new HashSet<>();
		int length = elements.length;
		for (int i = 1; i <= length; i++) {
			for (int j = 0; j < length; j++) {
				int sum = 0;
				for (int k = 0; k < i; k++) {
					int index = (j+k) % length;
					sum += elements[index];
				}
				set.add(sum);
			}
		}
		answer = set.size();
        return answer;
    }
}