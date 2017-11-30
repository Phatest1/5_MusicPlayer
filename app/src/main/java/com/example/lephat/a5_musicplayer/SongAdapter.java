package com.example.lephat.a5_musicplayer;

import android.media.Image;
import android.media.MediaMetadataRetriever;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Le Phat on 02-Nov-17.
 */

public class SongAdapter extends BaseAdapter {
    private ArrayList<Song> songs;
    private LayoutInflater songInf;

    public SongAdapter(Context c, ArrayList<Song> theSongs) {
        songs = theSongs;
        songInf = LayoutInflater.from(c);
    }

    @Override
    public int getCount() {
        return songs.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //map to song layout
        LinearLayout songLay = (LinearLayout) songInf.inflate
                (R.layout.song, parent, false);
        //get title and artist views
        TextView songView = (TextView) songLay.findViewById(R.id.song_title);
        TextView artistView = (TextView) songLay.findViewById(R.id.song_artist);
        ImageView imageView = (ImageView) songLay.findViewById(R.id.song_image);


        //get song using position
        Song currSong = songs.get(position);
        //get title and artist strings
        songView.setText(currSong.getTitle());
        artistView.setText(currSong.getArtist());
        imageView.setImageURI(currSong.getCover());
        android.media.MediaMetadataRetriever mmr = new MediaMetadataRetriever();
        mmr.setDataSource(imageView,currSong.getCover());
        //set position as tag
        songLay.setTag(position);
        return songLay;
    }
}
