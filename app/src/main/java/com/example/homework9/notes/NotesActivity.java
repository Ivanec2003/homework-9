package com.example.homework9.notes;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.homework9.R;
import com.google.android.material.textfield.TextInputLayout;

import java.util.Objects;

public class NotesActivity extends AppCompatActivity {
    private static final String SAVE_NOTES = "save_notes";
    private  TextInputLayout outlinedTextFieldNotes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);

        outlinedTextFieldNotes = findViewById(R.id.outlinedTextFieldNotes);
        if(savedInstanceState != null){
            String savedNotes = savedInstanceState.getString(SAVE_NOTES);
            Objects.requireNonNull(outlinedTextFieldNotes.getEditText()).setText(savedNotes);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putString(SAVE_NOTES, Objects.requireNonNull(outlinedTextFieldNotes.getEditText()).getText().toString());
        super.onSaveInstanceState(outState);
    }
}