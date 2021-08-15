package com.example.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class NotesFragment extends Fragment {
    public static NotesFragment newInstance() {
        return new NotesFragment();
    }
    public static String ARG_NAME = "nameOfNote";
    private Note note;

    public static NotesFragment newInstance(Note note) {
        NotesFragment fragment = new NotesFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable(ARG_NAME, note);
        fragment.setArguments(bundle);
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments()!= null){
            this.note = getArguments().getParcelable(ARG_NAME);
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_notes, container,false);
        TextView textView = view.findViewById(R.id.title);
        textView.setText(this.note.getNameNote());
        EditText editText = view.findViewById(R.id.editText);
        editText.setText(this.note.getNote());
        return view;
    }
}
