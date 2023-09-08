package com.coforge.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Insurance {

	private static Map<Integer, String> policyDetails = new TreeMap<>();

	public static Map<Integer, String> getPolicyDetails() {
		return policyDetails;
	}

	public static void setPolicyDetails(Map<Integer, String> policyDetails) {
		Insurance.policyDetails = policyDetails;
	}
	
	void addPolicyDetails(int id, String name) {
		policyDetails.put(id, name);
	}
	
	List<Integer> searchBasedOnPolicy(String name){
		List<Integer> l1 = new ArrayList<>();
		
		Set<Integer> s1 = policyDetails.keySet();
		
		for(Integer i: s1) {
			if((policyDetails.get(i)).contains(name))
				l1.add(i);
		}
		return l1;
	}
	
}
