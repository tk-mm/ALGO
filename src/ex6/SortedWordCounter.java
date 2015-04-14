package ex6;

import java.awt.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SortedWordCounter {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
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
			ArrayList<Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
			Collections.sort(list, new Comparator<Map.Entry<String, Integer>>(){
				public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2){
					return ((Integer)e2.getValue()).compareTo((Integer)e1.getValue());
				}
			});
			for(Entry<String, Integer> s: list){
				System.out.println(s.getKey() + " => " + s.getValue());
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
