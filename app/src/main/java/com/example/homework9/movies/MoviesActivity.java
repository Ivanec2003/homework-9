package com.example.homework9.movies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.homework9.R;

public class MoviesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);

        Movie[] catalogMovies = {
                new Movie("Movie 1", 1956, "Description 1"),
                new Movie("Movie 2", 2012, "Description 2"),
                new Movie("Movie 3", 3015, "Description 3")
        };
        ListView listView = findViewById(R.id.listViewCatalogMovies);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, getMovieName(catalogMovies));
        listView.setAdapter(adapter);
        listView.setOnItemClickListener((parent, view, position, id) -> {
            Movie selectedMovie = catalogMovies[position];
            openMovieDetailActivity(selectedMovie);
        });
    }
    private void openMovieDetailActivity(Movie selectedMovie) {
        Intent intent = new Intent(this, DetailMovieActivity.class);
        intent.putExtra("selectedMovie", selectedMovie);
        startActivity(intent);
    }
    private String[] getMovieName(Movie[] movies) {
        String[] names = new String[movies.length];
        for (int i = 0; i < movies.length; i++) {
            names[i] = movies[i].getName();
        }
        return names;
    }
}