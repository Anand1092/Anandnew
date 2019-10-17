package org.scanner;

import java.util.Scanner;


public class Example {
	public static void main(String[] args ) {

		Scanner a = new Scanner(System.in);
		System.out.println("please enter your empId");
		int empId = a.nextInt();
		
		System.out.println("The empId is "+ empId);
	}
}
