package com.xandermave.amst_primeraevaluacionpractica_grupo7_lopez_proano;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
//Main activity es la Bienvenida
    Button btnEmpezar;
    ArrayList<Integer> valores =  new ArrayList<>();
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnEmpezar = (Button) findViewById(R.id.btnEmpezar);
        valores.add(1);
        valores.add(2);
        valores.add(3);
        valores.add(4);
        valores.add(5);
        valores.add(6);

        Random rand = new Random();
        int n = rand.nextInt(6)+ 1; //por ahora habrán 6 preguntas

        int cont = 0; //Para saber cuantas preguntas ha contestado correctamente

        btnEmpezar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                valores.remove((Integer) n);

            if (n == 1){
                    Intent i = new Intent(MainActivity.this, Pregunta1.class);
                    i.putIntegerArrayListExtra("valores", valores);
                    i.putExtra("cont",cont);
                    startActivity(i);
                    finish();
                }
                else if (n == 2){
                    Intent i = new Intent(MainActivity.this, Pregunta2.class);
                    i.putIntegerArrayListExtra("valores", valores);
                    i.putExtra("cont",cont);
                    startActivity(i);
                    finish();
                }
                else if (n ==3) {
                    Intent i = new Intent(MainActivity.this, Pregunta3.class);
                    i.putIntegerArrayListExtra("valores", valores);
                    i.putExtra("cont",cont);
                    startActivity(i);
                    finish();
                }
            else if (n ==4) {
                Intent i = new Intent(MainActivity.this, Pregunta4.class);
                i.putIntegerArrayListExtra("valores", valores);
                i.putExtra("cont",cont);
                startActivity(i);
                finish();
            }
            else if (n ==5) {
                Intent i = new Intent(MainActivity.this, Pregunta5.class);
                i.putIntegerArrayListExtra("valores", valores);
                i.putExtra("cont",cont);
                startActivity(i);
                finish();
            }
            else if (n ==6) {
                Intent i = new Intent(MainActivity.this, Pregunta6.class);
                i.putIntegerArrayListExtra("valores", valores);
                i.putExtra("cont",cont);
                startActivity(i);
                finish();
            }

            }
        });

        }

}