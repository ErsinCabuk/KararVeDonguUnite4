package com.example.kararvedonguunite4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg2Activity extends AppCompatActivity {
    EditText txtNumber1;
    EditText txtNumber2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg2_activity);
        txtNumber1 = findViewById(R.id.txtNumber1);
        txtNumber2 = findViewById(R.id.textNumber2);
    }

    public void btnKontrolEt(View view) {
        int number1 = Integer.parseInt(txtNumber1.getText().toString());
        int number2 = Integer.parseInt(txtNumber2.getText().toString());
        if(number1 > number2) {
            Toast.makeText(Uyg2Activity.this,"1. sayı daha büyüktür",Toast.LENGTH_LONG).show();
        }
        if(number1 > number2) {
            Toast.makeText(Uyg2Activity.this,"2. sayı daha büyüktür.",Toast.LENGTH_LONG).show();
        }
        if(number1 == number2) {
            Toast.makeText(Uyg2Activity.this,"İki sayı birbirine eşittir.",Toast.LENGTH_LONG).show();
        }
    }

    public void btnBack(View view) {
        Intent i = new Intent(Uyg2Activity.this, MainActivity.class);
        startActivity(i);
    }
}
