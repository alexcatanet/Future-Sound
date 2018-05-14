package com.example.android.futuresound;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.futuresound.play_stage_design.PlayStage;
import com.example.android.futuresound.play_stage_design.PlayStage_2;
import com.example.android.futuresound.play_stage_design.PlayStage_3;
import com.example.android.futuresound.play_stage_design.PlayStage_4;
import com.example.android.futuresound.play_stage_design.PlayStage_5;
import com.example.android.futuresound.play_stage_design.PlayStage_6;
import com.example.android.futuresound.play_stage_design.PlayStage_7;
import com.example.android.futuresound.play_stage_design.PlayStage_8;
import com.example.android.futuresound.sound_activity.SoundActivity;
import com.example.android.futuresound.sound_activity.SoundActivity_2;
import com.example.android.futuresound.sound_activity.SoundActivity_3;
import com.example.android.futuresound.sound_activity.SoundActivity_4;
import com.example.android.futuresound.sound_activity.SoundActivity_5;
import com.example.android.futuresound.sound_activity.SoundActivity_6;
import com.example.android.futuresound.sound_activity.SoundActivity_7;
import com.example.android.futuresound.sound_activity.SoundActivity_8;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView albumName = findViewById(R.id.artist_title);
        albumName.setOnClickListener(this);

        TextView albumName2 = findViewById(R.id.artist_title2);
        albumName2.setOnClickListener(this);

        TextView albumName3 = findViewById(R.id.artist_title3);
        albumName3.setOnClickListener(this);

        TextView albumName4 = findViewById(R.id.artist_title5);
        albumName4.setOnClickListener(this);

        TextView albumName5 = findViewById(R.id.artist_title4);
        albumName5.setOnClickListener(this);

        TextView albumName6 = findViewById(R.id.artist_title6);
        albumName6.setOnClickListener(this);

        TextView albumName7 = findViewById(R.id.artist_title7);
        albumName7.setOnClickListener(this);

        TextView albumName8 = findViewById(R.id.artist_title8);
        albumName8.setOnClickListener(this);

        ImageView albumView = findViewById(R.id.artwork);
        albumView.setOnClickListener(this);

        ImageView albumView2 = findViewById(R.id.artwork2_image);
        albumView2.setOnClickListener(this);

        ImageView albumView3 = findViewById(R.id.artwork3);
        albumView3.setOnClickListener(this);

        ImageView albumView4 = findViewById(R.id.artwork4);
        albumView4.setOnClickListener(this);

        ImageView albumView5 = findViewById(R.id.artwork5);
        albumView5.setOnClickListener(this);

        ImageView albumView6 = findViewById(R.id.artwork6);
        albumView6.setOnClickListener(this);

        ImageView albumView7 = findViewById(R.id.artwork7);
        albumView7.setOnClickListener(this);

        ImageView albumView8 = findViewById(R.id.artwork8);
        albumView8.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.artist_title:
                Intent albumTrack = new Intent(MainActivity.this, SoundActivity.class);
                startActivity(albumTrack);
                break;
            case R.id.artist_title2:
                Intent albumTrack2 = new Intent(MainActivity.this, SoundActivity_2.class);
                startActivity(albumTrack2);
                break;
            case R.id.artist_title3:
                Intent albumTrack3 = new Intent(MainActivity.this, SoundActivity_3.class);
                startActivity(albumTrack3);
                break;
            case R.id.artist_title4:
                Intent albumTrack4 = new Intent(MainActivity.this, SoundActivity_5.class);
                startActivity(albumTrack4);
                break;
            case R.id.artist_title5:
                Intent albumTrack5 = new Intent(MainActivity.this, SoundActivity_4.class);
                startActivity(albumTrack5);
                break;
            case R.id.artist_title6:
                Intent albumTrack6 = new Intent(MainActivity.this, SoundActivity_6.class);
                startActivity(albumTrack6);
                break;
            case R.id.artist_title7:
                Intent albumTrack7 = new Intent(MainActivity.this, SoundActivity_7.class);
                startActivity(albumTrack7);
                break;
            case R.id.artist_title8:
                Intent albumTrack8 = new Intent(MainActivity.this, SoundActivity_8.class);
                startActivity(albumTrack8);
                break;
            case R.id.artwork:
                Intent albumView = new Intent(MainActivity.this, PlayStage.class);
                startActivity(albumView);
                break;
            case R.id.artwork2_image:
                Intent albumView2 = new Intent(MainActivity.this, PlayStage_2.class);
                startActivity(albumView2);
                break;
            case R.id.artwork3:
                Intent albumView3 = new Intent(MainActivity.this, PlayStage_3.class);
                startActivity(albumView3);
                break;
            case R.id.artwork4:
                Intent albumView4 = new Intent(MainActivity.this, PlayStage_4.class);
                startActivity(albumView4);
                break;
            case R.id.artwork5:
                Intent albumView5 = new Intent(MainActivity.this, PlayStage_5.class);
                startActivity(albumView5);
                break;
            case R.id.artwork6:
                Intent albumView6 = new Intent(MainActivity.this, PlayStage_6.class);
                startActivity(albumView6);
                break;
            case R.id.artwork7:
                Intent albumView7 = new Intent(MainActivity.this, PlayStage_7.class);
                startActivity(albumView7);
                break;
            case R.id.artwork8:
                Intent albumView8 = new Intent(MainActivity.this, PlayStage_8.class);
                startActivity(albumView8);
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
}