package com.example.kararvedonguunite4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg10Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg10_activity);
    }

    public void geri(View view) {
        Intent i = new Intent(Uyg10Activity.this, MainActivity.class);
        startActivity(i);
    }
}