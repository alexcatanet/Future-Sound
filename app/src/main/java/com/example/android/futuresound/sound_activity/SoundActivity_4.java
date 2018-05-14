package com.example.android.futuresound.sound_activity;

import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ListView;
import com.example.android.futuresound.R;
import com.example.android.futuresound.Track;
import com.example.android.futuresound.track_adapter.TrackAdapter4;

import java.util.ArrayList;


public class SoundActivity_4 extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.track);
        if (getActionBar() != null) {
            getActionBar().setDisplayHomeAsUpEnabled(true);
        }

        ArrayList<Track> tracks = new ArrayList<>();
        tracks.add(new Track("Dare You", "HARDWELL"));
        tracks.add(new Track("Armin Only", "Prem Samji"));
        tracks.add(new Track("Erhu", "Armada Music"));
        tracks.add(new Track("Pompeii", "Audien"));
        tracks.add(new Track("Two Million", "Avicii"));
        tracks.add(new Track("Visions", "A State Of Trance"));
        tracks.add(new Track("Karma", "Yves V"));
        tracks.add(new Track("I Could Be The One", "Avicii"));
        tracks.add(new Track("Gaia", "A State Of Trance"));
        tracks.add(new Track("Scream", "Markus Schulz"));

        TrackAdapter4 adapter = new TrackAdapter4(this, tracks);
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
