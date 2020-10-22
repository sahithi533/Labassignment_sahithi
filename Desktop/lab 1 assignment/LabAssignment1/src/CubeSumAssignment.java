/**
 * Desc : Finding sum of the cubes of the digits of an n digit number
 * Author : Yerram Sahithi
 * Date : 22-10-2020
 *
 */

import java.util.Scanner;

public class CubeSumAssignment {
	
	public static void main(String[] args){
		
		System.out.println("Enter a number: ");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int result=cubeSum(number);
		System.out.println("Sum of Cube of a number is: "+result);
	}
	
	// Logic to find cube of number
	
	private static int cubeSum(int i) {
	
		int sum=0,remainder=0;
		while(i!=0) {
			remainder=i%10;
			sum=sum+(remainder*remainder*remainder);
			i=i/10;
		}
		return sum;
	}
}
