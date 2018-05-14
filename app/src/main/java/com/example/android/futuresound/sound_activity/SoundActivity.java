package com.example.android.futuresound.sound_activity;


import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ListView;
import com.example.android.futuresound.R;
import com.example.android.futuresound.Track;
import com.example.android.futuresound.track_adapter.TrackAdapter;

import java.util.ArrayList;

public class SoundActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.track);
        if (getActionBar() != null) {
            getActionBar().setDisplayHomeAsUpEnabled(true);
        }

        ArrayList<Track> tracks = new ArrayList<>();
        tracks.add(new Track("Club Embrace", "Armin van Buuren"));
        tracks.add(new Track("Hymne", "Armin van Buuren"));
        tracks.add(new Track("In And Out Of Love", "Armin van Buuren"));
        tracks.add(new Track("In 10 Years From Now", "Armin van Buuren"));
        tracks.add(new Track("Burned With Desire", "Armin van Buuren"));
        tracks.add(new Track("Face To Face", "Armin van Buuren"));
        tracks.add(new Track("Last Stop Before Heaven", "Armin van Buuren"));
        tracks.add(new Track("Unforgivable", "Armin van Buuren"));
        tracks.add(new Track("Another You", "Armin van Buuren"));
        tracks.add(new Track("Waiting For The Night", "Armin van Buuren"));

        TrackAdapter adapter = new TrackAdapter(this, tracks);
        ListView listView = findViewById(R.id.track);
        listView.setAdapter(adapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            //Respond to the action bar's Up/Home button
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
