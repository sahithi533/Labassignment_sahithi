import java.io.File;
import java.util.Scanner;

public class FileDetails {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter file name: ");
		String fileName=sc.next();
		File file=new File(fileName);
		System.out.println("File details are:");
		System.out.println("name    : "+file.getName());
		System.out.println("exists  : "+file.exists());
		System.out.println("read    : "+file.canRead());
		System.out.println("write   : "+file.canWrite());
		System.out.println("length of file in bytes:"+fileName.length());
	}
}

