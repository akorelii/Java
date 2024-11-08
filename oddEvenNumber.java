package oodEvenNumber;

import java.util.Scanner;

public class oddEvenNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the number of Array :");
		int diziLength = scanner.nextInt();
		scanner.nextLine();
		
		int[] numbers = new int[diziLength];
		
		for(int i=0 ; i<numbers.length ; i++)
		{
			System.out.print("Enter the "+i+". index value :");
			numbers[i] = scanner.nextInt();
			scanner.nextLine();		
		}
		
		for (int i : numbers) {
			isOddEven(i);
		}
	}
	
	public static void isOddEven(int number)
	{
		if(number%2==0)
		{
			System.out.println("Number: " + number + " is even");
		}else {
			System.out.println("Number: " + number + " is odd");
		}
		
	}
}



