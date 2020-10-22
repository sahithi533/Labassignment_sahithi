/**
 * Desc : checking if a number is an increasing number
 * Author : Yerram Sahithi
 * Date : 22-10-2020
 *
 */
import java.util.Scanner;

public class IncreasingNumber {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number=sc.nextInt();
		boolean result=checkNumber(number);
		System.out.println(result);
	}
	//method to check increasing number
	private static boolean checkNumber(int num)
	{
		boolean increasing=false;
		int firstdigit=num%10;
		num=num/10;
		while(num>0) {
			if(firstdigit<=num%10) {
				increasing=true;
			}
			firstdigit=num%10;
			num=num/10;
		}
		if(increasing) {
			return false;
		}
		else {
			return true;
		}
	}
}
