package com.example.kararvedonguunite4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Uyg4Activity extends AppCompatActivity {
    Switch locationService,getLocation,sendLocation;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.uyg4_activity);

        locationService = findViewById(R.id.switchLocationService);
        getLocation = findViewById(R.id.switchGetLocation);
        sendLocation = findViewById(R.id.switchSendLocation);

        if(locationService.isChecked()) {
            getLocation.setVisibility(View.VISIBLE);
            sendLocation.setVisibility(View.VISIBLE);
        } else {
            getLocation.setVisibility(View.GONE);
            sendLocation.setVisibility(View.GONE);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        locationService.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(locationService.isChecked()) {
                    getLocation.setVisibility(View.VISIBLE);
                    sendLocation.setVisibility(View.VISIBLE);
                } else {
                    getLocation.setVisibility(View.GONE);
                    sendLocation.setVisibility(View.GONE);
                }
            }
        });
    }

    public void btnSuccess(View view) {
        if(!locationService.isChecked()) Toast.makeText(this, "Konum servisleri kapalı.", Toast.LENGTH_LONG).show();
        else {
            if(getLocation.isChecked() == true && sendLocation.isChecked() == true) Toast.makeText(this, "Konum al ve Konum gönder açık.", Toast.LENGTH_LONG).show();
            if(getLocation.isChecked() == true && sendLocation.isChecked() == false) Toast.makeText(this, "Konum al açık, Konum gönder kapalı.", Toast.LENGTH_LONG).show();
            if(getLocation.isChecked() == false && sendLocation.isChecked() == true) Toast.makeText(this, "Konum al kapalı, Konum gönder açık.", Toast.LENGTH_LONG).show();
            if(getLocation.isChecked() == false && sendLocation.isChecked() == false) Toast.makeText(this, "Konum al ve Konum gönder kapalı.", Toast.LENGTH_LONG).show();
        }
    }

    public void btnBack(View view) {
        Intent i = new Intent(Uyg4Activity.this, MainActivity.class);
        startActivity(i);
    }
}