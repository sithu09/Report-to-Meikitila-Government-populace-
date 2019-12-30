package com.mt.liberity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
ViewFlipper viewFlipper;
Button police,municipal,epc,ghospital,policeb,municipalb,epcb,ghospitalb;
    @Override
    public void onClick(View view) {
        if(view==policeb){
            viewFlipper.showNext();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourselect);
        police=(Button)findViewById(R.id.police);
        municipal=(Button) findViewById(R.id.municipal);
        epc=(Button)findViewById(R.id.epc) ;
        ghospital=(Button) findViewById(R.id.hospital);
        policeb=(Button)findViewById(R.id.bpolice);
//        municipalb=(Button) findViewById(R.id.bmunicipal);
//        epcb=(Button)findViewById(R.id.bepc) ;
//        ghospitalb=(Button) findViewById(R.id.bhospital);
        viewFlipper=(ViewFlipper) findViewById(R.id.vflipper);


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

        policeb.setOnClickListener(this);
//        municipalb.setOnClickListener(this);
//        epcb.setOnClickListener(this);
//        ghospitalb.setOnClickListener(this);



    }
}
