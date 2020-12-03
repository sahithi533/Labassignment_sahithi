import java.util.Scanner;

/**
 * Desc : Finding if employee salary is valid or not
 * Author : Yerram Sahithi
 * Date : 2-11-2022
 *
 */
public class Employee {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Salary:");
		int salary=sc.nextInt();
		EmployeeException(salary);
	}
	
	//method to check if salary is above 3000 or not
	public static void EmployeeException(int n)
	{
		try {
			if(n<3000) {
				throw new Exception("Invalid");
			}
			else{
				System.out.print("Valid");
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
