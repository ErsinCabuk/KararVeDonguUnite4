package com.example.kararvedonguunite4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg2Activity extends AppCompatActivity {
    EditText textSayi1;
    EditText textSayi2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg2_activity);
        textSayi1 = findViewById(R.id.textSayi1);
        textSayi2 = findViewById(R.id.textSayi2);
    }

    public void btnKontrolEt(View view) {
        int  sayi1 = Integer.parseInt(textSayi1.getText().toString());
        int sayi2 = Integer.parseInt(textSayi2.getText().toString());
        if(sayi1 > sayi2) {
            Toast.makeText(Uyg2Activity.this,"1. sayı daha büyüktür",Toast.LENGTH_LONG).show();
        }
        if(sayi2 > sayi1) {
            Toast.makeText(Uyg2Activity.this,"2. sayı daha büyüktür.",Toast.LENGTH_LONG).show();
        }
        if(sayi1 == sayi2) {
            Toast.makeText(Uyg2Activity.this,"İki sayı birbirine eşittir.",Toast.LENGTH_LONG).show();
        }
    }

    public void geri(View view) {
        Intent i = new Intent(Uyg2Activity.this, MainActivity.class);
        startActivity(i);
    }
}
