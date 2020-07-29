package com.example.imageslider;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.smarteist.autoimageslider.SliderViewAdapter;

public class Link_ImageSlider_Adapter extends SliderViewAdapter<Link_ImageSlider_Adapter.SliderViewHolder> {

    //Add Context
    Context context;

    public Link_ImageSlider_Adapter(Context context) {
        this.context = context;
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

        //Get Images from Link (It works only swich method)
        switch (position){
            case 0:
          Glide.with(viewHolder.itemView).load("https://upload.wikimedia.org/wikipedia/commons/b/bd/Firebase_Logo.png").into(viewHolder.imageView);
          break;

            case 1:
                Glide.with(viewHolder.itemView).load("https://upload.wikimedia.org/wikipedia/commons/2/24/Wyvern-programming-languages-in-one.jpg").into(viewHolder.imageView);
                break;

            case 2:
                Glide.with(viewHolder.itemView).load("https://c1.wallpaperflare.com/preview/538/382/442/programming-screen-monitor-black.jpg").into(viewHolder.imageView);
                break;

            case 3:
                Glide.with(viewHolder.itemView).load("https://cdn.pixabay.com/photo/2015/12/09/15/51/code-1084923_960_720.png").into(viewHolder.imageView);
                break;
            case 4:
                Glide.with(viewHolder.itemView).load("https://c0.wallpaperflare.com/preview/524/860/912/screen-code-coding-programming.jpg").into(viewHolder.imageView);
        }

        //this is Onclick Listener(It works only swich method)
        viewHolder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               switch (position){
                   case 0:
                       Toast.makeText(context, "image1", Toast.LENGTH_SHORT).show();
                       break;

                         case 1:
                       Toast.makeText(context, "image2", Toast.LENGTH_SHORT).show();
                       break;

                         case 2:
                       Toast.makeText(context, "image3", Toast.LENGTH_SHORT).show();
                       break;

                         case 3:
                       Toast.makeText(context, "image4", Toast.LENGTH_SHORT).show();
                       break;

                         case 4:
                       Toast.makeText(context, "image5", Toast.LENGTH_SHORT).show();
                       break;
               }
            }
        });


    }

    @Override
    public int getCount() {
        return 5;
    }

    public class SliderViewHolder extends SliderViewAdapter.ViewHolder {

        //get sample layout object id like as RecyclerView but extra method is  (View itemView;) and (this.itemView = itemView;)
        ImageView imageView;

        //this view for Glide The viewholder
        View itemView;
        public SliderViewHolder(View itemView) {
            super(itemView);
            this.itemView = itemView;
            imageView = itemView.findViewById(R.id.image_sample_ID);
        }
    }
}
