package exerciswDay4;
import java.util.Scanner;
public class exercise3 {

	public static void main(String[] args) {
		int marks = 0;
	Scanner tp = new Scanner(System.in);
	System.out.println("enter the students average marks");
	marks = tp.nextInt();
	
	int average = qualityPoints(marks);
	System.out.println("the students's average is " + average);
	}
	
	public static int qualityPoints(int score) {
		
		if(score >= 90 && score <= 100) {
			return 4;
			
		}
		else if (score >= 80 && score <= 89) {
			return 3;
		}
		else if (score >= 70 && score <= 79){
			return 2;
			
		}
		else if (score >= 60 && score <= 69) {
			return 1;
		}
		else {
			return 0;
		}
	}

}
