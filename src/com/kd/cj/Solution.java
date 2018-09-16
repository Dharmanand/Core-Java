package com.kd.cj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
//		int A[] = {1, 3, 6, 4, 1, 2};
		int A[] = {-3, -5};
		
		System.out.println(new Solution().solution(A));
	}
	
	public int solution(int[] A){
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<A.length; i++){
			list.add(A[i]);
		}
		for(int i=1; i<=A.length; i++){
			if(!list.contains(i)){
				return i;
			}
		}
		Collections.sort(list);
		return list.get(list.size()-1) + 1;
		
	}
	
}
