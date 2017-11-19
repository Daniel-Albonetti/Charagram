package com.example.david.charagram.view;

import android.support.annotation.IdRes;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.david.charagram.R;
import com.example.david.charagram.view.fragment.HomeFragment;
import com.example.david.charagram.view.fragment.ProfileFragment;
import com.example.david.charagram.view.fragment.SearchFragment;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

public class ContainerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);

        BottomBar bottomBar=(BottomBar)findViewById(R.id.BOTTOMBAR);
        bottomBar.setDefaultTab(R.id.home);

        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {

                switch (tabId){

                    case R.id.search:
                        SearchFragment searchFragment = new SearchFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.CONTAINER, searchFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null).commit();
                        break;

                    case R.id.home:
                        HomeFragment homeFragment = new HomeFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.CONTAINER, homeFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null).commit();
                        break;

                    case R.id.profile:
                        ProfileFragment profileFragment = new ProfileFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.CONTAINER, profileFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null).commit();
                        break;

                }

            }
        });

    }
}
