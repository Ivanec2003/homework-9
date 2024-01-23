package com.example.homework9.calendarEvents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.homework9.R;

public class DetailEventActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_event);

        Bundle bundle = getIntent().getExtras();
        Event event;
        event = new Event();
        if (bundle != null) {
            event = bundle.getParcelable("selectedEvent");
        }

        TextView textViewDataEvent = findViewById(R.id.textViewDataEvent);
        TextView textViewTimeEvent = findViewById(R.id.textViewTimeEvent);
        TextView textViewDescriptionEvent = findViewById(R.id.textViewDescriptionEvent);
        if(event != null) {
            textViewDataEvent.setText(String.valueOf(event.getData()));
            textViewTimeEvent.setText(String.valueOf(event.getTime()));
            textViewDescriptionEvent.setText(String.valueOf(event.getDescription()));
        }

        Button buttonApprove = findViewById(R.id.buttonApprove);
        buttonApprove.setOnClickListener(view -> {
            finishAffinity();
        });
    }
}