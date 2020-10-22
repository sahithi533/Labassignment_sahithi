/**
 * Desc : Finding prime numbers up to the given digit
 * Author : Yerram Sahithi
 * Date : 22-10-2020
 *
 */

import java.util.Scanner;

public class PrimeUptoN {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number,digit,count;
		System.out.println("Enter a digit: ");
		digit=sc.nextInt();
		System.out.println("Prime numbers upto the given digit are: ");
		for(number=1;number<=digit;number++)
		{
			count=0;
			for(int i=2;i<=number/2;i++)
			{
				if(number%i==0)
				{
					count++;
					break;
				}
			}
			if(count==0 && number!=1) {
				System.out.println(number+" ");
			}	
		}
	}
}