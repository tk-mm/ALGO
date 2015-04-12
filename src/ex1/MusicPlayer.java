package ex1;

import java.util.ArrayList;
import java.util.Collections;

public class MusicPlayer {
	private String name;
	private ArrayList<Album> albumList;
	
	public MusicPlayer(String name){
		this.name = name;
		albumList = new ArrayList<Album>();
	}
	public void add(Album album){
		albumList.add(album);
	}
	public void play(){
		for(Album list: albumList){
			list.play();
		}
	}
	public void shufflePlay(){
		System.out.println("ランダム再生");
		ArrayList<Music> shuffleList = new ArrayList<Music>();
		for(Album alist: albumList){
			shuffleList.addAll(alist.getMusicList());
		}
		Collections.shuffle(shuffleList);
		for(Music mlist: shuffleList){
			mlist.play();
		}
	}
	public static void main(String[] args){
		System.out.println("全曲再生");
		MusicPlayer musicPlayer = new MusicPlayer("hoge");
		
		Album album = new Album("なんだこれくしょん", "きゃりーぱみゅぱみゅ");
		album.add(new Music("なんだこれくしょん", "きゃりーぱみゅぱみゅ", 47, 3));
		album.add(new Music("にんじゃりばんばん", "きゃりーぱみゅぱみゅ",  246, 4));
		album.add(new Music("ふりそでーしょん", "きゃりーぱみゅぱみゅ", 245, 5));
		album.add(new Music("くらくら", "きゃりーぱみゅぱみゅ", 169, 3));
		album.add(new Music("おとななこども", "きゃりーぱみゅぱみゅ", 331, 3));
		
		Album album2 = new Album("艦これ", "吹雪");
		album2.add(new Music("駆逐艦", "夕立", 47, 3));
		album2.add(new Music("戦艦", "大和",  246, 4));
		album2.add(new Music("軽巡洋艦", "夕張", 245, 5));
		album2.add(new Music("重巡洋艦", "羽黒", 169, 3));
		album2.add(new Music("空母", "加賀", 331, 3));
		
		musicPlayer.add(album);
		musicPlayer.add(album2);
		
		musicPlayer.shufflePlay();
		
		
	}
}
