package com.kd.collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
/**
 * 
 * @author Kumar
 *
 * @param <K>
 * @param <V>
 */
public class HashMapTest<K, V> {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "A");
		hm.put(2, "B");
		hm.put(5, "E");
		hm.put(6, "E");
		hm.put(3, "C");
		hm.put(4, "D");
		hm.put(7, "F");

		System.out.println(hm);
		HashMapTest<Integer, String> hmt = new HashMapTest<>();

		System.out.println("---------------forEachLoopUsingEntrySet----------------");
		hmt.forEachLoopUsingEntrySet(hm);
		System.out.println("---------------iteratingOverKeySet----------------");
		hmt.iteratingOverKeySet(hm);
		System.out.println("---------------iteratingOverValues----------------");
		hmt.iteratingOverValues(hm);
		System.out.println("---------------iteratingUsingEntrySetIterator----------------");
		hmt.iteratingUsingEntrySetIterator(hm);
		System.out.println("---------------iteratingUsingKeySetIterator----------------");
		hmt.iteratingUsingKeySetIterator(hm);
		System.out.println("-------------------------------");

	}

	public void forEachLoopUsingEntrySet(Map<K, V> map) {
		Set<Entry<K, V>> entries = map.entrySet();// -----------
		for (Entry<K, V> entry : entries) {
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
	}

	public void iteratingOverKeySet(Map<K, V> map) {
		Set<K> keyset = map.keySet();// -----------
		for (K key : keyset) {
			System.out.println("Key = " + key + ", Value = " + map.get(key));
		}
	}

	public void iteratingOverValues(Map<K, V> map) {
		Collection<V> values = map.values();// -----------
		for (V value : values) {
			System.out.println("Value = " + value);
		}
	}

	public void iteratingUsingEntrySetIterator(Map<K, V> map) {
		Iterator<Entry<K, V>> entries = map.entrySet().iterator();// -----------
		Entry<K, V> entry = null;
		while (entries.hasNext()) {
			entry = entries.next();
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
	}

	public void iteratingUsingKeySetIterator(Map<K, V> map) {
		Iterator<K> keys = map.keySet().iterator();// -----------
		K key = null;
		while (keys.hasNext()) {
			key = keys.next();
			System.out.println("Key = " + key + ", Value = " + map.get(key));
		}
	}

}
