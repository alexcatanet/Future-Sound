package com.example.android.futuresound.sound_activity;


import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ListView;
import com.example.android.futuresound.R;
import com.example.android.futuresound.Track;
import com.example.android.futuresound.track_adapter.TrackAdapter2;

import java.util.ArrayList;

public class SoundActivity_2 extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.track);
        if (getActionBar() != null) {
            getActionBar().setDisplayHomeAsUpEnabled(true);
        }

        ArrayList<Track> tracks = new ArrayList<>();
        tracks.add(new Track("Drawning", "Armin van Buuren"));
        tracks.add(new Track("Youtopia", "Armin van Buuren"));
        tracks.add(new Track("Minack", "Armin van Buuren"));
        tracks.add(new Track("Not Giving Up One Love", "Armin van Buuren"));
        tracks.add(new Track("Take A Moment", "Armin van Buuren"));
        tracks.add(new Track("Orbion", "Armin van Buuren"));
        tracks.add(new Track("These Silent Hearts", "Armin van Buuren"));
        tracks.add(new Track("Full Focus", "Armin van Buuren"));
        tracks.add(new Track("Virtual Friend", "Armin van Buuren"));
        tracks.add(new Track("Mirage", "Armin van Buuren"));

        TrackAdapter2 adapter = new TrackAdapter2(this, tracks);
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
