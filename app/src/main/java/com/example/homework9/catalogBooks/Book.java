package com.example.homework9.catalogBooks;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

public class Book implements Parcelable {
    private final String name;
    private final int years;
    private final String description;

    public Book(String name, int years, String description) {
        this.name = name;
        this.years = years;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public int getYears() {
        return years;
    }

    public String getDescription() {
        return description;
    }

    protected Book(Parcel in) {
        name = in.readString();
        years = in.readInt();
        description = in.readString();
    }

    public static final Creator<Book> CREATOR = new Creator<Book>() {
        @Override
        public Book createFromParcel(Parcel in) {
            return new Book(in);
        }

        @Override
        public Book[] newArray(int size) {
            return new Book[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeInt(years);
        parcel.writeString(description);
    }
}
