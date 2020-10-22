/**
 * Desc : Fibonacci series
 * Author : Yerram Sahithi
 * Date : 22-10-2020
 *
 */
import java.util.Scanner;

public class FibonacciAssignment {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int number1=1,number2=1,nextTerm=0,i;
		System.out.println("Enter the size of series: ");
		int number=sc.nextInt();
		for(i=2;i<=number;i++)
		{
			nextTerm=number1+number2;
			number1=number2;
			number2=nextTerm;
		}
	System.out.print("The nth term in Fibonacci series is: "+nextTerm);
	}
}
