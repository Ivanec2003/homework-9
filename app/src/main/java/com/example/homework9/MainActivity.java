package com.example.homework9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.homework9.calendarEvents.CalendarEventsActivity;
import com.example.homework9.catalogBooks.CatalogBooksActivity;
import com.example.homework9.catalogGoods.CatalogGoodsActivity;
import com.example.homework9.movies.MoviesActivity;
import com.example.homework9.notes.NotesActivity;
import com.example.homework9.userProfile.EnterInfoProfileActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonNavigationCatalogGoods = findViewById(R.id.buttonNavigationCatalogGoods);
        buttonNavigationCatalogGoods.setOnClickListener(v -> {
            Intent intent = new Intent(this, CatalogGoodsActivity.class);
            startActivity(intent);
        });

        Button buttonNavigationUserProfile = findViewById(R.id.buttonNavigationUserProfile);
        buttonNavigationUserProfile.setOnClickListener(v -> {
            Intent intent = new Intent(this, EnterInfoProfileActivity.class);
            startActivity(intent);
        });

        Button buttonNavigationCatalogBooks = findViewById(R.id.buttonNavigationCatalogBooks);
        buttonNavigationCatalogBooks.setOnClickListener(v -> {
            Intent intent = new Intent(this, CatalogBooksActivity.class);
            startActivity(intent);
        });

        Button buttonNavigationMovies = findViewById(R.id.buttonNavigationMovies);
        buttonNavigationMovies.setOnClickListener(v -> {
            Intent intent = new Intent(this, MoviesActivity.class);
            startActivity(intent);
        });

        Button buttonNavigationCalendarEvents = findViewById(R.id.buttonNavigationCalendarEvents);
        buttonNavigationCalendarEvents.setOnClickListener(v -> {
            Intent intent = new Intent(this, CalendarEventsActivity.class);
            startActivity(intent);
        });

        Button buttonNavigationNotes = findViewById(R.id.buttonNavigationNotes);
        buttonNavigationNotes.setOnClickListener(v -> {
            Intent intent = new Intent(this, NotesActivity.class);
            startActivity(intent);
        });
    }
}