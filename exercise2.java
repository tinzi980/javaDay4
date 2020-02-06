package exerciswDay4;

import java.util.Scanner;

public class exercise2 {

	public static void main(String[] args) {
		int n = 0;
		Scanner tp = new Scanner(System.in);
		System.out.println("enter the integer number");
		n = tp.nextInt();
		
		boolean num = isEven (n);
		System.out.println("the answer is " + num);
		
		

	}
	public static boolean isEven ( int num1) {
		if (num1 % 2 == 0) {
			return true;
		}
			else {
				
			}
				return false;
		}
	}



