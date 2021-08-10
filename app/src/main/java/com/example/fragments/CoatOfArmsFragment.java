package com.example.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class CoatOfArmsFragment extends Fragment {
    public static CoatOfArmsFragment newInstance() {
        return new CoatOfArmsFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_coat_of_arms, container,false);
        return view;
    }
}
