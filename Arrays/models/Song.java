package models;

public class Song {
	private int songId;
	private String title;
	private String artist;
	private double duration;
	
	public Song() {
	}
	
	public Song(int songId, String title, String artist, double duration) {
		this.title = title;
		this.songId = songId;
		this.artist = artist;
		this.duration = duration;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public int getSongId() {
		return this.songId;
	}
	
	public String getArtist() {
		return this.artist;
	}
	
	public double getDuration() {
		return this.duration;
	}
	
	public void setTitle(int songId) {
		this.title = title;
	}
	
	public void setSongId(String title) {
		this.songId = songId;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public void setDuration(double duration) {
		this.duration = duration;
	}
	
	public String toString() {
		return ("Id: " + this.songId + " Title: " + this.title + " Artist: " + this.artist + " Duration: " + this.duration);
	}
	
}