package com.example.kararvedonguunite4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg1Activity extends AppCompatActivity {
    EditText textNot;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg1_activity);

        textNot = findViewById(R.id.textNot);
    }

    public void btnKontrolEt(View view) {
        int sayi = Integer.parseInt(textNot.getText().toString());
        if(sayi > 100) Toast.makeText(this, "100'den büyük değer girilmez.", Toast.LENGTH_LONG).show();
        else Toast.makeText(this, "Not kaydedildi.", Toast.LENGTH_LONG).show();
    }

    public void geri(View view) {
        Intent i = new Intent(Uyg1Activity.this, MainActivity.class);
        startActivity(i);
    }
}
