package com.example.kararvedonguunite4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg5Activity extends AppCompatActivity {
    EditText txtNumber1, txtNumber2, txtNumber3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg5_activity);

        txtNumber1 = findViewById(R.id.txtNumber1);
        txtNumber2 = findViewById(R.id.txtNumber2);
        txtNumber3 = findViewById(R.id.txtNumber3);
    }

    public void btnSuccess(View view) {
        int number1 = Integer.parseInt(txtNumber1.getText().toString()),
            number2 = Integer.parseInt(txtNumber2.getText().toString()),
            number3 = Integer.parseInt(txtNumber3.getText().toString());
        float average = (number1 + number2 + number3) / 3;

        if(number1 > 100 || number2 > 100 || number3 > 100) Toast.makeText(this, "Girilen not bilgileri hatalı", Toast.LENGTH_LONG).show();
        else if(average >= 0 && average < 25) Toast.makeText(this, "Ortalamanız " + average + ". 0 ile kaldınız.", Toast.LENGTH_LONG).show();
        else if(average >= 25 && average < 50) Toast.makeText(this, "Ortalamanız " + average + ". 1 ile kaldınız.", Toast.LENGTH_LONG).show();
        else if(average >= 50 && average < 60) Toast.makeText(this, "Ortalamanız " + average + ". 2 ile geçtiniz.", Toast.LENGTH_LONG).show();
        else if(average >= 60 && average < 70) Toast.makeText(this, "Ortalamanız " + average + ". 3 ile geçtiniz.", Toast.LENGTH_LONG).show();
        else if(average >= 70 && average < 85) Toast.makeText(this, "Ortalamanız " + average + ". 4 ile geçtiniz.", Toast.LENGTH_LONG).show();
        else if(average >= 85 && average < 100) Toast.makeText(this, "Ortalamanız " + average + ". 5 ile geçtiniz. Tebrikler!", Toast.LENGTH_LONG).show();
        else Toast.makeText(this, "Girilen not bilgileri hatalı.", Toast.LENGTH_LONG).show();
    }

    public void btnBack(View view) {
        Intent i = new Intent(Uyg5Activity.this, MainActivity.class);
        startActivity(i);
    }
}
