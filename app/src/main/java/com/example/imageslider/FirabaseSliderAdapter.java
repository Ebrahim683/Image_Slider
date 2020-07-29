package com.example.imageslider;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;

import com.bumptech.glide.Glide;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.smarteist.autoimageslider.SliderViewAdapter;


//this is for firebase (Adapter)
public class FirabaseSliderAdapter extends SliderViewAdapter<FirabaseSliderAdapter.FirebaseViewHolder> {

    //import context and make constructor
    Context context;
    int totalCount;

    //don't make this constructor and it return getcount
    String imageLink;

    public FirabaseSliderAdapter(Context context,int totalCount) {
        this.context = context;
        this.totalCount = totalCount;
    }

    @Override
    public FirebaseViewHolder onCreateViewHolder(ViewGroup parent) {

        //same as recyclerView
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.image_layout_sample,parent,false);

        return new FirebaseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final FirebaseViewHolder viewHolder, final int position) {


        //add FirebaseDatabase method for get Child from firebase
        FirebaseDatabase.getInstance().getReference("ImagesList").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                //same as LinkImageSlider
                switch (position){
                    case 0:
                        //this line get the child from firebase and add in snapshot
                        imageLink = snapshot.child("1").getValue().toString();

                        //this line is same as LinkImageSlider
                        Glide.with(viewHolder.itemView).load(imageLink).into(viewHolder.imageView);
                        break;

                    case 1:
                        imageLink = snapshot.child("2").getValue().toString();
                        Glide.with(viewHolder.itemView).load(imageLink).into(viewHolder.imageView);
                        break;

                    case 2:
                        imageLink = snapshot.child("3").getValue().toString();
                        Glide.with(viewHolder.itemView).load(imageLink).into(viewHolder.imageView);
                        break;

                    case 3:
                        imageLink = snapshot.child("4").getValue().toString();
                        Glide.with(viewHolder.itemView).load(imageLink).into(viewHolder.imageView);
                        break;

                    case 4:
                        imageLink = snapshot.child("5").getValue().toString();
                        Glide.with(viewHolder.itemView).load(imageLink).into(viewHolder.imageView);
                        break;

                    case 5:
                        imageLink = snapshot.child("6").getValue().toString();
                        Glide.with(viewHolder.itemView).load(imageLink).into(viewHolder.imageView);
                        break;

                    case 6:
                        imageLink = snapshot.child("7").getValue().toString();
                        Glide.with(viewHolder.itemView).load(imageLink).into(viewHolder.imageView);
                        break;

                    case 7:
                        imageLink = snapshot.child("8").getValue().toString();
                        Glide.with(viewHolder.itemView).load(imageLink).into(viewHolder.imageView);
                        break;

                    case 8:
                        imageLink = snapshot.child("9").getValue().toString();
                        Glide.with(viewHolder.itemView).load(imageLink).into(viewHolder.imageView);
                        break;

                    case 9:
                        imageLink = snapshot.child("10").getValue().toString();
                        Glide.with(viewHolder.itemView).load(imageLink).into(viewHolder.imageView);
                        break;

                    case 10:
                        imageLink = snapshot.child("11").getValue().toString();
                        Glide.with(viewHolder.itemView).load(imageLink).into(viewHolder.imageView);
                        break;

                    case 11:
                        imageLink = snapshot.child("12").getValue().toString();
                        Glide.with(viewHolder.itemView).load(imageLink).into(viewHolder.imageView);
                        break;

                    case 12:
                        imageLink = snapshot.child("13").getValue().toString();
                        Glide.with(viewHolder.itemView).load(imageLink).into(viewHolder.imageView);
                        break;

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }

    @Override
    public int getCount() {
        return totalCount;
    }

    public class FirebaseViewHolder extends SliderViewAdapter.ViewHolder {

        //same as LinkImageSlider
        ImageView imageView;
        public FirebaseViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_sample_ID);
        }
    }
}
