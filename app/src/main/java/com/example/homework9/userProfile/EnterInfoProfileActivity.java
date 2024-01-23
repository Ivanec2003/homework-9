package com.example.homework9.userProfile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.homework9.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.Objects;

public class EnterInfoProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_info_profile);
        Button buttonLoginProfile = findViewById(R.id.buttonLoginProfile);

        TextInputLayout textInputLayoutFieldName = findViewById(R.id.outlinedTextFieldName);
        TextInputLayout textInputLayoutFieldSurname = findViewById(R.id.outlinedTextFieldSurname);
        TextInputLayout textInputLayoutFieldEmail = findViewById(R.id.outlinedTextFieldEmail);

        buttonLoginProfile.setOnClickListener(view -> {
            Intent intent = new Intent(this, UserProfileActivity.class);

            String name = Objects.requireNonNull(textInputLayoutFieldName.getEditText()).getText().toString();
            String surname = Objects.requireNonNull(textInputLayoutFieldSurname.getEditText()).getText().toString();
            String email = Objects.requireNonNull(textInputLayoutFieldEmail.getEditText()).getText().toString();

            intent.putExtra("Name", name);
            intent.putExtra("Surname", surname);
            intent.putExtra("Email", email);
            startActivity(intent);
        });
    }
}