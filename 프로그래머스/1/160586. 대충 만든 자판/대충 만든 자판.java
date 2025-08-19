import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        		int[] answer = new int[targets.length];
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (int i = 0; i < keymap.length; i++) {
			for (int j = 0; j < keymap[i].length(); j++) {
				if (map.containsKey(keymap[i].charAt(j))) {
					map.put(keymap[i].charAt(j), Math.min(j+1, map.get(keymap[i].charAt(j))));
				}else {
					map.put(keymap[i].charAt(j), j+1);
				}
				
			}
		}
		for (int i = 0; i < targets.length; i++) {
			int count = 0;
			for (int j = 0; j < targets[i].length(); j++) {
				if (!map.containsKey(targets[i].charAt(j))) {
					count = -1;
					break;
				}else {
					count += map.get(targets[i].charAt(j));
				}
			}
			answer[i] = count;
		}
        return answer;
    }
}