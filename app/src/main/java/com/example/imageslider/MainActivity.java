package com.example.imageslider;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    SliderView sliderView;
    //Import ImageModelList
    List<ImageSliderModel> imageSliderModelList;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Drawable ImageSlider");

        //Make the ModelList as a ArrayList
        imageSliderModelList = new ArrayList<>();
        sliderView = findViewById(R.id.imageSlider);
        button = findViewById(R.id.buttonID);


        //Make an Adapter and a Model class for showing and holding Images from sample layout to MainActivity

        //Add Images From Drawable Folder
        imageSliderModelList.add(new ImageSliderModel(R.drawable.android));
        imageSliderModelList.add(new ImageSliderModel(R.drawable.android_studio));
        imageSliderModelList.add(new ImageSliderModel(R.drawable.flutter));
        imageSliderModelList.add(new ImageSliderModel(R.drawable.java));
        imageSliderModelList.add(new ImageSliderModel(R.drawable.python));


        //set Adapter in SliderView
        sliderView.setSliderAdapter(new ImageSliderADapter(this,imageSliderModelList));









        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Link_ImageSlider_Activity.class);
                startActivity(intent);
            }
        });
    }
}