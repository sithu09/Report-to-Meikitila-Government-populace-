package com.mt.liberity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class PoliceCrime extends AppCompatActivity {
    DatabaseReference reff;
    ImageView images;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police_crime);

        images=(ImageView)findViewById(R.id.image);


        final ListView listView=(ListView)findViewById(R.id.newslistView);
        final ArrayList<String> arrayList=new ArrayList<>();
        final ArrayAdapter<String> adapter=new ArrayAdapter<String>(PoliceCrime.this,android.R.layout.simple_list_item_1,arrayList);

        reff = FirebaseDatabase.getInstance().getReference().child("Police Data");

        reff.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {

                    String title=snapshot.child("Title").getValue().toString();
                    String detail= snapshot.child("Proposal").getValue().toString();
                    String image=snapshot.child("photo").getValue().toString();
                    Picasso.get().load(image).into(images);
                    String  all= "\nသတင်းခေါင်းစဥ်:\t\t"+ title + "\n\n" + "\t\t"+detail + "\n" ;
                  arrayList.add(all);
//                    listView.setAdapter(new ImageListAdapter(UsageExampleAdapter.this, image));
                    listView.setAdapter(adapter);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


    }
}
