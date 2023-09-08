package com.mine.testing;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Test {
	public static int[] solution(int[] data, int n) {
	    //try -> 1 -> missing one test case no 9. 
	    
	    //     // Your code here
	        
	    //     int flag = 0;

	    //     int[] minionFreq = new int[101]; 
	        
	    //     for(int bob = 0; bob<data.length; bob++){
	    //         minionFreq[data[bob]]++;
	    //     }
	        
	    //     for(int patrick=0; patrick<minionFreq.length; patrick++){
	    //         if(minionFreq[patrick]<=n && minionFreq[patrick]>0){
	    //             for(int j = 0;j < minionFreq[patrick]; j++){
	    //                 flag++;
	    //             }
	    //         } else if(minionFreq[patrick]>n){
	    //             minionFreq[patrick] = -1;
	    //         }
	    //     }
	        
	    //     int[] res = new int[flag];
	        
	    //     for(int goku=0, gohan=0; goku<data.length; goku++){
	    //         int vegeta = data[goku];
	    //         if(minionFreq[vegeta] != -1 && minionFreq[vegeta] != 0){
	    //                 res[gohan] = vegeta;
	    //                 gohan++;
	    //         }
	    //     }
	        
	    //     data = res;
	        
	    //     return data;
	    
	    // }
	    ArrayList<Integer> arr = new ArrayList<>();
	    
	    for(int minion1 = 0; minion1<data.length; minion1++){
	        
	        //No of shifts for the slaves
	        int shift = 0;
	        
	        //Calculating torture
	        for(int minion2 = 0; minion2<data.length; minion2++){
	            if(data[minion2] == data[minion1])
	                shift++;
	            }
	            
	            //Coal mines for you ;)
	            if(shift<=n){
	                arr.add(data[minion1]);
	            }
	        }
	        
	        //Gang gang
	        int[] gang = new int[arr.size()];
	        
	        for(int minion3 = 0; minion3<arr.size(); minion3++){
	            gang[minion3] = arr.get(minion3);
	        }
	        
	        return gang;
	    }
    
    public static void main(String[] args) {
		
    	int[] data = {1,2,2,3,3,3,4,5,5};
    	
    	int[] temp = solution(data, 2);
    	for(int i: temp) {
    		System.out.println(i);
    	}
    	
	}

}
