class Solution {
    public int[] solution(long n) {
        String s = Long.toString(n);
        int[] answer = new int[s.length()];
        String[] sArr = s.split("");
        int j = 0;
        for(int i = sArr.length-1; i >= 0; i--){
            answer[j] = Integer.parseInt(sArr[i]);
            j++;
        }
        return answer;
    }
}