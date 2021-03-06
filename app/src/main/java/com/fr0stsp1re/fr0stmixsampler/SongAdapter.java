package com.fr0stsp1re.fr0stmixsampler;
import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;



import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    private static final String LOG_TAG = com.fr0stsp1re.fr0stmixsampler.SongAdapter.class.getSimpleName();

    public SongAdapter(Activity context, ArrayList<Song> songs) {
         super(context, 0, songs);
    }

    // View and inflate
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_alt, parent, false);
        }

        final Song currentSong = getItem(position);

        // set views to values of current song

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.default_textview);
        nameTextView.setText(currentSong.getmSongName());

        TextView numberTextView = (TextView) listItemView.findViewById(R.id.info2_textview);
        numberTextView.setText(currentSong.getmAlbumName());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image_1);
       iconView.setImageResource(currentSong.getImageResourceId());

        return listItemView;
    }
}