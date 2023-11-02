import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int days = 10;
		
		HashMap<String, Integer> wantMap = new HashMap<>();
		for (int i = 0; i < want.length; i++) {
			wantMap.put(want[i], number[i]);
		}
		for (int i = 0; i < discount.length - days + 1; i++) {
			HashMap<String, Integer> discountMap = new HashMap<>();
			for (int j = 0; j < days; j++) {
				discountMap.put(discount[i+j],discountMap.getOrDefault(discount[i+j], 0)+1);
			}
			Boolean isIdentical = true;
            
            for(String key : wantMap.keySet()){
                if(wantMap.get(key) != discountMap.get(key)){
                    isIdentical = false;
                    break;
                }
            }
            
            answer += isIdentical ? 1 : 0;
		}
        return answer;
    }
}