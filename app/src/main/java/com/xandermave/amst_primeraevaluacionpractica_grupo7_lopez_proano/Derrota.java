package com.xandermave.amst_primeraevaluacionpractica_grupo7_lopez_proano;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Derrota extends AppCompatActivity {
    @SuppressLint("SetTextI18n")
    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_derrota);
        Button salir = (Button) findViewById(R.id.btnSalir);
        Button volver = (Button) findViewById(R.id.button);
        int cont = getIntent().getExtras().getInt("cont");

        texto = this.findViewById(R.id.txtDerrota);

            texto.setText(String.valueOf(cont));

        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        Intent i = new Intent(this, MainActivity.class);
        volver.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(i);
            }
        });
    }
}