class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int temp = 0;
        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }
        int maxWidth = sizes[0][0];
        int maxHeight = sizes[0][1];
        for(int i = 1; i < sizes.length; i++){
            if(maxWidth < sizes[i][0]){
                maxWidth = sizes[i][0];
            }
            if(maxHeight < sizes[i][1]){
                maxHeight = sizes[i][1];
            }
        }
        answer = maxWidth * maxHeight;
        return answer;
    }
}