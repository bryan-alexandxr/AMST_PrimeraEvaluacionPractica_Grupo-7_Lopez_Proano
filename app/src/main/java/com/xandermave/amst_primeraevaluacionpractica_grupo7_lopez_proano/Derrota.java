package com.xandermave.amst_primeraevaluacionpractica_grupo7_lopez_proano;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Derrota extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_derrota);
        Button salir = (Button) findViewById(R.id.btnSalir);
        Button volver = (Button) findViewById(R.id.button);
        TextView numero = (TextView) findViewById(R.id.Numero);
        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                numero.setText("cont");
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