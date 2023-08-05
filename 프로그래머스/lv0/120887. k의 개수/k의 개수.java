class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
		
        for(int num = i;num <= j;num++){
            String[] num2 = Integer.toString(num).split("");
            for (int index = 0; index < num2.length; index++) {
				if(num2[index].equals(Integer.toString(k))){
					answer++;
				}
			}
            
        }
        return answer;
    }
}