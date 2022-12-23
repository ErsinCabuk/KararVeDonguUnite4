package com.example.kararvedonguunite4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg9Activity extends AppCompatActivity {
    EditText txtNumbers;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg9_activity);
        txtNumbers = findViewById(R.id.txtNumbers);
    }

    public void btnDoubleNumbers(View view) {
        txtNumbers.setText("");
        for (int i = 0; i < 15; i += 2) {
            if(i % 2 == 0) txtNumbers.setText(txtNumbers.getText().toString() + " " + i);
        }
    }

    public void btnSingleNumbers(View view) {
        txtNumbers.setText("");
        for (int i = 0; i < 15; i++) {
            if(i % 2 != 0) txtNumbers.setText(txtNumbers.getText().toString() + " " + i);
        }
    }

    public void btnAllNumbers(View view) {
        txtNumbers.setText("");
        for (int i = 0; i < 15; i++) {
            txtNumbers.setText(txtNumbers.getText().toString() + " " + i);
        }
    }

    public void btnBack(View view) {
        Intent i = new Intent(Uyg9Activity.this, MainActivity.class);
        startActivity(i);
    }
}
