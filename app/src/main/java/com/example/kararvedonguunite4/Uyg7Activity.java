package com.example.kararvedonguunite4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg7Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg7_activity);
    }

    public void btnBack(View view) {
        Intent i = new Intent(Uyg7Activity.this, MainActivity.class);
        startActivity(i);
    }
}
