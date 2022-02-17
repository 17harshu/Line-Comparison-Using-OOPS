package com.line.problems;

class Points {
	int x1;
	int y1;
	int x2;
	int y2;

	public Points(int x1, int y1, int x2, int y2) {
		super();
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
}

public class LineComparisonUsingOOPS {

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
		Points point1 = new Points(1, 2, 3, 4);
		Points point2 = new Points(1, 2, 5, 8);
		LineComparisonUsingOOPS line = new LineComparisonUsingOOPS();
		int length1 = line.lineLengthCalculate(point1.x1, point1.x2, point1.y1, point1.y2);
		int length2 = line.lineLengthCalculate(point2.x1, point2.x2, point2.y1, point2.y2);
		line.compareTo(length1, length2);
	}

	public int lineLengthCalculate(int x1, int y1, int x2, int y2) {
		int lineLength = (int) Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
		return lineLength;
	}

	public void compareTo(int length1, int length2) {
		if (length1 == length2) {
			System.out.println("Both lines are equal");
		} else if (length1 > length2) {
			System.out.println("Line 1 is greater than line 2");
		} else {
			System.out.println("Line 2 is greater than line 1");
		}
	}
}
