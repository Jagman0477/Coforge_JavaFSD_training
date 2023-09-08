//package com.mine.testing;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class Test2 {
//
//	public static int fked[][];
//	
//	public static void createBoard() {
//		int right = 8;
//		int down = 8;
//		
//		fked = new int[right][down];
//		
//		int temp = 0;
//		
//		for(int i = 0; i < right; i++) {
//			for(int j = 0; j < down; j++) {
//				fked[i][j] = temp;
//				temp++;
//			}
//		}
//	}
//	
//	public static int[] returnIndex(int a) {
//		int[] res = new int[2];
//		
//		for(int i=0; i<8; i++) {
//			for(int j = 0; j<8; j++) {
//				if(fked[i][j] == a) {
//					res[0] = i;
//					res[1] = j;
//					return res;
//				}
//			}
//		}
//		return res;
//	}
//	
//	public static List<Integer> possibleOutcomes(int loc[]) {
//		List<Integer> l1 = new ArrayList<>();
//		l1.add(helper(loc[0]-2, loc[1]-1));
//		l1.add(helper(loc[0]-1, loc[1]-2));
//		l1.add(helper(loc[0]+1, loc[1]-2));
//		l1.add(helper(loc[0]+2, loc[1]-1));
//		l1.add(helper(loc[0]+2, loc[1]+1));
//		l1.add(helper(loc[0]+1, loc[1]+2));
//		l1.add(helper(loc[0]-1, loc[1]+2));
//		l1.add(helper(loc[0]-2, loc[1]+1));
//		
//		return l1;
//	}
//	
//	public static int helper(int a, int b) {
//		if(a >= 0 && a < 8 && b >= 0 && b < 8) {
//			return fked[a][b];
//		}
//		return -1;
//	}
//	
//	public static int stepCount(int a, int target, int flag, List<Integer>lastval) {
//		lastval.add(a);
//		List<Integer> removal = new ArrayList<>();
//		removal.add(-1);
//		int[] indexArray = returnIndex(a);
//		System.out.println("Index array: \t"+indexArray[0]+" "+indexArray[1]);
//		List<Integer> res = new ArrayList<Integer>();
//		res = possibleOutcomes(indexArray);
////		System.out.println("Res List: \t"+res);
//
////		for(int i=0; i<res.size(); i++) {
////			if(res.get(i) < 0) {
////				res.remove(i);
////			}
////		}
//		res.removeAll(removal);
//		System.out.println("Last value: "+lastval);
////		System.out.println("Res List without -1: \t"+res);
//		if(res.contains(target)) {
//			return flag;
//		} else {
//			flag++;
//			if(target>a) {
//				a = max(res, lastval);
//			} else if(target<a) {
//				a = min(res, lastval);
//			}
////			System.out.println("a value: \t"+a);
////			stepCount(a, target, flag, lastval);
//		}
//		return stepCount(a, target, flag, lastval);
//	}
//	
//	public static int max(List<Integer> res, List<Integer> lastval) {
//		int maximum = res.get(0);
//		for (int i = 0; i < res.size(); i++) {
//			if (maximum < res.get(i) && !lastval.contains(res.get(i)))
//                maximum = res.get(i);
//        }
//		return maximum;
//	}
//	
//	public static int min(List<Integer> res, List<Integer> lastval) {
//		int minimum = res.get(0);
//		for (int i = 0; i < res.size(); i++) {
//			if (minimum > res.get(i) && !lastval.contains(res.get(i)))
//            	minimum = res.get(i);
//        }
//		return minimum;
//	}
//	
//	public static void main(String[] args) {
//		createBoard();
//		int flag = 0;
//		List<Integer> lastVal = new ArrayList<>();
////		int[] indexArray = returnIndex(0);
////		List<Integer> res = new ArrayList<Integer>();
////		res = possibleOutcomes(indexArray);
////		for(int i=0; i<res.size(); i++) {
////			if(res.get(i) == -1) {
////				res.remove(i);
////			}
////		}
////		System.out.println(res);
//		int mainRes = stepCount(0, 1, flag, lastVal);
//		System.out.println(mainRes);
//	}
//}
// Java program to find minimum steps to reach to
// specific cell in minimum moves by Knight
