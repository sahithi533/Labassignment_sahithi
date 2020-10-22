/**
 * Desc : Finding the difference between the sum of the squares of the first n natural numbers and the square of their sum. 
 * Author : Yerram Sahithi
 * Date : 22-10-2020
 *
 */

import java.util.Scanner;

public class Difference {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number=sc.nextInt();
		int result=calculateDifference(number);
		System.out.println(result);
	}
	//calculating difference 
	public static int calculateDifference(int num) {
		int dif,sum=0,sum1=0;
		for(int i=1;i<=num;i++){
			sum=sum+(i*i);
		}
		for(int i=1;i<=num;i++) {
			sum1=sum1+i;
		}
		dif=sum-sum1;
		return dif;
	}
}