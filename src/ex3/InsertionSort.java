package ex3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class InsertionSort {
	private final int n = 50000;
	private int[] array = new int[n];
	
	public InsertionSort(String filename){
		try {
			@SuppressWarnings("resource")
			BufferedReader bf = new BufferedReader(new FileReader(filename));
			String line = null;
			int i = 0;
			while ((line = bf.readLine()) != null) {
				array[i] = Integer.parseInt(line);
				i++;
			}
		} catch (FileNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
	
	public void sort(){
		for(int i = 1; i < array.length; i++){
			for(int j = 0; j < i; j++){
				if (array[j] > array[i]) {
					int tmp = array[j];
					array[j] = array[i];
					array[i] = tmp;
				}
			}
		}
	}
	
	public void output(String filename){
		PrintWriter writer;
		try {
			writer = new PrintWriter(new BufferedWriter(
					new FileWriter(filename)));
			for (int i = 0; i < array.length; i++) {
				writer.println(array[i]);
			}
			writer.close();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		String file1 = "rand2.txt";
		String file2 = "result_ex3-3_rand2.txt";

		InsertionSort is = new InsertionSort(file1);
		long start, stop;
		start = System.currentTimeMillis();
		is.sort();
		stop = System.currentTimeMillis();
		System.out.println((stop - start) + "[ms]");
		is.output(file2);
	}
}
