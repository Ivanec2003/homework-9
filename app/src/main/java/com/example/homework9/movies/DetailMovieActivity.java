package com.example.homework9.movies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.homework9.MainActivity;
import com.example.homework9.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class DetailMovieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_movie);

        Movie selectedMovie = (Movie) getIntent().getSerializableExtra("selectedMovie");

        TextView textViewNameMovie = findViewById(R.id.textViewNameMovie);
        TextView textViewYearMovie = findViewById(R.id.textViewYearMovie);
        TextView textViewDescriptionMovie = findViewById(R.id.textViewDescriptionMovie);
        if(selectedMovie != null){
            textViewNameMovie.setText(selectedMovie.getName());
            textViewYearMovie.setText(String.valueOf(selectedMovie.getYears()));
            textViewDescriptionMovie.setText(selectedMovie.getDesctiption());
        }

        FloatingActionButton buttonBack = findViewById(R.id.buttonBack);
        buttonBack.setOnClickListener(view -> {
            Intent intent = new Intent(this, MoviesActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            finish();
        });


    }
}