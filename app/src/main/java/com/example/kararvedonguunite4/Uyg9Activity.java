package com.example.kararvedonguunite4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg9Activity extends AppCompatActivity {
    EditText txtNumbers, txtNumber;
    int number;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg9_activity);
        txtNumbers = findViewById(R.id.txtNumbers);
        txtNumber = findViewById(R.id.txtNumber);
    }

    public void btnDoubleNumbers(View view) {
        String str = "";
        txtNumbers.setText("");
        number = Integer.parseInt(txtNumber.getText().toString());
        for (int i = 0; i < number; i++) {
            if(i % 2 == 0) str += txtNumbers.getText().toString() + i + " - ";
        }
        str = str.substring(0, str.length() - 3);
        txtNumbers.setText(str);

    }

    public void btnSingleNumbers(View view) {
        String str = "";
        txtNumbers.setText("");
        number = Integer.parseInt(txtNumber.getText().toString());
        for (int i = 0; i < number; i++) {
            if(i % 2 != 0) str += txtNumbers.getText().toString() + i + " - ";
        }
        str = str.substring(0, str.length() - 3);
        txtNumbers.setText(str);
    }

    public void btnAllNumbers(View view) {
        String str = "";
        txtNumbers.setText("");
        number = Integer.parseInt(txtNumber.getText().toString());
        for (int i = 0; i < number; i++) {
            str += txtNumbers.getText().toString() + i + " - ";
        }
        str = str.substring(0, str.length() - 3);
        txtNumbers.setText(str);
    }

    public void btnBack(View view) {
        Intent i = new Intent(Uyg9Activity.this, MainActivity.class);
        startActivity(i);
    }
}
