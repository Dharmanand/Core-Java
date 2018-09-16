package com.kd.collection.map.questions;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

//You can see the tutorials on https://www.programcreek.com/2013/09/top-9-questions-for-java-map/

public class ShallowCopyOfAMap {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		Map copiedMap = Collections.synchronizedMap(map);
		
	}

}
