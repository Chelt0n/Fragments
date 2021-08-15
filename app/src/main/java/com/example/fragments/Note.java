package com.example.fragments;


import android.os.Parcel;
import android.os.Parcelable;

public class Note implements Parcelable {
    private int id;
    private String nameNote;
    private String Note;

    public Note(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public String getNameNote() {
        return nameNote;
    }

    public void setNameNote(String nameNote) {
        this.nameNote = nameNote;
    }

    public String getNote() {
        return Note;
    }

    public void setNote(String note) {
        Note = note;
    }


    public Note(String nameNote, String note) {
        this.nameNote = nameNote;
        Note = note;
    }


    protected Note(Parcel in) {
        nameNote = in.readString();
        Note = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nameNote);
        dest.writeString(Note);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Note> CREATOR = new Creator<Note>() {
        @Override
        public Note createFromParcel(Parcel in) {
            return new Note(in);
        }

        @Override
        public Note[] newArray(int size) {
            return new Note[size];
        }
    };
}
