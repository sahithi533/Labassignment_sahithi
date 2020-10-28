/**
 * desc: Program to read a line of integers and then displays each integer and the sum of all integers
 * author@ Yerram Sahithi
 * Date: 27-10-2020
 */

import java.util.*;
public class SumOfIntegers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,sum=0;
		System.out.println("Enter the numbers by giving space between them: ");
		String numbers=sc.nextLine();
		StringTokenizer st=new StringTokenizer(numbers, " ");           //space is used to consider each number as separate integer 
		while(st.hasMoreTokens()) {
			String temporary=st.nextToken();
			n=Integer.parseInt(temporary);
			System.out.println(n);
			sum=sum+n;
		}
		System.out.println("Sum of integers are: "+sum);
	}
}