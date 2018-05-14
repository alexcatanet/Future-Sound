package com.example.android.futuresound.sound_activity;


import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ListView;
import com.example.android.futuresound.R;
import com.example.android.futuresound.Track;
import com.example.android.futuresound.track_adapter.TrackAdapter7;

import java.util.ArrayList;

public class SoundActivity_7 extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.track);
        if (getActionBar() != null) {
            getActionBar().setDisplayHomeAsUpEnabled(true);
        }

        ArrayList<Track> tracks = new ArrayList<>();
        tracks.add(new Track("Eiforya", "Armin van Buuren"));
        tracks.add(new Track("This Is What It Feels Like", "Armin van Buuren"));
        tracks.add(new Track("Remember This", "Markus Schulz"));
        tracks.add(new Track("Intense", "Andrew Rayel"));
        tracks.add(new Track("Find You", "Dash Berlin"));
        tracks.add(new Track("Goodbye", "Andrew Rayel"));
        tracks.add(new Track("Cubic", "Jochen Miller"));
        tracks.add(new Track("Shadow", "Mark Sixma"));
        tracks.add(new Track("Here Tonight", "Jay Cosmic"));
        tracks.add(new Track("Blast", "Richard Durand"));

        TrackAdapter7 adapter = new TrackAdapter7(this, tracks);
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
