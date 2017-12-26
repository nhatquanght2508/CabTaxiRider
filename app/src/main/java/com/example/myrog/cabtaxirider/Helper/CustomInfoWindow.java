package com.example.myrog.cabtaxirider.Helper;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.example.myrog.cabtaxirider.R;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

/**
 * Created by My Rog on 11/28/2017.
 */

public class CustomInfoWindow implements GoogleMap.InfoWindowAdapter {

    View myview;

    public CustomInfoWindow(Context context) {
       myview = LayoutInflater.from(context)
               .inflate(R.layout.custom_rider_info_window,null);
    }

    @Override
    public View getInfoWindow(Marker marker) {
        TextView txtPickupTitle = (TextView) myview.findViewById(R.id.txtPickupInfo);
        txtPickupTitle.setText(marker.getTitle());
        TextView txtPickupSnippet = (TextView) myview.findViewById(R.id.txtPickupSnippet);
        txtPickupSnippet.setText(marker.getSnippet());
        return myview;

    }

    @Override
    public View getInfoContents(Marker marker) {
        return null;
    }
}
