package com.example.imageslider;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.smarteist.autoimageslider.SliderView;

public class Link_ImageSlider_Activity extends AppCompatActivity {
SliderView sliderView;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Link ImageSlider");
        setContentView(R.layout.activity_link__image_slider_);

        sliderView = findViewById(R.id.imageSlider);
        button = findViewById(R.id.buttonID);


        //Make an Adapter class for showing and holding Images from sample layout to MainActivity


        //set Adapter with SliderView
        sliderView.setSliderAdapter(new Link_ImageSlider_Adapter(this));

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),FireBase_ImageSlider_Activity.class);
                startActivity(intent);
            }
        });





    }
}