
/**
 * Desc : : Create a method which accepts the id and the age of people as a Map and decide if they are eligible for vote.
 * Author : Yerram Sahithi
 * Date : 4-11-2020
 *
 */import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EligibleForVote {
	public static void main(String[] args) {
	         Map<Integer,String> voterList=new HashMap<Integer,String>();
	         voterList.put(1234,"1999-11-06");
	         voterList.put(2567,"2005-11-22");
	         voterList.put(8930,"1998-01-25");
	         voterList.put(4846,"1995-08-11");
	         voterList.put(9732,"2006-03-18");
	         System.out.println("People eligible for vote are: ");
	         System.out.println(votersList (voterList));
		}
	public static List<Integer> votersList(Map<Integer,String> details)
	{
		Map<Integer,Integer> map=new HashMap<Integer, Integer>();
		List<Integer> list=new ArrayList<Integer>();
		for(Map.Entry<Integer,String> entry: details.entrySet())
		{
			LocalDate ll=LocalDate.parse(entry.getValue());
			Period period = Period.between(ll, LocalDate.now());
			int years=period.getYears();
			map.put(entry.getKey(),years);
			//checking if age is above 18 or not
			if(years>=18)
				list.add(entry.getKey());
		}
		return list;
	}
}
	
