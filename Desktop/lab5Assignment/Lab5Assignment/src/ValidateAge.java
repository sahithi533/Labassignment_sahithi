import java.util.Scanner;

/**
 * Desc : Finding if age is above 15 or not
 * Author : Yerram Sahithi
 * Date : 2-11-2022
 *
 */

public class ValidateAge {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		/**
		 * try and catch block to check age are valid or not
		 */
		
		try {
			System.out.println(checkAge(age));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//method to check if age is above 15 or not
	public static String checkAge(int a) throws Exception
	{
		if(a<15) {
			throw new Exception("Age should be above 15");
		}
		else
			return "Age is above 15 and validated";
	}
}
