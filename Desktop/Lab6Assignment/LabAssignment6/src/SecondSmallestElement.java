/**
 * Desc : Create a method which accepts an array of integer elements and return the second smallest element in the array
 * Author : Yerram Sahithi
 * Date : 4-11-2020
 *
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SecondSmallestElement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=sc.nextInt();
		//declaration and instantiation of array		
		int array[]=new int[number];
		System.out.println("Enter elements to be entered in array: ");
		
		//initialization of array
		
		for(int i=0;i<number;i++) {
			array[i]=sc.nextInt();
		}
		System.out.println("Second smallest elements is");
	    System.out.println(getSecondSmallest(array));
	}
	
	public static int getSecondSmallest(int[] arr)
	{
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			list.add(arr[i]);
		}
		Collections.sort(list);
		int secondSmallest=list.get(1);
		return secondSmallest;
	}
}
