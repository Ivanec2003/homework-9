package com.example.homework9.userProfile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.homework9.R;

public class UserProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);
        String name = getIntent().getStringExtra("Name");
        String surname = getIntent().getStringExtra("Surname");
        String email = getIntent().getStringExtra("Email");


        TextView textViewName = findViewById(R.id.textViewName);
        TextView textViewSurname = findViewById(R.id.textViewSurname);
        TextView textViewEmail = findViewById(R.id.textViewEmail);

        textViewName.setText(name);
        textViewSurname.setText(surname);
        textViewEmail.setText(email);
    }
}