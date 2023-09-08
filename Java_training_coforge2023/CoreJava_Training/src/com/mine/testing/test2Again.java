package com.mine.testing;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class test2Again {
	
	public static int fked[][];
	
	public static void main(String[] args) {
		int a = solution(19, 36);
		System.out.println(a);
	}
	
	public static int solution(int start, int target) {
		if(start == target) return 0;
		int stepCount = 0;
		createBoard();
		boolean[] visited = new boolean[64];
		
		Queue q = new LinkedList<Integer>();
		
		visited[start] = true;
		q.add(start);
		
		while(!q.isEmpty()) {
			int size = q.size();
			stepCount++;
			while(size != 0) {
				int cur = (int) q.poll();
				if(cur == target) return stepCount;
				List<Integer> possibleOutcomes = possibleOutcomes(returnIndex(cur));
				for(int i: possibleOutcomes) {
					if(i == target)	return stepCount;
					if(i>=0 && !visited[i]) {
						visited[i] = true;
						q.add(i);
					}
				}
				size--;
			}
			
		}
		
		return stepCount;
		
	}
	
//	public static int stepsToTarget(int start, int target, int steps, boolean[] visited) {
//		steps++;
//		visited.add(start);
//		List<Integer> possibleOutcomes = possibleOutcomes(returnIndex(start));
//		
//		if(possibleOutcomes.contains(target))
//			return steps;
//		
//		if(target>start) {
//			start = maxVal(possibleOutcomes, visited);
//		} else {
//			start = minVal(possibleOutcomes, visited);
//		}
//		
//		return stepsToTarget(start, target, steps, visited);
//	}
	
	
	public static void createBoard() {
		int right = 8;
		int down = 8;
		
		fked = new int[right][down];
		
		int temp = 0;
		
		for(int i = 0; i < right; i++) {
			for(int j = 0; j < down; j++) {
				fked[i][j] = temp;
				temp++;
			}
		}
	}
	
	public static int helper(int a, int b) {
		if(a >= 0 && a < 8 && b >= 0 && b < 8) {
			return fked[a][b];
		}
		return -1;
	}
	
	public static List<Integer> possibleOutcomes(int loc[]) {
		List<Integer> l1 = new ArrayList<>(8);
		l1.add(helper(loc[0]-2, loc[1]-1));
		l1.add(helper(loc[0]-1, loc[1]-2));
		l1.add(helper(loc[0]+1, loc[1]-2));
		l1.add(helper(loc[0]+2, loc[1]-1));
		l1.add(helper(loc[0]+2, loc[1]+1));
		l1.add(helper(loc[0]+1, loc[1]+2));
		l1.add(helper(loc[0]-1, loc[1]+2));
		l1.add(helper(loc[0]-2, loc[1]+1));
		
		return l1;
	}
	
	public static int[] returnIndex(int a) {
		int[] res = new int[2];
		
		for(int i=0; i<8; i++) {
			for(int j = 0; j<8; j++) {
				if(fked[i][j] == a) {
					res[0] = i;
					res[1] = j;
					return res;
				}
			}
		}
		return res;
	}
	
	public static int maxVal(List<Integer> list1, List<Integer> list2) {
		int maxVal = 0;
		for(int i: list1) {
			if(!list2.contains(i) && i>maxVal) {
				maxVal = i;
			}
		}
		return maxVal;
	}
	
	public static int minVal(List<Integer> list1, List<Integer> list2) {
		int minVal = 100;
		for(int i: list1) {
			if(!list2.contains(i) && i<minVal) {
				minVal = i;
			}
		}
		return minVal;
	}
}
	 