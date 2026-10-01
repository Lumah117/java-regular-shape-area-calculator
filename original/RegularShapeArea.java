import java.util.Scanner;

/*
 * Software Development 1, Coursework 1
 *
 * @author Christopher Mitchell
 * 
 * Write a program to calculate the area of a shape based on the
 * number of sides and the length of the sides input by the program
 * user.
 */
public class RegularShapeArea {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//scanner to ask user to input the number of sides and length of sides
		
		System.out.println ("How many sides does your shape have (Please enter a value from 3 to 6): ");
		int no_sides = scan.nextInt();
		
		//code to display an error message if the number of sides entered is invalid
		if (no_sides <3 || no_sides >6) {
	           System.out.println ("Please enter an appropraite number of sides.");
	           System.out.println ("Enter a value from 3 up to 6.");
		}
		//code to ask for the length of the side if the number of sides entered is valid
	else {
		       System.out.println ("What is the length of the sides: ");
		}
		       
		double side_length = scan.nextDouble();
		
		scan.close();
		
		//formulas for calculating the Surface Area of each of the predetermined shapes
		
		//formula for the Surface Area of a Triangle
		double result_triangle = (((Math.sqrt(3.0))/4.0) * ((side_length) * (side_length)));
		
		//formula for the Surface Area of a Square
		double result_square = ((side_length) * (side_length));
		
		//formula for the Surface Area of a Pentagon
		double result_pentagon = ((1.0/4.0)*(Math.sqrt(5*(5+2*(Math.sqrt(5)))))*((side_length)*(side_length)));
		
		//formula for the Surface Area of a Hexagon
		double result_hexagon = (((3*(Math.sqrt(3.0))/2.0) * ((side_length) * (side_length))));
		
		
		//code to implement the execution of the correct formula based on users input numbers//
		
		if (no_sides == 3) {
			System.out.println ("The Surface Area of a shape with " + (no_sides) + " sides, with a length of " + (side_length) + " is:");
			System.out.println (result_triangle);
		}
		
		else if (no_sides == 4) {
			System.out.println ("The Surface Area of a shape with " + (no_sides) + " sides, with a length of " + (side_length) + " is:");
			System.out.println (result_square);
	    }
	
	    else if (no_sides == 5) {
	    	System.out.println ("The Surface Area of a shape with " + (no_sides) + " sides, with a length of " + (side_length) + " is:");
	    	System.out.println (result_pentagon);
		}

        else if (no_sides == 6) {
        	System.out.println ("The Surface Area of a shape with " + (no_sides) + " sides, with a length of " + (side_length) + " is:");
        	System.out.println (result_hexagon);
        }
		
         
			
	}
}
