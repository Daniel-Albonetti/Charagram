package com.example.david.charagram.adapter;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.widget.RecyclerView;
import android.transition.Explode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.david.charagram.R;
import com.example.david.charagram.model.Picture;
import com.example.david.charagram.view.PictureDetalleActivity;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by DAVID on 18/11/2017.
 */

public class PictureAdapterRecyclerView extends RecyclerView.Adapter<PictureAdapterRecyclerView.PictureViewHolder> {

    private ArrayList<Picture> pictures;
    private int resource;
    private Activity activity;

    public PictureAdapterRecyclerView(ArrayList<Picture> pictures, int resource, Activity activity) {
        this.pictures = pictures;
        this.resource = resource;
        this.activity = activity;
    }

    @Override
    public PictureViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(resource, parent, false);
        return new PictureViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PictureViewHolder holder, int position) {

        Picture picture = pictures.get(position);
        holder.nombreusucard.setText(picture.getUsername());
        holder.timecard.setText(picture.getTime());
        holder.likenumbercard.setText(picture.getLike_number());
        Picasso.with(activity).load(picture.getPicture()).into(holder.picturecard);

        holder.picturecard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(activity, PictureDetalleActivity.class);

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){

                    Explode explode = new Explode();
                    explode.setDuration(1000);
                    activity.getWindow().setExitTransition(explode);
                    activity.startActivity(intent, ActivityOptionsCompat.makeSceneTransitionAnimation
                            (activity, v, activity.getString(R.string.transitionname_picture)).toBundle());
                }
                else{

                    activity.startActivity(intent);

                }

            }
        });

    }

    @Override
    public int getItemCount() {
        return pictures.size();
    }

    public class PictureViewHolder extends RecyclerView.ViewHolder{

        private ImageView picturecard;
        private TextView nombreusucard;
        private TextView timecard;
        private TextView likenumbercard;

        public PictureViewHolder(View itemView) {
            super(itemView);

            picturecard = (ImageView) itemView.findViewById(R.id.PICTURECARD);
            nombreusucard = (TextView) itemView.findViewById(R.id.NOMBREUSUCARD);
            timecard = (TextView) itemView.findViewById(R.id.TIMECARD);
            likenumbercard = (TextView) itemView.findViewById(R.id.LIKENUMBERCARD);

        }
    }

}
