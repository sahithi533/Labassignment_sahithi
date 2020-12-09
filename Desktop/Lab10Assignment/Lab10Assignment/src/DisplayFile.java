import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
public class DisplayFile {
	public static void main(String args[])throws IOException
    {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter file name: ");
		String fileName=sc.next();
		FileInputStream file=new FileInputStream(fileName);
        System.out.println("Contents of the file are");
        int count=file.available();
        //return number of bytes that can be read
        int lineNumber=1;
        //logic to print number before each line file
        System.out.print(lineNumber+": ");
        char ch;
        for(int i=0;i<count;i++)
        {
        	ch=(char)file.read();
            System.out.print(ch);
            if(ch=='\n')
            {
            	System.out.print(++lineNumber+": ");                           
            }
        }
    }
}
