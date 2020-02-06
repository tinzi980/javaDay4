package exerciswDay4;

import java.util.Scanner;

public class exercise1 {
	static double pie = 3.14;
	public static void main(String[] args) {
		double radius = 0.0;
	
		Scanner tp =  new Scanner(System.in);
		System.out.println("Enter the radius of the circle");
		radius = tp.nextInt();
      
		double area = circleArea (radius);
		System.out.println("the area is " + area);
		
	}
	///////////////////
	public static double circleArea ( double radius) {
		
		double area = 3.14 * radius*radius;
		//System.out.println("The area is " + area);
		return area;
		
	}

}
