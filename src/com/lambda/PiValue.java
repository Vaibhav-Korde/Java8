package com.lambda;

@FunctionalInterface
interface inter{
	
	public abstract double getPiValue();
}

public class PiValue {
	

	public static void main(String[] args) {
		
		inter i = ()-> 3.14;
		
		System.out.println("Show PI Value in lambda function : " + i.getPiValue());
		
		
	}
	

}
