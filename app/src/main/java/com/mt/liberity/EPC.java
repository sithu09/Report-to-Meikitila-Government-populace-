package com.mt.liberity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EPC extends AppCompatActivity {

    Button enews,ereport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_epc);

        enews=(Button)findViewById(R.id.enews);
        ereport=(Button)findViewById(R.id.ereport) ;

        enews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EPC.this, EPCNews.class);
                startActivity(intent);
            }
        });

        ereport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EPC.this, EPCInsert.class);
                startActivity(intent);
            }
        });

    }
}
