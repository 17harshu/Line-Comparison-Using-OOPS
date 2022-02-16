package com.line.problems;

import java.util.Scanner;

public class LineComparisonUsingOOPS {
	public static void calculateLength() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter line1 first number- ");
		int x1 = sc.nextInt();
		System.out.print("Enter line1 second number- ");
		int y1 = sc.nextInt();
		System.out.print("Enter line1 third number- ");
		int x2 = sc.nextInt();
		System.out.print("Enter line1 fourth number- ");
		int y2 = sc.nextInt();
		System.out.print("Enter line2 first number- ");
		int m1 = sc.nextInt();
		System.out.print("Enter line2 second number- ");
		int n1 = sc.nextInt();
		System.out.print("Enter line2 third number- ");
		int m2 = sc.nextInt();
		System.out.print("Enter line2 fourth number- ");
		int n2 = sc.nextInt();

		// Calculate distance between two points
		double length1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		double length2 = Math.sqrt((m2 - m1) * (m2 - m1) + (n2 - n1) * (n2 - n1));

		System.out.println("Length of line 1 :" + length1);
		System.out.println("Length of line 2 :" + length2);

		Object obj1 = new Object();
		Object obj2 = new Object();

		obj1 = length1;
		obj2 = length2;

		// equals() method is used to check equality of 2 lines
		if (obj1.equals(obj2))
			System.out.println("Lines are equal ");
		else
			System.out.println("Lines are not equal ");

	}

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
		calculateLength();
	}
}
