package ex6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class WordCounter {
	public static void main(String[] args){
		try {
			BufferedReader bf = new BufferedReader(new FileReader("english.txt"));
			String line = null;
			Map<String, Integer> map = new HashMap<String, Integer>();
			while((line = bf.readLine()) != null){
				for(String str: line.split(" ")){
					int count = 1;
					if(map.containsKey(str)){
						map.put(str, map.get(str) + count);
					}else{
						map.put(str, count);
					}
				}
			}
			for(Map.Entry<String, Integer> list: map.entrySet()){
				System.out.println(list.getKey() + " => " + list.getValue());
			}
			
		} catch (FileNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}
