package labs;

import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		
		
		Scanner inKey = new Scanner(System.in);
		System.out.print("Enter a positive integer:");
		double input1 = inKey.nextDouble();
		System.out.print("Enter another positive integer:");
		double input2 = inKey.nextDouble();
		
		double max = Math.max(input1, input2);
		double min = Math.min(input1, input2);
	
		double scope = (max-min)+1;
		
		for (int i = 0; i<10; i++) {
			double random = (int)(Math.random()*scope)+min;
			System.out.print(random + " " );
		}
	}
		 
		
		public static void problem02() {
			
			//Scanner for user input
			Scanner InKey = new Scanner(System.in);
			
			//Asks the user for the radius and the height of the cylinder
			System.out.println("What is the radius of the cylinder?");
			int radius = InKey.nextInt();
			System.out.println("What is the height of the cylinder?");
			int height = InKey.nextInt();
			
			
			//Calculates the volume
			double vol = Math.PI * Math.pow(radius, 2) * height;
			
			System.out.println("The volume of this cylinder is: " + vol);
			
		}

		
		

		public static void problem03() {
			
			//Scanner for user input
			Scanner InKey = new Scanner(System.in);
			
			
			//Asks for user input on coordinate values
			System.out.println("Enter coordinate 1's x value");
			double x1 = InKey.nextInt();
			System.out.println("Enter coordinate 1's y value");
			double y1 = InKey.nextInt();	
			System.out.println("Enter coordinate 2's x value");
			double x2 = InKey.nextInt();
			System.out.println("Enter coordinate 2's y value");
			double y2 = InKey.nextInt();	
			
			//Math for finding the distance between the two points
			double dist = Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2));
			
			System.out.println("The distance between these two points is: " + dist);
			
			
		}


		
		
		public static void problem04() {
			
			//Scanner for user input
			Scanner InKey = new Scanner(System.in);
			
			//Initializes our roots
			double x1, x2;
			
			//Initializes our a,b, and c-values
			double a, b, c;
			
			System.out.println("Enter the a-value");
			a = InKey.nextInt();
			System.out.println("Enter the b-value");
			b = InKey.nextInt();	
			System.out.println("Enter the c-value");
			c = InKey.nextInt();
			
			//Discriminant
			double d = Math.pow(b, 2) - 4 * a * c;
			
			//Math for quadratic formula
			x1 = (-b + Math.pow(d, 0.5)) / (2 * a); 
			x2 = (-b - Math.pow(d, 0.5)) / (2 * a);
			
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
			
		
			
		}
		
		

		
	}	

