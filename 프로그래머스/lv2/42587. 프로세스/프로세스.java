import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		//우선순위 큐를 내림차순으로 정렬
		for (int i = 0; i < priorities.length; i++) {
			pq.add(priorities[i]);
		}
		
		while (!pq.isEmpty()) {
			for (int i = 0; i < priorities.length; i++) {
				if (priorities[i] == pq.peek()) {//priorities의 값이 현재 오름차순 우선순위가 제일 높은 값과 같은지 확인
					if (i == location) {
						answer++;
						return answer;
					}
					pq.poll();// priorityQueue에 첫번째 값을 반환하고 제거 비어있다면 null
					answer++;
					
				}
			}
		}
        return answer;
    }
}