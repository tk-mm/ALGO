package ex6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordSearcher {
	public static void main(String[] args){
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("tomato", "トマト");
		map.put("strawberry", "苺");
		map.put("orange", "蜜柑");
		map.put("onion", "玉葱");
		map.put("apple", "林檎");
		map.put("banana", "バナナ");
		
		System.out.println("英単語を入力してください。");
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String str = sc.nextLine();
			if(map.containsKey(str)){
				System.out.println(str + "の意味は[" + map.get(str) + "]です。");
			}else{
				System.out.println("吾輩の辞書に" + str + "という語はない。");
			}
		}
	}
}
