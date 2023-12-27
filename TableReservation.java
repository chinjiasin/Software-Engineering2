package com.example.a1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.material.tabs.TabLayout;

public class TableReservation extends AppCompatActivity {
    private Button Backbutton1;
    private ImageButton mermaid;
    private ImageButton seaside;
    private ImageButton garden;
    private ImageButton indoor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_reservation);

        Backbutton1 = findViewById(R.id.BackHomePg);

        Backbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TableReservation.this, Main.class);
                startActivity(intent);
            }
        });
        mermaid=findViewById(R.id.icon);
        mermaid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TableReservation.this,MainActivity.class);
                startActivity(intent);
            }
        });
        seaside=findViewById(R.id.seasideIcon);
        seaside.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TableReservation.this,Seaside.class);
                startActivity(intent);
            }
        });
        garden=findViewById(R.id.GardenIcon);
        garden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TableReservation.this,Garden.class);
                startActivity(intent);
            }
        });
        indoor=findViewById(R.id.IndoorIcon);
        indoor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TableReservation.this,indoor.class);
                startActivity(intent);
            }
        });
    }
}
