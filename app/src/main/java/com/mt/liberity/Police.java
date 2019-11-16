package com.mt.liberity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Police extends AppCompatActivity {
Button crime,binformer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police);

        crime=(Button)findViewById(R.id.bcrime);
        binformer=(Button) findViewById(R.id.binformer);

        crime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Police.this, ImagesActivity.class);
                startActivity(intent);
            }
        });

        binformer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Police.this, PoliceInsert.class);
                startActivity(intent);
            }
        });

    }
}
