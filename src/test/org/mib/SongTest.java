package org.mib;

import org.junit.Test;


import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.time.Duration;

import static org.junit.Assert.assertEquals;
@RunWith(JUnit4.class)
public class SongTest {

    @Test

    public void getPrettyDurationTest(){

        //arrange

        Song mySong=new Song("Title","Artist" ,Duration.ofSeconds(244));
        String expectedResult= String.format("%d:%02d:%02d",0,4,4);


        //act
        String prettyResult=mySong.getDurationPretty();

        //assert
        assertEquals("getDurationPretty returns a song^s length(duration)"+"into the format mm:ss",prettyResult,expectedResult);


    }



}
