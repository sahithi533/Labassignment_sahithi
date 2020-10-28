/**
 * Desc:  Modifying it such that the each of the digit in the newly formed number is equal to the difference between two consecutive digits in the original number.
 * author@ Yerram Sahithi
 * Date:28-10-2020
 */
import java.util.Scanner;

public class DifferenceOfConsecutive {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number;
		System.out.println("Enter the number: ");
		number=sc.nextInt();
		int result=modifyNumber(number);
		System.out.println("Modified number is: "+result);
	}
	
	//method to find difference between consecutive numbers in integer
	
	public static int modifyNumber(int num) {
		int number1=0,number2=0,new_number=0,difference=0,len;
		StringBuffer sb=new StringBuffer();
		String word=Integer.toString(num);               // Integer is converted to String
		len=word.length();
		for(int i=0;i<len-1;i++) {
		    number1=word.charAt(i);                     // Values are stored one by one in number1
		    if(i<len)
		       number2=word.charAt(i+1);                // Integer next of number 1 is stored here
		    //Math.abs is used to get the absolute value(To get +ve integer)
		    difference=Math.abs(number1-number2);
		    sb.append(difference);
		}
		sb.append(word.charAt(word.length()-1));
		new_number=Integer.parseInt(sb.toString());
		return new_number;                               // Return new number
	}
}