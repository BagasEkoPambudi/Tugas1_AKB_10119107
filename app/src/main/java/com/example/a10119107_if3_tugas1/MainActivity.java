
package com.example.a10119107_if3_tugas1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

//23 April 2022
//10119107
//Bagas Eko Pambudi
//IF-3

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_logout = findViewById(R.id.button_Logout);
        Button button_profile = findViewById(R.id.button_Profile);

        button_logout.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Login.class);
            startActivity(intent);
        });

        button_profile.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, Profil.class);
            startActivity(intent);
        });
    }
}