/**
 * Desc : Finding sum of the natural numbers divisible by 3 or 5
 * Author : Yerram Sahithi
 * Date : 22-10-2020
 *
 */

import java.util.Scanner;

public class SumOfNaturalNumbers {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int number;
		number=sc.nextInt();
		int result=calculateSum(number);
		System.out.println(result);
	}
	//calculateSum method
	private static int calculateSum(int num) {
		int sum=0;
		for(int i=0;i<=num;i++) {
			if(i%3==0 || i%5==0) {
				sum=sum+i;
			}
		}
		return sum;
	}

}
