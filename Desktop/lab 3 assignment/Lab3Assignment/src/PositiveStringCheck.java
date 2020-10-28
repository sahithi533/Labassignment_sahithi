/**
 * desc: program to accepts a String and checks if it is a positive string
 * author@ Yerram Sahithi
 * Date:28-10-2020
 */
import java.util.Scanner;

public class PositiveStringCheck {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word=sc.next();
		boolean result=positiveString(word);
		System.out.println(result);
	}
	
	// Method to check if a string is positive string or not
	public static boolean positiveString(String text) {
		int len=text.length();
        char charray[]= new char[len];
        for(int i=0;i<len;i++)
        {
        	charray[i]=text.charAt(i);
        }
        int count=0;
        for(int i=0;i<len-1;i++)
        {
        	if(charray[i]>charray[i+1])
        	{
        		break;
        	}
        	else
        		count++;
        }
        if(count==len-1)
        	return true;
        else
        	return false;
	}
}
