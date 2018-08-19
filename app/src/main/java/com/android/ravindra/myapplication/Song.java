package com.android.ravindra.myapplication;

import android.widget.ImageView;

/**
 * Created by Ravindra on 27-Nov-16.
 */
public class Song {
    private long id;
    private String title;
    private String artist;
    private ImageView image;

    public Song(long songID, String songTitle, String songArtist, ImageView songImage) {
        id = songID;
        title = songTitle;
        artist = songArtist;
        image = songImage;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public ImageView getImage() {
        return image;
    }
}