package com.example.kararvedonguunite4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg1Activity extends AppCompatActivity {
    EditText txtNumber;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg1_activity);

        txtNumber = findViewById(R.id.txtNumber);
    }

    public void btnKontrolEt(View view) {
        int number = Integer.parseInt(txtNumber.getText().toString());
        if(number > 100) Toast.makeText(this, "100'den büyük değer girilmez.", Toast.LENGTH_LONG).show();
        else Toast.makeText(this, "Not kaydedildi.", Toast.LENGTH_LONG).show();
    }

    public void btnBack(View view) {
        Intent i = new Intent(Uyg1Activity.this, MainActivity.class);
        startActivity(i);
    }
}
