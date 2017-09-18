
import java.util.Scanner;

/*
Parts: 

A Read a set of numbers (20, 30, 40) 
B Check if a given number occurs in the array (40)
C Displays the location of the key element within the array (3) 

*/

public class keyElementSearch {

	public static void main(String[] args) {
	// Part A
		// Scanner input rule A
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter six numbers (in ascending order): ");
	    
	    // Create an empty array with a maximum of 6 inputs (= [0-5])
	    int i = 0, max = 6; 
	    int numbers[] = new int[max];
	    
	    // Create a for loop to ensure the user can only enter a maximum of 6 numbers
	    for (i = 0; i <= numbers.length - 1; i++) {
	    	numbers[i] = input.nextInt();
	    }
	 
	// Part B + C
	    // Prerequisite to check if the number is part of the array 
	    int a = numbers[0];
	    int b = numbers[1];
	    int c = numbers[2];
	    int d = numbers[3];
	    int e = numbers[4];
	    int f = numbers[5];
	    
	    // Scanner input rule B
	    System.out.println("Enter a number to search: ");
	    int check = input.nextInt(); 
	  
	    // Condition that checks if the number is part of the array. 
	    	// Side note: I have a feeling this isn't the most optimal solution, but it works :)  
	    if (a == check) {
	    System.out.println("Element " + a + " is found at 1st position");		
	    }
	    
	    else if (b == check) {
	    System.out.println("Element " + b + " is found at 2nd position");	
	    }
	    
	    else if (c == check) {
	    System.out.println("Element " + c + " is found at 3rd position");	
	    }
	    
	    else if (d == check) {
	    System.out.println("Element " + d + " is found at 4th position");
	    }
	    
	    else if (e == check) {
	    System.out.println("Element " + e + " is found at 5th position");
	    }
	    
	    else if (f == check) {
	    System.out.println("Element " + f + " is found at 6th position");
	    }

	    else {
	    System.out.println("Unfortunately, the number is not in the array");
	    }
	    // Close scanner input
	    input.close();
	}
}
