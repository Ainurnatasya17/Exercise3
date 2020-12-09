package Repetition;
import java.util.*;

public class Exercise1 {

	public static void main(String[] args) {
	
	//define the variables
	System.out.println("FOR LOOP");
	
	int sum = 0;
	double average;
	int lowerbound = 1;
	int upperbound = 100;
	for(int number = lowerbound; number <= upperbound; ++number) {
		sum += number;
		
	}
	
	average = sum/100;
	
	System.out.println("The sum of 1 to 100 is " + sum);
	System.out.println("The average is " + average);
	System.out.println();

	System.out.println("WHILE LOOP");
	
	int sum1 = 0; 
	double average1;
	int lowerbound1 = 1;
	int upperbound1 = 100;
	int number = lowerbound1;
	while (number <= upperbound1) {
	     sum1 += number;
	     ++number;	
	}
	
	average1 = sum1/100;
	
	System.out.println("The sum of 1 to 100 is " + sum1);
	System.out.println("The average is " + average1);
	System.out.println();
	
	System.out.println("DO WHILE LOOP");
	
	int sum2 = 0;
	double average2;
	int lowerbound2 = 1;
	int upperbound2 = 100;
	int number2 = lowerbound2;
	
	do {
		sum2 += number2;
		++number2;
	}while (number2 <= upperbound2);
	
	average2 = sum2/100;
	
	System.out.println("The sum of 1 to 100 is " + sum2);
	System.out.println("The average is " + average2);
	System.out.println();
		
  }	
	
}
