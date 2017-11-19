package com.example.david.charagram.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.david.charagram.R;
import com.example.david.charagram.model.Picture;

import java.util.ArrayList;

/**
 * Created by DAVID on 18/11/2017.
 */

public class PictureAdapterRecyclerViewBuscar extends RecyclerView.Adapter<PictureAdapterRecyclerViewBuscar.PictureViewBholderBuscar> {


    @Override
    public PictureViewBholderBuscar onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(PictureViewBholderBuscar holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class PictureViewBholderBuscar extends RecyclerView.ViewHolder{

        private ImageView picturecardbuscar;
        private TextView nombreusucardbuscar;
        private TextView timecardbuscar;
        private TextView likenumbercardbuscar;
        private ImageView picturecardbuscar2;
        private TextView nombreusucardbuscar2;
        private TextView timecardbuscar2;
        private TextView likenumbercardbuscar2;

        public PictureViewBholderBuscar(View itemView) {
            super(itemView);

            //picturecardbuscar=(ImageView)itemView.findViewById(R.id.PICTURECARDBUSCAR);
            //picturecardbuscar2=(ImageView)itemView.findViewById(R.id.PICTURECARDBUSCAR2);
            //nombreusucardbuscar=(TextView)itemView.findViewById(R.id.NOMBREUSUCARDBUSCAR);
            //nombreusucardbuscar2=(TextView)itemView.findViewById(R.id.NOMBREUSUCARDBUSCAR2);
            //timecardbuscar=(TextView)itemView.findViewById(R.id.TIMECARDBUSCAR);
            //timecardbuscar2=(TextView)itemView.findViewById(R.id.TIMECARDBUSCAR2);
            //likenumbercardbuscar=(TextView)itemView.findViewById(R.id.LIKENUMBERCARDBUSCAR);
            //likenumbercardbuscar2=(TextView)itemView.findViewById(R.id.LIKENUMBERCARDBUSCAR2);

        }
    }

}
