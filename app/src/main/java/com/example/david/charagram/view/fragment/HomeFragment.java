package com.example.david.charagram.view.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.david.charagram.R;
import com.example.david.charagram.adapter.PictureAdapterRecyclerView;
import com.example.david.charagram.model.Picture;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        showToolbar(getResources().getString(R.string.tab_home), false, view);

        RecyclerView picturerecycler = (RecyclerView)view.findViewById(R.id.picturerecyler);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        picturerecycler.setLayoutManager(linearLayoutManager);
        PictureAdapterRecyclerView pictureAdapterRecyclerView = new PictureAdapterRecyclerView(buildPictures(),R.layout.cardview_picture, getActivity());
        picturerecycler.setAdapter(pictureAdapterRecyclerView);

        return view;
    }

    public ArrayList<Picture> buildPictures(){

        ArrayList<Picture> pictures = new ArrayList<>();
        pictures.add(new Picture("http://wallpapers4screen.com/Uploads/22-1-2016/10412/thumb2-skate-danbo-cardboard-man.jpg", "Daniel Ripas", "4 Dias", "3 Me Gusta"));
        pictures.add(new Picture("https://artescritorio.com/wp-content/uploads/2011/09/wallpapers-converse-7-630x428.jpg", "Juana Mesa", "3 Dias", "8 Me Gusta"));
        pictures.add(new Picture("https://www.codigo.pe/wp-content/uploads/2015/01/10904452_932343100122632_3501864014287667258_o.jpg", "Ines Fuentes", "3 Dias", "8 Me Gusta"));

        return pictures;
    }

    public void showToolbar(String tittle, Boolean upbutton, View view){

        Toolbar toolbar = (Toolbar)view.findViewById(R.id.toolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(tittle);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(upbutton);
    }

}
