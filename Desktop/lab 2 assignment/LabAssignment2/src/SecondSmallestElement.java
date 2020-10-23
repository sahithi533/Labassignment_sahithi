/**
 * Desc : Sorting the array and return the second smallest element in the array 
 * @author Yerram Sahiti
 * Date : 23-10-2020
 */

import java.util.Scanner;

public class SecondSmallestElement {

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
		
		int result=getSecondSmallest(array);
		System.out.println("Second smallest element in array is: "+ result);
	}
	
	// getSecondSmallest method
	
	public static int getSecondSmallest(int arr[]) {
		int temp;
		
		//sorting elements in array
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}		
		return arr[1];                             // returning second smallest element
	}
}
