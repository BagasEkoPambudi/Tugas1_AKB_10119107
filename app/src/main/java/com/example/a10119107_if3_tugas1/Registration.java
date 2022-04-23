package com.example.a10119107_if3_tugas1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//23 April 2022
//10119107
//Bagas Eko Pambudi
//IF-3

public class Registration extends AppCompatActivity {

    private Button button_registration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        button_registration = findViewById(R.id.button_Registration);

        button_registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Registration.this, Login.class);
                startActivity(intent);
            }
        });
    }
}