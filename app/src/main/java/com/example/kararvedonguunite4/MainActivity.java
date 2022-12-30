package com.example.kararvedonguunite4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnUyg1(View view) {
        Intent intent = new Intent(MainActivity.this, Uyg1Activity.class);
        startActivity(intent);
    }

    public void btnUyg2(View view) {
        Intent intent = new Intent(MainActivity.this, Uyg2Activity.class);
        startActivity(intent);
    }

    public void btnUyg3(View view) {
        Intent intent = new Intent(MainActivity.this, Uyg3Activity.class);
        startActivity(intent);
    }

    public void btnUyg4(View view) {
        Intent intent = new Intent(MainActivity.this, Uyg4Activity.class);
        startActivity(intent);
    }

    public void btnUyg5(View view) {
        Intent intent = new Intent(MainActivity.this, Uyg5Activity.class);
        startActivity(intent);
    }

    public void btnUyg6(View view) {
        Intent intent = new Intent(MainActivity.this, Uyg6Activity.class);
        startActivity(intent);
    }

    public void btnUyg7(View view) {
        Intent intent = new Intent(MainActivity.this, Uyg7Activity.class);
        startActivity(intent);
    }

    public void btnUyg8(View view) {
        Intent intent = new Intent(MainActivity.this, Uyg8Activity.class);
        startActivity(intent);
    }

    public void btnUyg9(View view) {
        Intent intent = new Intent(MainActivity.this, Uyg9Activity.class);
        startActivity(intent);
    }

    public void btnUyg10(View view) {
        Intent intent = new Intent(MainActivity.this, Uyg10Activity.class);
        startActivity(intent);
    }

    public void btnGoldSoru1(View view) {
        Intent intent = new Intent(MainActivity.this, GoldSoru1Activity.class);
        startActivity(intent);
    }

    public void btnGoldSoru2(View view) {
        Intent intent = new Intent(MainActivity.this, GoldSoru2Activity.class);
        startActivity(intent);
    }
}