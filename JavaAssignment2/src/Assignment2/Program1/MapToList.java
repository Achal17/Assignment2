//Write a program to convert map keys to list of strings                                                                                                                                                                                                                                                                                                               

package Assignment2.Program1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapToList {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Achal");
		map.put(2, "Kanchan");
		map.put(3, "Nimish");
		map.put(4, "Sonali");
		map.put(5, "Bhagyashri");
		
		List<Integer> ListOfKeys = null;
		List<String> ListOfValues = null;
		
		ListOfKeys = map.keySet().stream().collect(Collectors.toList());
		ListOfValues = map.values().stream().collect(Collectors.toList());
		
		System.out.println("List of Keys in map:");
		System.out.println(ListOfKeys);
		
		System.out.println("List of Values in map:");
		System.out.println(ListOfValues);
	}
}
