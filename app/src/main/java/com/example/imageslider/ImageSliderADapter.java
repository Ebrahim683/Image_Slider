package com.example.imageslider;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.smarteist.autoimageslider.SliderViewAdapter;

import java.util.List;


//This is Adapter
public class ImageSliderADapter extends SliderViewAdapter<ImageSliderADapter.SliderViewHolder> {

    //Make Context and Model List
    Context context;
    List<ImageSliderModel> imageSliderModelList;

    public ImageSliderADapter(Context context, List<ImageSliderModel> imageSliderModelList) {
        this.context = context;
        this.imageSliderModelList = imageSliderModelList;
    }

    @Override
    public SliderViewHolder onCreateViewHolder(ViewGroup parent) {

        //Inflate the sample layout like RecyclerView
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.image_layout_sample,parent,false);

        return new SliderViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SliderViewHolder viewHolder, final int position) {

        //set Image from ViewHolder and add with getImage from Model class
        viewHolder.imageView.setImageResource(imageSliderModelList.get(position).getImage());


        //set Onclick Listener
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position==0){
                    Toast.makeText(context, "Image1", Toast.LENGTH_SHORT).show();
                }

                 if (position==1){
                    Toast.makeText(context, "Image2", Toast.LENGTH_SHORT).show();
                }

                 if (position==2){
                    Toast.makeText(context, "Image3", Toast.LENGTH_SHORT).show();
                }

                 if (position==3){
                    Toast.makeText(context, "Image4", Toast.LENGTH_SHORT).show();
                }

                 if (position==4){
                    Toast.makeText(context, "Image5", Toast.LENGTH_SHORT).show();
                }


            }
        });

    }

    @Override
    public int getCount() {
        return imageSliderModelList.size();
    }


    public  class SliderViewHolder extends SliderViewAdapter.ViewHolder {
        //get sample layout object id like as RecyclerView
        ImageView imageView;
        public SliderViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_sample_ID);
        }
    }
}
