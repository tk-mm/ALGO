package ex6;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
	public static void main(String[] args){
		Set<String> set = new HashSet<String>();
		
		set.add("Alice");
		set.add("Bob");
		set.add("Charlie");
		set.add("Diana");
		set.add("Elmo");
		set.add("Fred");
		set.add("Diana");
		set.add("Bob");
		
		for(String list: set){
			System.out.println(list);
		}
	}
}
