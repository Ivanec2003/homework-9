package com.example.homework9.catalogBooks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.example.homework9.R;

public class CatalogBooksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalog_books);
        Book[] catalogBooks = {
                new Book("Book 1", 1956, "Description 1"),
                new Book("Book 2", 2012, "Description 2"),
                new Book("Book 3", 3015, "Description 3")
        };
        ListView listView = findViewById(R.id.listViewCatalogBooks);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, getBooksName(catalogBooks));
        listView.setAdapter(adapter);
        listView.setOnItemClickListener((parent, view, position, id) -> {
            Book selectedBook = catalogBooks[position];
            openBookDetailActivity(selectedBook);
        });
    }
    private void openBookDetailActivity(Book selectedBook) {
        Intent intent = new Intent(this, DetailBookActivity.class);
        intent.putExtra("selectedBook", selectedBook);
        startActivity(intent);
    }
    private String[] getBooksName(Book[] books) {
        String[] names = new String[books.length];
        for (int i = 0; i < books.length; i++) {
            names[i] = books[i].getName();
        }
        return names;
    }
}