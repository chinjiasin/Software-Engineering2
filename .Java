package com.example.a1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Main extends AppCompatActivity {
    private ImageButton foodbooking;
    private ImageButton mermaid;
    private ImageButton table;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        foodbooking = findViewById(R.id.FoodButton);
        foodbooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main.this, FoodBooking.class);
                startActivity(intent);
            }
        });
        mermaid=findViewById(R.id.icon);
        mermaid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main.this,MainActivity.class);
                startActivity(intent);
            }
        });
        table = findViewById(R.id.tableicon);
        table.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main.this, TableReservation.class);
                startActivity(intent);
            }
        });
    }
}



