package ex4;

import ex3.BubbleSort;
import ex3.InsertionSort;
import ex3.SelectionSort;

public class TestSort2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		long start, stop;
		String file1 = "rand2.txt";
		String file2 = "reverse2.txt";
		String file3 = "sorted2.txt";
		String file4 = "same2.txt";
		
		BubbleSort bs1 = new BubbleSort(file1);
		SelectionSort ss1 = new SelectionSort(file1);
		InsertionSort is1 = new InsertionSort(file1);
		QuickSort qs1 = new QuickSort(file1);
		MergeSort ms1 = new MergeSort(file1);
		System.out.println("rand2.txtのソート");
		start = System.currentTimeMillis();
		bs1.sort();
		stop = System.currentTimeMillis();
		System.out.println("　バブルソート：" + (stop - start) + "[ms]");
		start = System.currentTimeMillis();
		ss1.sort();
		stop = System.currentTimeMillis();
		System.out.println("　　選択ソート：" + (stop - start) + "[ms]");
		start = System.currentTimeMillis();
		is1.sort();
		stop = System.currentTimeMillis();
		System.out.println("　　挿入ソート：" + (stop - start) + "[ms]");
		start = System.currentTimeMillis();
		qs1.sort();
		stop = System.currentTimeMillis();
		System.out.println("クイックソート：" + (stop - start) + "[ms]");
		start = System.currentTimeMillis();
		ms1.sort();
		stop = System.currentTimeMillis();
		System.out.println("　マージソート：" + (stop - start) + "[ms]");

		BubbleSort bs2 = new BubbleSort(file2);
		SelectionSort ss2 = new SelectionSort(file2);
		InsertionSort is2 = new InsertionSort(file2);
		QuickSort qs2 = new QuickSort(file2);
		MergeSort ms2 = new MergeSort(file2);
		System.out.println("sorted2.txtのソート");
		start = System.currentTimeMillis();
		bs2.sort();
		stop = System.currentTimeMillis();
		System.out.println("　バブルソート：" + (stop - start) + "[ms]");
		start = System.currentTimeMillis();
		ss2.sort();
		stop = System.currentTimeMillis();
		System.out.println("　　選択ソート：" + (stop - start) + "[ms]");
		start = System.currentTimeMillis();
		is2.sort();
		stop = System.currentTimeMillis();
		System.out.println("　　挿入ソート：" + (stop - start) + "[ms]");
		start = System.currentTimeMillis();
		qs2.sort();
		stop = System.currentTimeMillis();
		System.out.println("クイックソート：" + (stop - start) + "[ms]");
		start = System.currentTimeMillis();
		ms2.sort();
		stop = System.currentTimeMillis();
		System.out.println("　マージソート：" + (stop - start) + "[ms]");
		
		BubbleSort bs3 = new BubbleSort(file3);
		SelectionSort ss3 = new SelectionSort(file3);
		InsertionSort is3 = new InsertionSort(file3);
		QuickSort qs3 = new QuickSort(file3);
		MergeSort ms3 = new MergeSort(file3);
		System.out.println("reverse2.txtのソート");
		start = System.currentTimeMillis();
		bs3.sort();
		stop = System.currentTimeMillis();
		System.out.println("　バブルソート：" + (stop - start) + "[ms]");
		start = System.currentTimeMillis();
		ss3.sort();
		stop = System.currentTimeMillis();
		System.out.println("　　選択ソート：" + (stop - start) + "[ms]");
		start = System.currentTimeMillis();
		is3.sort();
		stop = System.currentTimeMillis();
		System.out.println("　　挿入ソート：" + (stop - start) + "[ms]");
		start = System.currentTimeMillis();
		qs3.sort();
		stop = System.currentTimeMillis();
		System.out.println("クイックソート：" + (stop - start) + "[ms]");
		start = System.currentTimeMillis();
		ms3.sort();
		stop = System.currentTimeMillis();
		System.out.println("　マージソート：" + (stop - start) + "[ms]");
		
		BubbleSort bs4 = new BubbleSort(file4);
		SelectionSort ss4 = new SelectionSort(file4);
		InsertionSort is4 = new InsertionSort(file4);
		QuickSort qs4 = new QuickSort(file4);
		MergeSort ms4 = new MergeSort(file4);
		System.out.println("same2.txtのソート");
		start = System.currentTimeMillis();
		bs4.sort();
		stop = System.currentTimeMillis();
		System.out.println("　バブルソート：" + (stop - start) + "[ms]");
		start = System.currentTimeMillis();
		ss4.sort();
		stop = System.currentTimeMillis();
		System.out.println("　　選択ソート：" + (stop - start) + "[ms]");
		start = System.currentTimeMillis();
		is4.sort();
		stop = System.currentTimeMillis();
		System.out.println("　　挿入ソート：" + (stop - start) + "[ms]");
		start = System.currentTimeMillis();
		qs4.sort();
		stop = System.currentTimeMillis();
		System.out.println("クイックソート：" + (stop - start) + "[ms]");
		start = System.currentTimeMillis();
		ms4.sort();
		stop = System.currentTimeMillis();
		System.out.println("　マージソート：" + (stop - start) + "[ms]");
	}

}
