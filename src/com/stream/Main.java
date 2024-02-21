package com.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		 
		List<Integer> list =  List.of(32,43,2354,2134,321,4,523,134,3);
		
		//List<Integer> stream = (List<Integer>) list.stream();
		
		List<Integer> newList = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		
		System.out.println(newList);
		
		
	}
}
