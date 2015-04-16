package ex2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TestCollectionSort {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		final int n = 50000;
	    List <String> list = new ArrayList<String>();
	    String file1 = "rand2.txt";
	    String file2 = "result_ex2-1.txt";

	    // file1からデータを入力
	    // ここを作る
	    // ファイルを開いて全て読み込んでリストlistに入れる
	    try {
			BufferedReader br = new BufferedReader(new FileReader(file1));
			String str;
			while((str = br.readLine()) != null){
				list.add(str);
			}
		} catch (FileNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	    Collections.sort(list);

	    // file2に結果を出力
	    // ここを作る
	    // ファイルを開いてリストlistを出力する（1行に1つのデータ）
		PrintWriter writer;
		try {
			writer = new PrintWriter(new BufferedWriter(new FileWriter(file2)));
			for(String line1: list){
				writer.println(line1);
			}
			writer.close();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		
	}

}
