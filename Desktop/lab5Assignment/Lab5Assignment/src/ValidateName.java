import java.util.Scanner;

/**
 * Desc : Validating If employee name is correct or not i.e, name has both first and last name
 * Author : Yerram Sahithi
 * Date : 2-11-2022
 *
 */

public class ValidateName {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Name");
		String firstName=sc.next();
		System.out.println("Enter Last Name");
		String lastName=sc.next();
		
		/**
		 * try and catch block to check if first and last are valid or not
		 */
		try {
			System.out.println(validateFirstLastName(firstName,lastName));
		}
		catch(Exception e) {
			e.getMessage();
		}
	}
	
	//method to check if name is valid or not
	public static String validateFirstLastName(String fname,String lname) throws Exception{
		if(fname.isBlank()) {
			throw new Exception("First name cannot be null");
		}
		else if(lname.isBlank()) {
			throw new Exception("Last name cannot be null");
		}
		else {
			return "Name is valid";
		}
	}
}
