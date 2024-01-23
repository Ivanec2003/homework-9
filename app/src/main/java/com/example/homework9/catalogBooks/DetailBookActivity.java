package com.example.homework9.catalogBooks;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.homework9.R;

public class DetailBookActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_book);
        Book selectedBook = getIntent().getParcelableExtra("selectedBook");

        TextView textViewNameBook = findViewById(R.id.textViewNameBook);
        TextView textViewYearBook = findViewById(R.id.textViewYearBook);
        TextView textViewDescriptionBook = findViewById(R.id.textViewDescriptionBook);


        if (selectedBook != null) {
            textViewNameBook.setText(selectedBook.getName());
            textViewYearBook.setText(String.valueOf(selectedBook.getYears()));
            textViewDescriptionBook.setText(selectedBook.getDescription());
        }
    }
}