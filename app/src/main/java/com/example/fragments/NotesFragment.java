package com.example.fragments;


import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


public class NotesFragment extends Fragment {
    public static String ARG_NAME = "nameOfNote";
    private Note note;
    private TextView title;
    private EditText editText;
    private int noteId;



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
        if (getArguments() != null) {
            this.note = getArguments().getParcelable(ARG_NAME);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_notes, container, false);
        title = view.findViewById(R.id.title);
        editText = view.findViewById(R.id.editText);
        String[] titleArray = getResources().getStringArray(R.array.title);
        String[] noteArray = getResources().getStringArray(R.array.notes);
        title.setText(titleArray[noteId]);
        editText.setText(noteArray[noteId]);

//        EditText editText = view.findViewById(R.id.editText);
//        TextView textView = view.findViewById(R.id.titleNote);
//        textView.setText(note.getNameNote());
//        editText.setText(note.getNote());
//        textView.setText(this.note.getNameNote());
//        TypedArray typedArray = getResources().obtainTypedArray(R.array.notes);
//        editText.setText(typedArray.getResourceId(Integer.parseInt(this.note.getNameNote()), -1));
        return view;
    }

    public void setNote(int noteId) {
        this.noteId =  noteId;

    }
}

