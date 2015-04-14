package ex6;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
	public static void main(String[] args){
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("tomato", "トマト");
		map.put("strawberry", "苺");
		map.put("orange", "蜜柑");
		map.put("onion", "玉葱");
		map.put("apple", "林檎");
		map.put("banana", "バナナ");
		
		System.out.println("エントリ一覧");
		for(Map.Entry<String, String> entry: map.entrySet()){
			System.out.println(entry.getKey() + " => " + entry.getValue());
		}
		System.out.println();
		System.out.println("キー一覧");
		for(String key: map.keySet()){
			System.out.println(key);
		}
		System.out.println();
		System.out.println("値一覧");
		for(String value: map.values()){
			System.out.println(value);
		}
	}
}
