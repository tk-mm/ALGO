package ex4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MergeSort {

	private final int n = 50000;
	private int[] a = new int[n];

	public MergeSort(String filename) {
		try {
			@SuppressWarnings("resource")
			BufferedReader bf = new BufferedReader(new FileReader(filename));
			String line = null;
			int i = 0;
			while ((line = bf.readLine()) != null) {
				a[i] = Integer.parseInt(line);
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

	private void mergesort(int low, int high) {
		// ここを作る
		// マージソートを実装する
		// 配列aの中身をソートする
		if(low < high){
			int middle = (low + high) / 2;
			mergesort(low, middle);
			mergesort(middle + 1, high);
			int[] tmp = new int[a.length];
			for(int i = low; i <= high; i++){
				tmp[i] = a[i];
			}
			int left = low;
			int right = middle + 1;
			int current = low;
			while(left <= middle && right <= high){
				if(tmp[left] <= tmp[right]){
					a[current] = tmp[left];
					left++;
				}else{
					a[current] = tmp[right];
					right++;
				}
				current++;
			}
			int re = middle - left;
			for(int i = 0; i <= re; i++){
				a[current + i] = tmp[left + i];
			}
		}
	}

	public void sort() {
		mergesort(0, a.length - 1);
	}

	public void output(String filename) {
		PrintWriter writer;
		try {
			writer = new PrintWriter(new BufferedWriter(
					new FileWriter(filename)));
			for (int i = 0; i < a.length; i++) {
				writer.println(a[i]);
			}
			writer.close();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		String file1 = "rand2.txt";
		String file2 = "result_ex4-2_rand2.txt";

		MergeSort ms = new MergeSort(file1);
		long start, stop;
		start = System.currentTimeMillis();
		ms.sort();
		stop = System.currentTimeMillis();
		System.out.println((stop - start) + "[ms]");
		ms.output(file2);
	}
}
