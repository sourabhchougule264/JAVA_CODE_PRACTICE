package com.practice.collections.questions;

import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.Set;

public class ConvertHashMapToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "Amol");
		hashMap.put(2, "Sourabh");
		hashMap.put(3, "Mahesh");
		hashMap.put(4, "Sanket");
		
		convertHashMapToArrayListUsingCollections(hashMap);
		convertHashMapToArrayListUsingStream(hashMap);
		
	}

	private static void convertHashMapToArrayListUsingStream(Map<Integer, String> hashMap) {
		// TODO Auto-generated method stub
		/*
		 * 1. Convert Keys of Map to ArrayList
		 */
		List<Integer> KeyList = hashMap.keySet().stream().collect(Collectors.toList());
		KeyList.forEach(System.out::print);

		System.out.println();
		/*
		 * 2. Convert Values of Map to ArrayList
		 */
		List<String> valueList = hashMap.values().stream().collect(Collectors.toList());
		valueList.forEach(System.out::print);
		
		System.out.println();
		/*
		 * 3. Convert Key-Value pairs of map into ArrayList
		 */
		List<Entry<Integer, String>> entryList = hashMap.entrySet().stream().collect(Collectors.toList());
		entryList.forEach(System.out::print);
		

	}

	private static void convertHashMapToArrayListUsingCollections(Map<Integer, String> hashMap) {
		/*
		 * 1. Convert Keys of Map to ArrayList
		 */
		
		Set<Integer> mapKeys = hashMap.keySet();	
		List<Integer> keyList = new ArrayList<Integer>(mapKeys);
		keyList.forEach(System.out::print);
		
		System.out.println();
		/*
		 * 2. Convert Values of Map to ArrayList
		 */
		Collection<String> mapValues = hashMap.values();
		List<String> valuesList = new ArrayList<String>(mapValues);
		valuesList.forEach(System.out::print);
		
		System.out.println();
		/*
		 * 3. Convert Key-Value pairs of map into ArrayList
		 */
		Set<Entry<Integer, String>> keyValuePairs = hashMap.entrySet();
		List<Entry<Integer, String>> keyValueList = new ArrayList<Map.Entry<Integer,String>>(keyValuePairs);
		keyValueList.forEach(System.out::print);
	}

}
