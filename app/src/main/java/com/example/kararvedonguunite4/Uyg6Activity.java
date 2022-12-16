package com.example.kararvedonguunite4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg6Activity extends AppCompatActivity {
    EditText txtNumber;
    TextView txtViewMonth;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg6_activity);

        txtNumber = findViewById(R.id.txtNumber);
        txtViewMonth = findViewById(R.id.txtViewMonth);
    }

    public void btnSuccess(View view) {
        int month = Integer.parseInt(txtNumber.getText().toString());
        String monthName;

        switch (month) {
            case 1:
                monthName = "Ocak";
                break;
            case 2:
                monthName = "Şubat";
                break;
            case 3:
                monthName = "Mart";
                break;
            case 4:
                monthName = "Nisan";
                break;
            case 5:
                monthName = "Mayıs";
                break;
            case 6:
                monthName = "Haziran";
                break;
            case 7:
                monthName = "Temmuz";
                break;
            case 8:
                monthName = "Ağustos";
                break;
            case 9:
                monthName = "Eylül";
                break;
            case 10:
                monthName = "Ekim";
                break;
            case 11:
                monthName = "Kasım";
                break;
            case 12:
                monthName = "Aralık";
                break;
            default:
                monthName = "0 - 12 arası değer giriniz";
        }

        txtViewMonth.setText(monthName);
    }

    public void btnBack(View view) {
        Intent i = new Intent(Uyg6Activity.this, MainActivity.class);
        startActivity(i);
    }
}