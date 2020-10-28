/**
 * desc: Generating the mirror image of a String and add it to the existing string. 
 * author@ Yerram Sahithi
 * Date: 27-10-2020
 */

import java.util.*;
public class MirrorImage {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter text to create mirror image: ");
		String text=sc.next();
		String result=getImage(text);
		System.out.println("Mirror image of original image is: "+ result);
	}

	// method to get mirror image of string
	
	public static String getImage(String word)
	{
		StringBuffer sb=new StringBuffer(word);
		String new_word=sb.append("|").reverse().toString();      // appending line(|) and reversing the original word
		String mirror_word=word.concat(new_word);                 // Concatenation
		return mirror_word;                                       // return mirror word       
	}  
}
