package com.lambda;

interface MyInterface {
	
	public abstract void reverse(String rev);
}

public class Reverse {

	public static void main(String[] args) {
		
		MyInterface inter = (rev)->{
			
			StringBuilder builder = new StringBuilder(rev);
			builder.reverse();
			
			System.out.println("This is original String = " +rev);
			
			System.out.println("This is Reverse String = "+builder);
			
		};
		
		inter.reverse("VAIBHAV");

	}

}
