package com.mt.liberity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

Button police,municipal,epc,ghospital;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        police=(Button)findViewById(R.id.police);
        municipal=(Button) findViewById(R.id.municipal);
        epc=(Button)findViewById(R.id.epc) ;
        ghospital=(Button) findViewById(R.id.hospital);

        police.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PoliceInsert.class);
                startActivity(intent);
            }
        });

        municipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MunicipalInsert.class);
                startActivity(intent);
            }
        });

        epc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EPCInsert.class);
                startActivity(intent);
            }
        });

        ghospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GHospitalInsert.class);
                startActivity(intent);
            }
        });

    }
}
