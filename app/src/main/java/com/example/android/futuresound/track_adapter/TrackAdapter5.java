package com.example.android.futuresound.track_adapter;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.android.futuresound.R;
import com.example.android.futuresound.Track;

import java.util.ArrayList;


public class TrackAdapter5 extends ArrayAdapter<Track> {

    public TrackAdapter5(Activity context, ArrayList<Track> tracks) {
        super(context, 0, tracks);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.song_list_5, parent, false);
        }
        // Get the {@link AndroidFlavor} object located at this position in the list
        Track currentTrack = getItem(position);
        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView trackArtistName = listItemView.findViewById(R.id.artist_name_list_5);
         /*
         Get the version name from the current AndroidFlavor object and
         set this text on the name TextView
         */
        assert currentTrack != null;
        trackArtistName.setText(currentTrack.getArtistName());
        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView trackName = listItemView.findViewById(R.id.track_name_5);
       /*
        Get the version number from the current AndroidFlavor object and
        set this text on the number TextView
        */
        trackName.setText(currentTrack.getTrackName());
          /*
        Return the whole list item layout (containing 2 TextViews and an ImageView)
        so that it can be shown in the ListView
        */
        return listItemView;
    }
}
