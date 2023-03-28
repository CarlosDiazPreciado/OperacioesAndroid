package com.example.misoperaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class potencia extends AppCompatActivity implements View.OnClickListener {
    EditText etx1, etx2;
    TextView tv1;
    Button bt1,bt2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_potencia);
        etx1 = (EditText) findViewById(R.id.texto3);
        etx2 = (EditText) findViewById(R.id.txt4);
        tv1 = (TextView) findViewById(R.id.et1);

        bt2 = (Button)findViewById(R.id.btmenu);
        bt2.setOnClickListener(this);

        bt1 = (Button) findViewById(R.id.boton2);
        bt1.setOnClickListener(this);
    }



    @Override
    public void onClick(View view) {

        int x, n, resultado;
        n = Integer.parseInt(etx1.getText().toString());
        x = Integer.parseInt(etx2.getText().toString());
        resultado = n;
        for (int i = 1; i < x; i++){
            resultado = n * resultado;

            tv1.setText(String.valueOf(resultado));

        }

    }

    public void Devolver(View view) {
        Intent Devolver = new Intent(potencia.this, MainActivity.class);
        startActivity(Devolver);


    }
}
