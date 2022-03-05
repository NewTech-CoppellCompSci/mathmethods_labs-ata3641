
package labs;
import java.util.Scanner;
public class Lab01 {

	
	
	
	public static void main(String[] args) {
		
	
		
		problem01();
	 	problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		
		Scanner inKey = new Scanner(System.in);
		// adds a scanner then uses the values in outed the user and use matth.pow ttoo find the power of the twoo integers
		System.out.println("Enter a Positive Integer");
		int input1 = inKey.nextInt();
		System.out.println("Enter Another Positive integer");
		int input2 = inKey.nextInt();
		double pow = Math.pow(input1, input2);
		System.out.println(input1 + "^" + input2 + "=" + pow);
		
		
	}
	
	
	
	
	public static void problem02() {
		//same thing as one above except i is finding square roott by doing math.sqrt
		Scanner inKey = new Scanner(System.in);
		System.out.println("Enter a Postive Integer");
		double input1 = inKey.nextDouble();
		double sqrt = Math.sqrt(input1);
		System.out.println("The Square Root of " + input1 + " is " + sqrt);
				
		
	}

	
	

	public static void problem03() {
		//this one jus finds hypotenuse
		Scanner inKey = new Scanner(System.in);
		System.out.println("Length of Side A:");
		double A = inKey.nextDouble();
		System.out.println("Length of Side B:");
		double B = inKey.nextDouble();
		double hypot = Math.hypot(A, B);
		System.out.println("Hypotenuse:" + hypot);
		

	}


	
	
	public static void problem04() {
		
		Scanner inKey = new Scanner (System.in);
		System.out.println("Enter An Integer: ");
		double input1 = inKey.nextDouble();
		
		double max = 0;
		double min = 0;
		
		while (input1 != 0) {
			// check to see if greater than max
			if (input1 >= max) {
				max = input1;
			}
			// check to see if lesser than min
			if (input1 <= min) {
				min = input1;
			}
			
			inKey = new Scanner (System.in);
			System.out.println("Enter An Integer: ");
			input1 = inKey.nextDouble();
			
			
		}
		System.out.println("Max: " + max);
		System.out.print("Min: " + min);
		
	}
	
	
	
	
	
	
}
