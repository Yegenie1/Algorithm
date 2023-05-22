package 프로그래머스Lv2;

import java.util.ArrayList;
import java.util.Collections;

public class 명예의전당 {
	public static void main(String[] args) {
		int k = 3;
		int[] score ={10, 100, 20, 150, 1, 100, 200};
		int[] answer = new int[score.length];
		
		ArrayList<Integer> rank = new ArrayList<>();
		
		for (int i = 0; i < answer.length; i++) {
			rank.add(score[i]);//점수 추가
			if (i>=k) {
				rank.remove(Collections.min(rank));//i가 k보다 크면 rank에서 가장 작은 값 삭제
			}
			answer[i] = Collections.min(rank);//answer에 rank min값 넣기
		}

		for (int i : answer) {
			System.out.println(i);
		}
		
	}
	//우선순위큐
//	class Solution {
//	    public int[] solution(int k, int[] score) {
//	        int[] answer = new int[score.length];
//
//	        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
//
//	        int temp = 0;
//
//	        for(int i = 0; i < score.length; i++) {
//
//	            priorityQueue.add(score[i]);
//	            if (priorityQueue.size() > k) {
//	                priorityQueue.poll();//poll()은 우선순위가 젤 우선인 값을 꺼냄
//	            }
//
//	            answer[i] = priorityQueue.peek();//peek()은 꺼내지 않고 값만 확인
//	        }
//
//	        return answer;
//	    }
//	}
}
