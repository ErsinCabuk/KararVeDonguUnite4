package com.example.kararvedonguunite4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class GoldSoru2Activity extends AppCompatActivity {
    EditText txtNumber, txtSingleNumbers, txtDoubleNumbers;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.goldsoru2_activity);

        txtNumber = findViewById(R.id.txtNumber);
        txtSingleNumbers = findViewById(R.id.txtSingleNumbers);
        txtDoubleNumbers = findViewById(R.id.txtDoubleNumbers);

    }

    public void btnSuccess(View view) {
        int number = Integer.parseInt(txtNumber.getText().toString());
        String singleNumbers = "",
               doubleNumbers = "";

        txtSingleNumbers.setText("");
        txtDoubleNumbers.setText("");

        int singleResult = 0, doubleResult = 0;
        for (int i = 1; i <= number; i++)
        {
            if (i % 2 == 0) {
                doubleResult = doubleResult + i;
                doubleNumbers += doubleResult + "\n";
            } else {
                singleResult = singleResult + i;
                singleNumbers += singleResult + "\n";
            }
        }

        txtSingleNumbers.setText(singleNumbers);
        txtDoubleNumbers.setText(doubleNumbers);
    }

    public void btnBack(View view) {
        Intent i = new Intent(GoldSoru2Activity.this, MainActivity.class);
        startActivity(i);
    }
}
