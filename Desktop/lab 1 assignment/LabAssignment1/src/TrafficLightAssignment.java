/**
 * Desc : simulation a traffic light
 * Author : Yerram Sahithi
 * Date : 22-10-2020
 *
 */

import java.util.Scanner;

public class TrafficLightAssignment {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String lights="Red,Yellow,Green";
		System.out.println("Select your choice from:  ");
		System.out.println("red");
		System.out.println("yellow");
		System.out.println("green");
		String choice=sc.nextLine();
		//logic for output
		switch(choice) {
			case "red":
				System.out.println("Stop");
				break;
			case "yellow":
				System.out.println("Ready");
				break;	
			case "green":	
				System.out.println("Go");
				break;
			default :
				System.out.println("Wrong Choice");
				break;	
		}
	}
}