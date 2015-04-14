package ex6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class SplitText {
	public static void main(String[] args){
		try {
			BufferedReader bf = new BufferedReader(new FileReader("english.txt"));
			String line = null;
			ArrayList<String> list = new ArrayList<String>();
			while((line = bf.readLine()) != null){
				for(String str: line.split(" ")){
					list.add(str);
				}
			}
			for(String str: list){
				System.out.println(str);
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
