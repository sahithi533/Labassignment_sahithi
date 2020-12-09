/**
 * Desc :  Create a method which accepts a hash map and return the values of the map in sorted order as a List.
 * Author : Yerram Sahithi
 * Date : 4-11-2020
 *
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class HashMapSorting {
	public static void main(String[] args) {
		HashMap<Integer,Integer> hashMapValues = new HashMap<>();
		hashMapValues.put(1, 67);
		hashMapValues.put(2, 10);
		hashMapValues.put(3, 45);
		hashMapValues.put(4, 90);
		hashMapValues.put(5, 5);
		List<Integer> sortedValues=getValues(hashMapValues);
		System.out.println("Sorted values are:"+ "\n"+sortedValues);
	}
	
	//method to sort the list
	public static List<Integer> getValues(HashMap<Integer,Integer> mapValues){
		List<Integer> sortedList = new ArrayList<>();
		Set<Integer> set = mapValues.keySet();
		for(Integer i: set) {
			sortedList.add(mapValues.get(i));
		}
		//collections to sort list
		return sortedList.stream().sorted().collect(Collectors.toList());
		
	}
}
