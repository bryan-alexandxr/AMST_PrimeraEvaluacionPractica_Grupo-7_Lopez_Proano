package com.xandermave.amst_primeraevaluacionpractica_grupo7_lopez_proano;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Pregunta2 extends AppCompatActivity {
    ArrayList<Integer> valores = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta2);
        valores = getIntent().getIntegerArrayListExtra("valores");
    }

    public void derrota(View v){
        Intent i = new Intent(this, Derrota.class);
        startActivity(i);
        finish();
    }

    public void correcto(View v){

        valores.remove((Integer) 2); //Se saca la pregunta 2 de la lista de preguntas disponibles

        Class activity = null;

        if (valores.isEmpty()){ //Si la lista pasa de [1,2,3,4,5,6] a [] es porque ya no hay mas preguntas
            Intent i = new Intent(this, Ganador.class);
            startActivity(i);
            finish();
        }

        else{
            int index = (int)(Math.random() * valores.size());
            int n = valores.get(index);

            switch (n){
                case 1:
                    activity = Pregunta1.class;
                    break;
                case 3:
                    activity = Pregunta3.class;
                    break;
            }

            Intent intent = new Intent(getBaseContext(), activity);
            intent.putIntegerArrayListExtra("valores", valores);
            startActivity(intent);
            finish();
        }


    }

}