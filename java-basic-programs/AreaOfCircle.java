package com.basicprograms;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		 int rad =0;
		 //double pi= 3.14;
		 double ans=0;
		
		System.out.println("Enter the radius of the circle :");
		
		Scanner sc = new Scanner(System.in);
		rad = sc.nextInt();
		//System.out.println(" JAVA PI Value"+Math.PI);
		
		
		ans = Math.PI * rad * rad;
		System.out.println("Area of the circle is:"+ans);
		
	}
	
}
