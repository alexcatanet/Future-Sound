package com.example.android.futuresound;


public class Track {
    private String mArtistName;
    private String mTrackName;

    public Track(String trackName, String artistName) {
        mTrackName = trackName;
        mArtistName = artistName;
    }

    public String getTrackName() {
        return mTrackName;
    }

    public String getArtistName() {
        return mArtistName;
    }
}
