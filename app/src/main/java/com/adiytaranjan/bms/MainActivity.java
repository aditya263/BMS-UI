package com.adiytaranjan.bms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout Admission;
    Button ContactLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Admission=(LinearLayout)findViewById(R.id.admission1_layout);
        Admission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,RegistrationForm.class);
                startActivity(intent);
            }
        });

        ContactLayout=(Button)findViewById(R.id.contact);
        ContactLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Contact.class);
                startActivity(intent);
            }
        });

    }
}
