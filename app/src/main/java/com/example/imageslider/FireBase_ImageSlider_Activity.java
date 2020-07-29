package com.example.imageslider;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.smarteist.autoimageslider.SliderView;

public class FireBase_ImageSlider_Activity extends AppCompatActivity {
    SliderView sliderView;

    // int variable for context and convert the Long type variable to int
    int totalcounts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("FireBase ImageSlider");
        setContentView(R.layout.activity_fire_base__image_slider_);
        sliderView = findViewById(R.id.imageSlider);


        //firebaseDatabase Add and get data from firebase
        FirebaseDatabase.getInstance().getReference("ImagesList").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                Long count = snapshot.getChildrenCount();   //Long type variable for get children from firebase
                totalcounts = count.intValue();   //convert Long to int

                //set Adapter in sliderview
                sliderView.setSliderAdapter(new FirabaseSliderAdapter(FireBase_ImageSlider_Activity.this,totalcounts));
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

}
