package com.mt.liberity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class PoliceInsert extends AppCompatActivity {
EditText title,date,provide,proposal;
    Button post,pnews;
    DatabaseReference reff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police_insert);

        title=(EditText)findViewById(R.id.ptitle);
        date=(EditText)findViewById(R.id.pdate);
        provide=(EditText)findViewById(R.id.pprovide);
        proposal=(EditText)findViewById(R.id.pproposal);
        post=(Button) findViewById(R.id.ppost);
        pnews=(Button) findViewById(R.id.pnews);

        post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                reff= FirebaseDatabase.getInstance().getReference("PoliceInsert");
                PoliceI police=new PoliceI();

                String titles=title.getText().toString().trim();
                String dates=date.getText().toString().trim();
                String provides=provide.getText().toString().trim();
                String prposals=proposal.getText().toString().trim();

                if(dates.length()==0 || titles.length()==0 || provides.length()==0 || prposals.length()==0 ){
                    Toast.makeText(PoliceInsert.this,"ပြည့်စုံစွာ ဖြည့်စွက်ပေးပါ",Toast.LENGTH_LONG).show();
                }
                else {
                   police.setTitle(titles);
                   police.setDate(dates);
                   police.setProvide(provides);
                   police.setProposal(prposals);
                    reff.child(titles).setValue(police);
                    Toast.makeText(PoliceInsert.this," သင်၏ တိုင်ကြားချက်ကို လက်ခံရရှိပါသည်။ ",Toast.LENGTH_LONG).show();
                }

            }
        });

        pnews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PoliceInsert.this, ImagesActivity.class);
                startActivity(intent);
            }
        });

    }
}
