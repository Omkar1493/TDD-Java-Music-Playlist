package org.mib;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;



public class Playlist {
	private String name;
	private List<Song> songlist;



	public Playlist() {
		songlist = new ArrayList<Song>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Song> getSonglist() {
		return songlist;
	}


	public int addSong(Song s) {

		 songlist.add(s);
		return songlist.size();
	}
    public int removeSong(Song s){

		songlist.remove(s);
		return songlist.size();

	}

	public void suffleSong(Song song,int newIndex) {

		songlist.add(newIndex,song);

	}

	public Duration prettyplaylistDuration() {


//		Duration total=Duration.ofSeconds(0);

		return songlist.stream().map(song->song.getDuration()).reduce(Duration.ofSeconds(0),((duration, duration2) -> duration.plus(duration2)));
//
//		for (Song s:songlist){
//			total=total.plus(s.getDuration());}
//		return total;


	}
}
