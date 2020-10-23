/**
 * Desc : Program to store salutations and names using jagged array and display output.
 * @author Yerram Sahiti
 * Date : 23-10-2020
 */

public class SalutationsNNames {
	
	public static void main(String[] args) {
		
		//declaration,instantiation and initializing 
		
		String name[][]=new String[2][];
		
		//initializing values of innermost array
		
		name[0]=new String[] {"Mr","Mrs","Ms"};             									//fixed salutation values
		name[1]=new String[] {"Pratik","Aishwarya","Surya","Dishanth","Somesh","Praveen"};      // names
		
		//logic
		
		for(int i=0;i<=5;i++) {
			if(name[1][i]=="Pratik" || name[1][i]=="Dishanth" || name[1][i]=="Somesh" || name[1][i]=="Praveen") {
				System.out.println(name[0][0]+". "+name[1][i]);
			}
			else if(name[1][i]=="Surya") {
				System.out.println(name[0][1]+". "+name[1][i]);
			}
			else {
				System.out.println(name[0][2]+". "+name[1][i]);
			}
		}
	}
}
