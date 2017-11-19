package com.example.david.charagram;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.david.charagram.view.ContainerActivity;
import com.example.david.charagram.view.NewUserActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void Ingresar(View v){

        Intent ingreso= new Intent(LoginActivity.this, ContainerActivity.class);
        startActivity(ingreso);

    }

    public void NuevaCuenta(View v){
        Intent intent = new Intent(LoginActivity.this, NewUserActivity.class);
        startActivity(intent);

    }

}
