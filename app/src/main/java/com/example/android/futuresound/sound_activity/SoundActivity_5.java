package com.example.android.futuresound.sound_activity;


import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ListView;
import com.example.android.futuresound.R;
import com.example.android.futuresound.Track;
import com.example.android.futuresound.track_adapter.TrackAdapter5;

import java.util.ArrayList;

public class SoundActivity_5 extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.track);
        if (getActionBar() != null) {
            getActionBar().setDisplayHomeAsUpEnabled(true);
        }

        ArrayList<Track> tracks = new ArrayList<>();
        tracks.add(new Track("Here Tonight", "Dash Berlin"));
        tracks.add(new Track("Underneath The Sky", "Dash Berlin"));
        tracks.add(new Track("Never Let You Go", "Dash Berlin"));
        tracks.add(new Track("People Of The Night", "Dash Berlin"));
        tracks.add(new Track("Somehow", "Dash Berlin"));
        tracks.add(new Track("Earth Meets Water", "Dash Berlin"));
        tracks.add(new Track("Leave It All Behind", "Dash Berlin"));
        tracks.add(new Track("Shelter", "Dash Berlin"));
        tracks.add(new Track("Here Tonight", "Dash Berlin"));
        tracks.add(new Track("Never Let You Go", "Dash Berlin"));

        TrackAdapter5 adapter = new TrackAdapter5(this, tracks);
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
