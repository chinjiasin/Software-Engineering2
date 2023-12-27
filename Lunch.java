package com.example.a1;

import androidx.appcompat.app.AppCompatActivity;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.TimePicker;

import java.util.Calendar;

public class Lunch extends AppCompatActivity {
    private Button backButton;
    private Button dateButton;
    private EditText editTextTime;
    private DatePickerDialog datePickerDialog;
    private TimePickerDialog timePickerDialog;
    private Button confirmButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch);

        backButton = findViewById(R.id.BackHomePg);
        dateButton = findViewById(R.id.datePickerButton);
        editTextTime = findViewById(R.id.editTextTime);
        confirmButton = findViewById(R.id.c1);

        editTextTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTimePickerDialog();
            }
        });

        initDatePicker();

        dateButton.setText(getTodaysDate());

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Lunch.this, TableReservation.class);
                startActivity(intent);
            }
        });

        confirmButton.setOnClickListener(new View.OnClickListener() { // Corrected this block
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Lunch.this, Tablepax.class);
                startActivity(intent);
            }
        });
    }

    private String getTodaysDate() {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int day = cal.get(Calendar.DAY_OF_MONTH);
        return makeDateString(day, month, year);
    }

    private void initDatePicker() {
        DatePickerDialog.OnDateSetListener dateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                month = month + 1;
                String date = makeDateString(dayOfMonth, month, year);
                dateButton.setText(date);
            }
        };
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);

        datePickerDialog = new DatePickerDialog(this, dateSetListener, year, month, day);
    }

    private String makeDateString(int day, int month, int year) {
        return getMonthFormat(month) + " " + day + ", " + year;
    }

    private String getMonthFormat(int month) {
        String[] months = {"", "JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};
        return months[month];
    }

    public void openDatePicker(View view) {
        datePickerDialog.show();
    }

    public void openTimePickerDialog() {
        int hourOfDay = 23;
        int minutes = 55;
        boolean is24HourView = true;

        timePickerDialog = new TimePickerDialog(
                this,
                android.R.style.Theme_Holo_Light_DarkActionBar,
                new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int hourOfDay, int minute) {
                        editTextTime.setText(hourOfDay + ":" + minute);
                        Toast.makeText(Lunch.this, "Hour: " + hourOfDay + ", Minute: " + minute, Toast.LENGTH_SHORT).show();
                    }
                },
                hourOfDay,
                minutes,
                is24HourView
        );

        timePickerDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        timePickerDialog.setTitle("Select a Time");
        timePickerDialog.show();
    }
}
