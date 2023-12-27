package com.example.a1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ads2 extends AppCompatActivity {
    private Button skipButton2;
    private Button nextButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ads2);

        skipButton2 = findViewById(R.id.Skip2);
        nextButton2 = findViewById(R.id.Next2);

        skipButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ads2.this, Login.class);
                startActivity(intent);
            }
        });

        nextButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ads2.this, Login.class);
                startActivity(intent);
            }
        });
    }
}
