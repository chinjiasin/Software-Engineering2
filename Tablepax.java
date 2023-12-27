package com.example.a1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Tablepax extends AppCompatActivity {
    Button btnPlus, btnMinus;
    Integer counterValue=5;
    TextView textViewCounter;
    Button confirmB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablepax);

        btnPlus=findViewById(R.id.btnPlus);
        btnMinus=findViewById(R.id.btnMinus);
        textViewCounter=findViewById(R.id.tvCounter);

        textViewCounter.setText(String.valueOf(counterValue));
       confirmB = findViewById(R.id.confirmButton);

        confirmB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tablepax.this, Confirm.class);
                startActivity(intent);
            }
        });
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (counterValue < 10) { // check it's that lower than 10
                    counterValue++; // plus
                    textViewCounter.setText(String.valueOf(counterValue)); // update view
                }
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (counterValue > 1) { // check it's that more than 1
                    counterValue--; // minus
                    textViewCounter.setText(String.valueOf(counterValue)); // update view
                }
            }
        });
    }
}
