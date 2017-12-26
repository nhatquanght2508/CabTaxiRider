package com.example.myrog.cabtaxirider;

import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by My Rog on 11/27/2017.
 */

public class BottomSheetFragment extends BottomSheetDialogFragment {
    String mtag;

    public static BottomSheetDialogFragment newInstance(String tag){
        BottomSheetDialogFragment f = new BottomSheetFragment();
        Bundle args = new Bundle();
        args.putString("TAG",tag);
        f.setArguments(args);
        return f;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        mtag = getArguments().getString("TAG");

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.bottom_sheet_rider,container,false);

        return view;
    }
}
