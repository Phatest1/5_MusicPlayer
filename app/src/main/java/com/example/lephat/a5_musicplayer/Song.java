package com.example.lephat.a5_musicplayer;

import android.net.Uri;

/**
 * Created by Le Phat on 02-Nov-17.
 */

public class Song {
    private long id;
    private String title;
    private String artist;
    private Uri cover;



    public Song(long songID, String songTitle, String songArtist, Uri songCover) {
        id = songID;
        title = songTitle;
        artist = songArtist;
        cover = songCover;
    }

    public long getID(){return id;}
    public String getTitle(){return title;}
    public String getArtist(){return artist;}
    public Uri getCover() {return cover;}
}
