package com.xandermave.amst_primeraevaluacionpractica_grupo7_lopez_proano;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Derrota extends AppCompatActivity {

    TextView numero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_derrota);
        Button salir = (Button) findViewById(R.id.btnSalir);
        TextView numero = findViewById(R.id.txtNumeroP);
        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                // numero.setText(cont);
            }
        });
    }
}