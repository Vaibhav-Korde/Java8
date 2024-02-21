package com.lambda;

import java.util.List;

public class ListWithLambda {
	
	public static void main(String[] args) {
		
		List<Integer> list = List.of(234,25,23,63,23,74,26,6);
		
		
		list.forEach(
				
				(n) -> System.out.println(n)
				
		);
		
		
		
	}

}
