package com.example.kararvedonguunite4;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg10Activity extends AppCompatActivity {
    EditText txtNumber;
    TextView txtResult;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg10_activity);
        txtNumber = findViewById(R.id.txtNumber);
        txtResult = findViewById(R.id.txtResult);
    }

    public void btnSuccess(View view) {
        int number = Integer.parseInt(txtNumber.getText().toString());
        int counter = 1;
        long result = 1;
        while(counter <= number) {
            result = result * counter;
            counter++;
        }
        txtResult.setText("Sonuç: " + result);
    }

    public void btnBack(View view) {
        Intent i = new Intent(Uyg10Activity.this, MainActivity.class);
        startActivity(i);
    }
}