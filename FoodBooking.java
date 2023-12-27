package com.example.a1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class FoodBooking extends AppCompatActivity {
    private Button Backbutton1;
    private ImageButton mermaid;
    private ImageButton BreakfastButton;
    private ImageButton LunchButton;
    private ImageButton DinnerButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_booking);

        Backbutton1 = findViewById(R.id.BackHomePg);

        Backbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FoodBooking.this, Main.class);
                startActivity(intent);
            }
        });
        mermaid=findViewById(R.id.icon);
        mermaid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FoodBooking.this,MainActivity.class);
                startActivity(intent);
            }
        });
        BreakfastButton = findViewById(R.id.breakfastIcon);

        BreakfastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FoodBooking.this, Breakfast.class);
                startActivity(intent);
            }
        });
        LunchButton = findViewById(R.id.lunchIcon);

        LunchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FoodBooking.this, Lunch.class);
                startActivity(intent);
            }
        });
        DinnerButton = findViewById(R.id.dinnerIcon);

        DinnerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FoodBooking.this, Dinner.class);
                startActivity(intent);
            }
        });
    }
}
