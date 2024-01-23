package com.example.homework9.calendarEvents;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Event implements Parcelable {
    private String data;
    private String time;
    private String description;

    public Event() {
    }

    protected Event(Parcel in) {
        data = in.readString();
        time = in.readString();
        description = in.readString();
    }

    public static final Creator<Event> CREATOR = new Creator<Event>() {
        @Override
        public Event createFromParcel(Parcel in) {
            return new Event(in);
        }

        @Override
        public Event[] newArray(int size) {
            return new Event[size];
        }
    };

    public String getData() {
        return data;
    }

    public String getTime() {
        return time;
    }

    public String getDescription() {
        return description;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeString(data);
        parcel.writeString(time);
        parcel.writeString(description);
    }
}
