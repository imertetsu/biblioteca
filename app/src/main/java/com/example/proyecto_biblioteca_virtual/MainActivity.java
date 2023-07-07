package com.example.proyecto_biblioteca_virtual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



    //Metodo para ir al nivel 2 de "materias"
    public void Nivel_2(View view) {
        Intent nivel_2 = new Intent(this, Nivel_02.class);
        startActivity(nivel_2);

    }

    public void iniciarSesion(View view){
        Intent login = new Intent(this, Login.class);
        startActivity(login);
    }

}
