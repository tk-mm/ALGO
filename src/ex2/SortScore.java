package ex2;

import java.util.ArrayList;
import java.util.Collections;

public class SortScore {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		ArrayList<Score> score = new ArrayList<Score>();
		
		score.add(new Score("taro", 12, 97));
		score.add(new Score("jiro", 42, 54));
		score.add(new Score("sabu", 42, 47));
		score.add(new Score("siro", 57, 97));
		score.add(new Score("goro", 87, 40));
		score.add(new Score("roku", 99, 99));
		score.add(new Score("nana", 14, 23));
		score.add(new Score("hati", 42, 54));
		
		System.out.println("ソート前");
		for(Score s: score){
			System.out.println(s.getName() + " : Math: " + s.getMath() + " : English : " + s.getEnglish());
		}
		
		Collections.sort(score);
		
		System.out.println("ソート後");
		for(Score s: score){
			System.out.println(s.getName() + " : Math: " + s.getMath() + " : English : " + s.getEnglish());
		}
	}
}
