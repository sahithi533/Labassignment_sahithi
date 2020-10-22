/**
 * Desc : To check if a number is power of 2 or not
 * Author : Yerram Sahithi
 * Date : 22-10-2020
 *
 */

import java.util.Scanner;

public class PowerOf2 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number=sc.nextInt();
		boolean result=checkNumber(number);
		System.out.println(result);
	}
	//method
	public static boolean checkNumber(int num) {
		if(num==0) {
			return false;
		}
		while(num!=1) {
			if(num%2==0)
				return true;
			else
				return false;
		}
		return true;
	}
}
