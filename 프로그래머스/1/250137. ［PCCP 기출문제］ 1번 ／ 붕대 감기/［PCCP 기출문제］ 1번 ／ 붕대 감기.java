class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int maxHealth = health;
		int maxTime = attacks[attacks.length-1][0];
		int attacksCnt = 0;
		int seqHeal = 0;
		int answer = -1;
		
		for (int i = 0; i < maxTime+1; i++) {

			if(i == attacks[attacksCnt][0]) {
				health -= attacks[attacksCnt][1];
				attacksCnt++;
				seqHeal = 0;
			}else {
				health = Math.min(maxHealth, health + bandage[1]);
				seqHeal++;
				if (seqHeal == bandage[0]) {
					health = Math.min(maxHealth, health + bandage[2]);
                    seqHeal = 0;
				}
			}
            
            answer = health;
            
            if(health <= 0) {
                answer = -1;
				break;
			}
		}
        
        return answer;
    }
}