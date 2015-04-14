package ex6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RedundantInteger {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		array.add(1);
		array.add(2);
		array.add(2);
		array.add(3);
		array.add(3);
		array.add(3);
		array.add(4);
		array.add(4);
		array.add(4);
		array.add(4);
		System.out.println("整数追加");
		for(Integer list: array){
			System.out.println(list);
		}
		System.out.println("重複の削除");
		Set<Integer> set = new HashSet<Integer>(array);
		for(Integer list: set){
			System.out.println(list);
		}
	}

}
