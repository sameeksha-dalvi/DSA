package com.basicprograms;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		double height=0;
		double base =0;
		double area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the height of triangle:");
		
		height = sc.nextDouble();
		
		System.out.println("Enter the base of triangle:");
		
		base = sc.nextDouble();
		
		area = (height* base)/2;
		
		System.out.println("Area of triangle: " +area);
		
	}
	
}
