package com.example.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class TitleFragment extends Fragment {
    Note currentNote;

    public static TitleFragment newInstance() {
        return new TitleFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_title, container, false);
        LinearLayout linearLayout = (LinearLayout) view;
        String[] titles = getResources().getStringArray(R.array.title);
        for (int i = 0; i < titles.length; i++) {
            String name = titles[i];
            TextView textView = new TextView(getContext());
            textView.setText(name);
            textView.setTextSize(30);
            linearLayout.addView(textView);
//            int finalI = i;
//            textView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    currentNote = new Note(finalI,
//                            (getResources().getStringArray(R.array.title)[finalI]));
//
//                }
//            });
        }
        return view;
    }

}

