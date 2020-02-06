package exerciswDay4;
import java.util.Scanner;
public class exercise4 {

	public static void main(String[] args) {
		Scanner tp = new Scanner(System.in);

		double hours = 0.0;
//		double add =0.0;
		double charge =0.0;
		
		System.out.println("Please enter the hours for each customer");
		hours = tp.nextInt();
		
		double charges = parckingCharge (hours);
		System.out.println("the charge for a customer packing is " + charges);
		

	}
	
	public static double parckingCharge (double hrs) {
		
		if (hrs < 4) {
			return 2.00;
		}
		else if( hrs > 3 ) {
			return (hrs - 3) * 0.50 + 2.00 ;
		}
		else {
			return 10.00;
		}
	}
	

}
