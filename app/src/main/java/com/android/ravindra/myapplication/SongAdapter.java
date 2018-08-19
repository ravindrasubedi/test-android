package com.android.ravindra.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Ravindra on 27-Nov-16.
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
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        //map to song layout
        LinearLayout songLayout = (LinearLayout)songInf.inflate
                (R.layout.song, parent, false);
        //get title and artist views
        ImageView imageView = (ImageView) songLayout.findViewById(R.id.imageView);
        TextView songView = (TextView) songLayout.findViewById(R.id.song_title);
        //TextView artistView = (TextView)songLay.findViewById(R.id.song_artist);
        //get song using position
        Song currSong = songs.get(position);
        //get title and artist strings
        songView.setText(currSong.getTitle());
        //artistView.setText(currSong.getArtist());
        //set position as tag
        if(currSong.getImage() == null) {
            imageView.setImageResource(R.drawable.ic_music_video_white_24dp);
        }
        else {
            imageView.setImageDrawable(currSong.getImage().getDrawable());
        }
        songLayout.setTag(position);
        return songLayout;
    }
}
