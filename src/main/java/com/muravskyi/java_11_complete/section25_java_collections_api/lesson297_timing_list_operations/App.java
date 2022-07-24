package com.muravskyi.java_11_complete.section25_java_collections_api.lesson297_timing_list_operations;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {

		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();

		long durationArrayList = timeOperations(arrayList);
		long durationLinkedList = timeOperations(linkedList);
		System.out.println("Duration for ArrayList: " + durationArrayList);
		System.out.println("Duration for LinkedList: " + durationLinkedList);

	}

	public static long timeOperations(List<Integer> list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 1E5; i++) {
			list.add(0, i);
		}
		long end = System.currentTimeMillis();
		return end - start;
	}

}
