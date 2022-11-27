package com.xandermave.amst_primeraevaluacionpractica_grupo7_lopez_proano;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Pregunta3 extends AppCompatActivity {
    ArrayList<Integer> valores = new ArrayList<>();
    int cont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta3);
        valores = getIntent().getIntegerArrayListExtra("valores");
        cont = getIntent().getExtras().getInt("cont");
    }

    public void derrota(View v){
        Intent i = new Intent(this, Derrota.class);
        i.putExtra("cont",cont);
        startActivity(i);
        finish();
    }

    public void correcto(View v){
        cont += 1;
        valores.remove((Integer) 3); //Se saca la pregunta 3 de la lista de preguntas disponibles

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
                case 2:
                    activity = Pregunta2.class;
                    break;
                case 4:
                    activity = Pregunta4.class;
                    break;
                case 5:
                    activity = Pregunta5.class;
                    break;
                case 6:
                    activity = Pregunta6.class;
                    break;
            }

            Intent intent = new Intent(getBaseContext(), activity);
            intent.putIntegerArrayListExtra("valores", valores);
            intent.putExtra("cont",cont);
            startActivity(intent);
            finish();
        }

        }
}