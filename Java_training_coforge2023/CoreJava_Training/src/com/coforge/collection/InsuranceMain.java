package com.coforge.collection;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class InsuranceMain {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Insurance i1 = new Insurance();
			
		System.out.println("Enter no. of policies you want to add: ");
		int n = sc.nextInt();
		for(int i =0; i<n;i++) {
			System.out.println("Enter policy ID: ");
			int id = sc.nextInt();
			System.out.println("Enter policy name: ");
			sc.nextLine();
			String name = sc.nextLine();
			i1.addPolicyDetails(id, name);
		}
		
		System.out.println("All policy details: ");
		System.out.println("Policy ID\tPolicy Name");
		Map<Integer, String> m1 = i1.getPolicyDetails();
		Set<Integer> s1 = m1.keySet();
		for(int i: s1) {
			System.out.println(i+"\t"+m1.get(i));
		}
		
		System.out.println("Enter the policy to be searched: ");
		String searchName = sc.next();
		
		List<Integer> l1 = i1.searchBasedOnPolicy(searchName);
		
		for(Integer i: l1) {
			System.out.println(i);
		}
		
	}
	
}
