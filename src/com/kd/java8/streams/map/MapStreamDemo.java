package com.kd.java8.streams.map;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapStreamDemo {

	public static void main(String[] args) {

//		forEach() method iteration of Map collection.
		iteratingAMapUsingForEachMethod();
		
//		Filter a Map examples
//		With Java 8, you can convert a Map.entrySet() into a stream, follow by a filter() and collect() it.
		fileraMapByEntrySet();
		
//		Filter a Map by values and return a String.
		fileraMapByValue();

	}

	public static void iteratingAMapUsingForEachMethod() {
		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);

		items.forEach((k, v) -> System.out.println("Item : " + k + " Count : " + v));

		items.forEach((k, v) -> {
			System.out.println("Item : " + k + " Count : " + v);
			if ("E".equals(k)) {
				System.out.println("Hello E");
			}
		});
	}

	public static void fileraMapByEntrySet() {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "linode.com");
		map.put(2, "heroku.com");

		// Map -> Stream -> Filter -> String
		String result = map.entrySet().stream().filter(x -> "something".equals(x.getValue())).map(x -> x.getValue())
				.collect(Collectors.joining());

		// Map -> Stream -> Filter -> MAP
		Map<Integer, String> collect1 = map.entrySet().stream().filter(x -> x.getKey() == 2)
				.collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));
		System.out.println(collect1);
		// or like this
		Map<Integer, String> collect2 = map.entrySet().stream().filter(x -> x.getKey() == 3)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println(collect2);
	}

	public static void fileraMapByValue() {
		Map<Integer, String> HOSTING = new HashMap<>();
		HOSTING.put(1, "linode.com");
		HOSTING.put(2, "heroku.com");
		HOSTING.put(3, "digitalocean.com");
		HOSTING.put(4, "aws.amazon.com");

		// Before Java 8
		String result = "";
		for (Map.Entry<Integer, String> entry : HOSTING.entrySet()) {
			if ("aws.amazon.com".equals(entry.getValue())) {
				result = entry.getValue();
			}
		}
		System.out.println("Before Java 8 : " + result);

		// Map -> Stream -> Filter -> String
		result = HOSTING.entrySet().stream().filter(map -> "aws.amazon.com".equals(map.getValue()))
				.map(map -> map.getValue()).collect(Collectors.joining());

		System.out.println("With Java 8 : " + result);

		// filter more values
		result = HOSTING.entrySet().stream().filter(x -> {
			if (!x.getValue().contains("amazon") && !x.getValue().contains("digital")) {
				return true;
			}
			return false;
		}).map(map -> map.getValue()).collect(Collectors.joining(","));

		System.out.println("With Java 8 : " + result);
	}

}
