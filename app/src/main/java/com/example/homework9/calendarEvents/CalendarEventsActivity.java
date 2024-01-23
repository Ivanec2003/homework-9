package com.example.homework9.calendarEvents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.homework9.R;
import com.google.android.material.textfield.TextInputLayout;

import java.util.Objects;

public class CalendarEventsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar_events);

        TextInputLayout outlinedTextFieldEnterData = findViewById(R.id.outlinedTextFieldEnterData);
        TextInputLayout outlinedTextFieldEnterTime = findViewById(R.id.outlinedTextFieldEnterTime);
        TextInputLayout outlinedTextFieldEnterDescription = findViewById(R.id.outlinedTextFieldEnterDescriptionEvent);
        Button buttonCreateEvent = findViewById(R.id.buttonCreateEvent);
        Intent intent = new Intent(this, DetailEventActivity.class);
        Bundle bundle = new Bundle();
        Event event;
        event = new Event();
        buttonCreateEvent.setOnClickListener(view -> {
            event.setData(Objects.requireNonNull(outlinedTextFieldEnterData.getEditText()).getText().toString());
            event.setTime(Objects.requireNonNull(outlinedTextFieldEnterTime.getEditText()).getText().toString());
            event.setDescription(Objects.requireNonNull(outlinedTextFieldEnterDescription.getEditText()).getText().toString());
            bundle.putParcelable("selectedEvent", event);
            intent.putExtras(bundle);
            startActivity(intent);
        });
    }
}