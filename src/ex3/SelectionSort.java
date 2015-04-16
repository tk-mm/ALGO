package ex3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SelectionSort {
	private final int n = 50000;
	private int[] array = new int[n];

	public SelectionSort(String filename) {
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

	public void sort() {
		for(int i = 0; i < array.length; i++){
			int index = 0;
			int tmp = array[i];
			for(int j = array.length - 1; j >= i; j--){
				if(tmp >= array[j]){
					tmp = array[j];
					index = j;
				}
			}
			tmp = array[i];
			array[i] = array[index];
			array[index] = tmp;
		}
	}

	public void output(String filename) {
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

	public static void main(String[] args) {
		String file1 = "rand2.txt";
		String file2 = "result_ex3-2_rand2.txt";

		SelectionSort ss = new SelectionSort(file1);
		long start, stop;
		start = System.currentTimeMillis();
		ss.sort();
		stop = System.currentTimeMillis();
		System.out.println((stop - start) + "[ms]");
		ss.output(file2);
	}
}
