/**
 * Desc :Write a function which accepts the marks of students as a Hashmap and return the details of the students eligible for the medals along with type of medal. 
 * Author : Yerram Sahithi
 * Date : 4-11-2020
 *
 */
import java.util.HashMap;
import java.util.Map;

public class MedalType {
	public static void main(String[] args) {
		Map<Integer,Integer> mapMarks=new HashMap<Integer,Integer>();
		//adding marks of students
		mapMarks.put(1,55);
		mapMarks.put(2,60);
		mapMarks.put(3,80);
		mapMarks.put(4,91);
	    System.out.println(getStudents(mapMarks));
	}
	
	//method to find medal type for student and return type
	
	public static Map<Integer,String> getStudents(Map<Integer,Integer> marks)
	{
		Map<Integer,String> medalType=new HashMap<Integer, String>();
		 for(Map.Entry<Integer,Integer> entry:marks.entrySet())
		 {
			 //logic to find medal for students
			 if(entry.getValue()>=90)
			 {
				 medalType.put(entry.getKey(),"Gold");
			 }
			 else if(entry.getValue()>=80 && entry.getValue()<90)
			 {
				 medalType.put(entry.getKey(),"Silver");
			 }
			 else if(entry.getValue()>=70 && entry.getValue()<80)
			 {
				 medalType.put(entry.getKey(),"Bronze");
			 }
		 }
		return medalType;
	}
}
