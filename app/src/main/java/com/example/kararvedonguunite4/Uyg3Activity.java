package com.example.kararvedonguunite4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg3Activity extends AppCompatActivity {
    EditText txtUsername, txtPassword;
    final String username = "ErsinCabuk";
    final String password = "123456789";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg3_activity);

        txtUsername = findViewById(R.id.txtUsername);
        txtPassword = findViewById(R.id.txtPassword);
    }

    public void btnSuccess(View view) {
        if(username.equals(txtUsername.getText().toString()) && password.equals(txtPassword.getText().toString())) {
            Toast.makeText(this, "Giriş yapıldı.", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(this, "Giriş hatalı.", Toast.LENGTH_LONG).show();
        }
    }

    public void btnBack(View view) {
        Intent i = new Intent(Uyg3Activity.this, MainActivity.class);
        startActivity(i);
    }
}
