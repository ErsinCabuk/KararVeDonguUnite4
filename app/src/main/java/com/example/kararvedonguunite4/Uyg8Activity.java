package com.example.kararvedonguunite4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg8Activity extends AppCompatActivity {
    TextView txtInfo;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg7_activity);

        txtInfo = findViewById(R.id.txtInfo);
    }

    public void btnBack(View view) {
        Intent i = new Intent(Uyg8Activity.this, MainActivity.class);
        startActivity(i);
    }

    public void btnRun(View view) {
        txtInfo.setText("LogCat'i kontrol et");
        for (int i = 3; i <= 100; i+=3) {
            System.out.println(i);
        }
    }
}