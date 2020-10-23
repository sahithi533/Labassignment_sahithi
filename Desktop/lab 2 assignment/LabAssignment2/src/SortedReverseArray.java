/**
 * Desc : Sorting the array and return the reverse array
 * @author Yerram Sahiti
 * Date : 23-10-2020
 */

import java.util.Scanner;

public class SortedReverseArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of elements to be entered in array: ");
		int length=sc.nextInt();
		
		//declaration and instantiation of array
		
		int array[]=new int[length];
		System.out.println("Enter elements to be entered in array: ");
		
		//initialization of array
		
		for(int i=0;i<length;i++) {
			array[i]=sc.nextInt();
		}
		int result[];
		result=getSorted(array);
		System.out.println("reverse:");
		for(int i=0;i<length;i++) {
			System.out.println(result[i]+" ");
		}
	}
	
	//method to sort array 
	
	public static int[] getSorted(int arr[]) {
		int len=arr.length;
		int temp;
		int reverse[]=new int[len];
		
		//logic for reversing array
		
		for(int i=0;i<len;i++) {
			reverse[i]=arr[len-i-1];
		}
		
		//logic for sorting array
		
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(reverse[i]>reverse[j]) {
					temp=reverse[i];
					reverse[i]=reverse[j];
					reverse[j]=temp;
				}
			}
		}
		return reverse;                              //return sorted reverse array to main
	}
}