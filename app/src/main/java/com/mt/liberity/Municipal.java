package com.mt.liberity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Municipal extends AppCompatActivity {

Button mnews,mreport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_municipal);

        mnews=(Button)findViewById(R.id.mnews);
        mreport=(Button)findViewById(R.id.mreport) ;

        mnews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Municipal.this, MunicipalNews.class);
                startActivity(intent);
            }
        });

        mreport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Municipal.this, MunicipalInsert.class);
                startActivity(intent);
            }
        });

    }
}
