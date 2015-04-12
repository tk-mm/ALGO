package ex2;

import java.util.Deque;
import java.util.LinkedList;

public class StackByLinkedList {
	public static void main(String[] args){
		Deque<String> list = new LinkedList<String>();
		
		list.addFirst("Alice");
		list.addFirst("Bob");
		list.addFirst("Charlie");
		list.addFirst("Diana");
		list.addFirst("Elmo");
		list.addFirst("Fred");
		System.out.println(list);
		while(!list.isEmpty()){
			System.out.println(list.removeFirst());
		}
		System.out.println(list);
	}
	
	
	

}
