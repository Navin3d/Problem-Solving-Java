import java.util.List;
import java.util.ArrayList;

import models.Song;

public class MyClass {
	public static void main(String args[]) {
		Song song1 = new Song(1, "Ranga", "No Idea", 4.56);
		Song song2 = new Song(2, "Vathi COmming", "Aniruth", 5.56);
		Song song3 = new Song(3, "Vambula Thimbula", "No Idea", 1.56);
		
		// List<Song> songCollection = new ArrayList<>();
		// songCollection.add(song1);
		// songCollection.add(song2);
		// songCollection.add(song3);
		
		Song[] songCollection = new Song[5];
		songCollection[0] = song1;
		songCollection[1] = song2;
		songCollection[2] = song3;	
		
		System.out.println(findSongDurationForArtist(songCollection, "No Idea"));
		System.out.println("Sorted Array: ");
		
		Song[] songs = null;
		
		try {
			songs = getSongsInAscendingOrder(songCollection, "No Ida");
		} catch (Exception e){
			System.out.println("No Songs of the Artist Found...");
		}
		
		int songIndex = 0;
		
		try {
			while(songs[songIndex] != null) {
				System.out.println(songs[songIndex]);
				
				songIndex++;
			}
		} catch (Exception e) {
			
		}

	}
	
	public static String findSongDurationForArtist(Song[] songs, String artist) {
		double totaoDuration = 0;
		
		int songIndex = 0;
		
		while(songs[songIndex] != null) {
			if(songs[songIndex].getArtist().equals(artist))
				totaoDuration += songs[songIndex].getDuration();
			
			songIndex++;
		}
			
		String returnValue;
		
		if(totaoDuration > 0)
			returnValue = "" + totaoDuration;
		else
			returnValue = "No songs found for mentioned artist";
		
		return returnValue;
	}
	
	public static Song[] getSongsInAscendingOrder(Song[] songs, String artist) {
		
		Song temp = new Song();
		
		int top = 0;
		
		Song[] returnValue = new Song[5];
		
		int songIndex = 0;
		
		while(songs[songIndex] != null) {
			if(songs[songIndex].getArtist().equals(artist)){
				returnValue[top] = songs[songIndex];	
				top++;
			}				
			songIndex++;
		}
		
		if(returnValue[0].getArtist() == null)
			throw new RuntimeException();
		
		songIndex = 0;
				
		while(returnValue[songIndex] != null) {
			int j = songIndex + 1;
				while(returnValue[j] != null) {
					if(returnValue[songIndex].getDuration() > returnValue[j].getDuration()) {
						temp = returnValue[songIndex];    
						returnValue[songIndex] = returnValue[j];    
						returnValue[j] = temp;  
					}
					j++;
				}
			songIndex++;
		}
		
		return returnValue;
	}
}
