package com.stream;

public class ReverseString {

	public static void main(String[] args) {
	
		String str = "Vaibhav";
		
		String revString = myReverseString(str);
		
		System.out.println("This is the reverse String : " +revString);
		
		

	}
	
	private static String myReverseString(String str) {
		
		String revString = str.chars()
				.mapToObj(c -> String.valueOf((char) c))
				.reduce((s1, s2) -> s2 + s1).orElse("");
		
		return revString;
	} 

}
