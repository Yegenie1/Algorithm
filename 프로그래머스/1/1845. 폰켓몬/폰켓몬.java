import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int max = nums.length/2;
		
		HashSet<Integer> set = new HashSet<>();
		for (int n : nums) {
			set.add(n);
		}

		if (max >= set.size()) {
			answer = set.size();
		}else {
			answer = max;
		}
        return answer;
    }
}