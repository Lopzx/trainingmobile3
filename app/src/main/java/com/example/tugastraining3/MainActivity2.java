package com.example.tugastraining3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity2 extends AppCompatActivity {

    TextView txt1;
    TextView txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        txt1 = findViewById(R.id.usernamevalo);
        txt2 = findViewById(R.id.passwordvalo);

        SharedPreferences sp = getSharedPreferences("user", MODE_PRIVATE);
        txt1.setText(sp.getString("username",""));
        txt2.setText(sp.getString("password",""));
    }
}