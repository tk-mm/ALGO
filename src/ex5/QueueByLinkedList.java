package ex5;

import java.util.Deque;
import java.util.LinkedList;

public class QueueByLinkedList {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Deque<String> list = new LinkedList<String>();
		
		list.addLast("Alice");
		list.addLast("Bob");
		list.addLast("Charlie");
		list.addLast("Diana");
		list.addLast("Elmo");
		list.addLast("Fred");
		System.out.println(list);
		System.out.println("=========");
		System.out.println(list.size());
		while(!list.isEmpty()){
			System.out.println(list.removeFirst());
		}
		System.out.println(list);
	}

}
