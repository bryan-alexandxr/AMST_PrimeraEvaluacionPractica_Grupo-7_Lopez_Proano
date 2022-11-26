package com.xandermave.amst_primeraevaluacionpractica_grupo7_lopez_proano;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Derrota extends AppCompatActivity {
    int cont;
    TextView texto;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_derrota);
        cont = getIntent().getExtras().getInt("cont");

        texto = this.findViewById(R.id.txtDerrota);
        if (cont==1){
            texto.setText("Usted ha contestado correctamente " + String.valueOf(cont) + " pregunta." );
        }
        else{
            texto.setText("Usted ha contestado correctamente " + String.valueOf(cont) + " preguntas." );
        }
    }
}