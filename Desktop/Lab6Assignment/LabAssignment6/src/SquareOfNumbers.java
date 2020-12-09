/**
 * Desc : Create a method which accepts an array of numbers and returns the numbers and their squares in Hashmap
 * Author : Yerram Sahithi
 * Date : 4-11-2020
 *
 */

import java.util.HashMap;
import java.util.Map;

public class SquareOfNumbers {
	public static void main(String[] args) {
		int arrNumbers[]= {1,2,3,4};
		System.out.println("Squares of numbers are: ");
	    System.out.println(getSquare(arrNumbers));
	}
	
	//method to find square 
	public static Map<Integer, Integer> getSquare(int[] array)
	{
		Map<Integer, Integer> mapSquare=new HashMap<Integer, Integer>();
		for(int i=0;i<array.length;i++)
		{
			int k=(int)Math.pow(array[i],2);
			mapSquare.put(array[i],k);
		}
		return mapSquare;				
	}
}
