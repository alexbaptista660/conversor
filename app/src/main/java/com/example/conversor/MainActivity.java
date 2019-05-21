package com.example.conversor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String Titulo;
    int unidad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button CelToFah;
        Button FahToCel;
        Button CelToKel;
        Button KelToCel;

        Button MetToCen;
        Button CenToMet;
        Button CenToInc;
        Button IncToCen;

      /*  CelToFah = findViewById(R.id.button);
        FahToCel = findViewById(R.id.button2);
        CelToKel = findViewById(R.id.button3);
        KelToCel = findViewById(R.id.button4);

        MetToCen = findViewById(R.id.button5);
        CenToMet = findViewById(R.id.button6);
        CenToInc = findViewById(R.id.button7);
        IncToCen = findViewById(R.id.button8);*/

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView text = findViewById(R.id.textView2);
                EditText num = findViewById(R.id.editText);
                Titulo = text.getText().toString();
                String unidad1 = num.getText().toString();
                unidad = Integer.parseInt(unidad1);
                calcular(v);

            }
        });
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView text = findViewById(R.id.textView2);
                EditText num = findViewById(R.id.editText);
                Titulo = text.getText().toString();
                String unidad1 = num.getText().toString();
                unidad = Integer.parseInt(unidad1);
                calcular(v);
            }
        });
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView text = findViewById(R.id.textView2);
                EditText num = findViewById(R.id.editText);
                Titulo = text.getText().toString();
                String unidad1 = num.getText().toString();
                unidad = Integer.parseInt(unidad1);
                calcular(v);
            }
        });
        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView text = findViewById(R.id.textView2);
                EditText num = findViewById(R.id.editText);
                Titulo = text.getText().toString();
                String unidad1 = num.getText().toString();
                unidad = Integer.parseInt(unidad1);
                calcular(v);
            }
        });

        findViewById(R.id.button5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView text = findViewById(R.id.textView2);
                EditText num = findViewById(R.id.editText2);
                Titulo = text.getText().toString();
                String unidad1 = num.getText().toString();
                unidad = Integer.parseInt(unidad1);
                calcular(v);
            }
        });
        findViewById(R.id.button6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView text = findViewById(R.id.textView2);
                EditText num = findViewById(R.id.editText2);
                Titulo = text.getText().toString();
                String unidad1 = num.getText().toString();
                unidad = Integer.parseInt(unidad1);
                calcular(v);
            }
        });
        findViewById(R.id.button7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView text = findViewById(R.id.textView2);
                EditText num = findViewById(R.id.editText2);
                Titulo = text.getText().toString();
                String unidad1 = num.getText().toString();
                unidad = Integer.parseInt(unidad1);
                calcular(v);
            }
        });
        findViewById(R.id.button8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView text = findViewById(R.id.textView2);
                EditText num = findViewById(R.id.editText2);
                Titulo = text.getText().toString();
                String unidad1 = num.getText().toString();
                unidad = Integer.parseInt(unidad1);
                calcular(v);
            }
        });
    }

    public void calcular(View View)
    {
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
}
