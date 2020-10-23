/**
 * Desc : Sorting array in alphabetical order and changing left elements to uppercase and right elements to lowercase
 * @author Yerram Sahiti
 * Date : 23-10-2020
 */

import java.util.Scanner;

public class StringAlpabeticalSort {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of elements to be entered in array: ");
		int length=sc.nextInt();
		
		//declaration and instantiation of array
		
		String array[]=new String[length];
		System.out.println("Enter string elements to be entered in array: ");
		
		//initialization of array
		
		for(int i=0;i<length;i++) {
			array[i]=sc.next();
		}
		String result[];
		result=sortStrings(array);
		for(int i=0;i<length;i++) {
			System.out.println(result[i]+" ");
		}
	}
	
	//method to sort strings
	
	public static String[] sortStrings(String arr[]) {
		int len=arr.length;
		String temp;
		int count;
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(arr[i].compareTo(arr[j])>0) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<len;i++) {
			count=len%2;                    //to know if length is even or odd
			
			//if length is odd
			
			if(count!=0) {
				if(i<(len/2)+1) {
					arr[i]=arr[i].toUpperCase();
				}
				else {
					arr[i]=arr[i].toLowerCase();
				}
			}
			
			//if length is even
			
			else {
				if(i<len/2) {
					arr[i]=arr[i].toUpperCase();
				}
				else {
					arr[i]=arr[i].toLowerCase();
				}
			}
		}
		return arr;
	}
}