package ex2;

import java.util.Comparator;

class NumericComparator implements Comparator<String> {
	public int compare(String str1, String str2){
		int s1 = Integer.valueOf(str1);
		int s2 = Integer.valueOf(str2);
		if(s1 > s2){
			return 1;
		}else if(s1 < s2){
			return -1;
		}else{
			return 0;
		}
	}
}
