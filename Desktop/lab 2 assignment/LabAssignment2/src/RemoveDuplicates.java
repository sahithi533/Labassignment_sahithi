/**
 * Desc : Removing duplicates from array and printing it in descending order
 * @author Yerram Sahiti
 * Date : 23-10-2020
 */

import java.util.Scanner;

public class RemoveDuplicates {
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
		result=modifyArray(array);
		for(int i=0;i<length-1;i++) {
			System.out.println(result[i]+" ");
		}
	}
	
	//method for removing duplicate 
	
	public static int[] modifyArray(int arr[]) {
		int len=arr.length;
		int temp=0;
		int duplicate[]=new int[len];
		for(int i=0;i<len-1;i++) {
			if(arr[i]!=arr[i+1]) {
				duplicate[temp++]=arr[i];
			}
		}
		duplicate[temp++]=arr[len-1];
		for(int i=0;i<temp;i++) {
			arr[i]=duplicate[i];
		}
		int res[];
		res=descendingSort(temp,arr);
		return res;                      //return to main method
	}
	
	// method for sorting array in descending order
	
	public static int[] descendingSort(int temporary,int arr1[]) {
		int temp1;
		for(int i=0;i<temporary;i++) {
			for(int j=i+1;j<temporary;j++) {
				if(arr1[i]<arr1[j]) {
					temp1=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp1;
				}
			}
		}
		return arr1;               // return to modifyArray method 
	}
}
