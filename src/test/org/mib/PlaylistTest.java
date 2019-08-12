package org.mib;

import org.junit.Test;


import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.time.Duration;
import java.util.ArrayList;

import org.mib.Song;
import static org.junit.Assert.assertEquals;
@RunWith(JUnit4.class)

public class PlaylistTest {



@Test
    public void checkEmptyList(){

    Playlist play1=new Playlist();

    int expectedResult=0;
    int checkPlaylistLength=play1.getSonglist().size();

    assertEquals("The playlist should be empty",expectedResult,checkPlaylistLength);
}


    @Test
    public void checkListOnSongAdd(){

        Playlist play1=new Playlist();
        Song s=new  Song("Omkar","Omkar",Duration.ofSeconds(3599));
        int expectedResult=1;
        int checkPlaylistLength=play1.addSong(s);

        assertEquals("The playlist should be empty",expectedResult,checkPlaylistLength);
    }


    @Test
    public void checkListOnSongRemove(){

        Playlist play1=new Playlist();
        Song s=new  Song("Omkar","Omkar",Duration.ofSeconds(3599));
        String name="Omkar";
        int expectedResult=0;
        play1.addSong(s);
        int checkPlaylistLength=play1.removeSong(s);


        assertEquals("The playlist should be empty",expectedResult,checkPlaylistLength);
    }


    @Test
    public void shufflePlayListTest(){

        Playlist play1=new Playlist();
        Song s1=new  Song("Omkar","Omkar",Duration.ofSeconds(100));
        Song s2=new  Song("Md","Md",Duration.ofSeconds(200));
        Song s3=new  Song("abcd","abcd",Duration.ofSeconds(300));
        String name="Omkar";

        play1.addSong(s1);
        play1.addSong(s2);

        int expectedResult=1;


      play1.suffleSong(s3,1);
        int accual= play1.getSonglist().indexOf(s3);

        assertEquals("The playlist should be empty",expectedResult,accual);
    }



    @Test
    public void checkTotalDurationTest(){

       Duration expectedResult=Duration.ofSeconds(600);
        Playlist play1=new Playlist();
        Song s1=new  Song("Omkar","Omkar",Duration.ofSeconds(100));
        Song s2=new  Song("Md","Md",Duration.ofSeconds(200));
        Song s3=new  Song("abcd","abcd",Duration.ofSeconds(300));
        play1.addSong(s1);
        play1.addSong(s2);
        play1.addSong(s3);

        Duration actual=play1.prettyplaylistDuration();




        assertEquals("The playlist should be empty",expectedResult,actual);
    }





}
