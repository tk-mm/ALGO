package ex1;

import java.util.ArrayList;

public class Album {
	private String title;
	private String artist;
	private ArrayList<Music> musicList;
	
	public Album(String title, String artist){
		this.title = title;
		this.artist = artist;
		musicList = new ArrayList<Music>();
	}
	public String getTitle(){
		return title;
	}
	public String getArtist(){
		return artist;
	}
	public ArrayList<Music> getMusicList(){
		return musicList;
	}
	public void add(Music music){
		musicList.add(music);
	}
	public int getTotalTime(){
		int sum = 0;
		for(Music list: musicList){
			sum += list.getTime();
		}
		return sum;
	}
	public double getRating(){
		double rate = 0;
		for(Music list: musicList){
			rate += list.getRating();
		}
		return rate/musicList.size();
	}
	public void play(){
		System.out.println("アルバム再生中: " + getTitle()
				+ " by " + getArtist() + " ("
				+ musicList.size() + "曲, " + getTotalTime()
				+ "sec. 評価: " + getRating() + ")");
		for(Music list: musicList){
			list.play();
		}
		System.out.println("再生終了");
	}
	public String toString(){
		return "anAlbum(" + title + ", " + artist + ", " + getMusicList().size() + ", " + getTotalTime() + ", " + getRating() + ")";
	}
	public static void main(String[] args){
		Album album = new Album("なんだこれくしょん", "きゃりーぱみゅぱみゅ");
		
		album.add(new Music("なんだこれくしょん", "きゃりーぱみゅぱみゅ", 47, 3));
		album.add(new Music("にんじゃりばんばん", "きゃりーぱみゅぱみゅ",  246, 4));
		album.add(new Music("ふりそでーしょん", "きゃりーぱみゅぱみゅ", 245, 5));
		album.add(new Music("くらくら", "きゃりーぱみゅぱみゅ", 169, 3));
		album.add(new Music("おとななこども", "きゃりーぱみゅぱみゅ", 331, 3));
		
		System.out.println(album);
		
		System.out.println("総再生時間: " + album.getTotalTime());
		System.out.println("アルバム評価: " + album.getRating());
		album.play();
		System.out.println("再生終了");
	}
}
