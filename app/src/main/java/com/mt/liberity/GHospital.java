package com.mt.liberity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GHospital extends AppCompatActivity {

    Button hnews,hreport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ghospital);

        hnews=(Button)findViewById(R.id.hnews);
        hreport=(Button)findViewById(R.id.hreport) ;

        hnews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GHospital.this, GHospitalNews.class);
                startActivity(intent);
            }
        });

        hreport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GHospital.this, GHospitalInsert.class);
                startActivity(intent);
            }
        });

    }
}
