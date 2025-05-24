class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
		int answer = schedules.length;
        int[] timeSet = timeSet(schedules);

        for (int j = 0; j < schedules.length; j++) {
            for (int i = 0; i < 7; i++) {
                int weekday = (startday + i - 1) % 7 + 1;
                if (weekday >= 6) continue;

                if (timelogs[j][i] > timeSet[j]) {
                    answer--;
                    break;
                }
            }
        }
        return answer;
    }

    static int[] timeSet(int[] schedules) {
        int[] newSet = new int[schedules.length];
        for (int i = 0; i < schedules.length; i++) {
            int h = schedules[i] / 100;
            int m = schedules[i] % 100 + 10;
            if (m >= 60) {
                h++;
                m -= 60;
            }
            newSet[i] = h * 100 + m;
        }
        return newSet;
    }
}