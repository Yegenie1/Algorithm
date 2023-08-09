class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int x = Math.max(n, m);
        int y = Math.min(n, m);
        while(x % y != 0){
            int r = x % y;
            x = y;
            y = r;
        }
        answer[0] = y;
        answer[1] = n*m/y;
        return answer;
    }
}