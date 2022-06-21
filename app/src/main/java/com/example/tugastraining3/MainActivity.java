package com.example.tugastraining3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText username;
    EditText password;
    EditText password_cfrm;
    Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.editText);
        password = findViewById(R.id.editText2);
        password_cfrm = findViewById(R.id.editText3);
        register = findViewById(R.id.button);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().isEmpty() || password.getText().toString().isEmpty() || password_cfrm.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Tidak boleh kosong", Toast.LENGTH_SHORT).show();
                    return;
                } else if (!password.getText().toString().equals(password_cfrm.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Password dan Conf password harus sama", Toast.LENGTH_SHORT).show();
                    return;
                }
                Context ctx = getApplicationContext();
                SharedPreferences sp = getSharedPreferences("user", MODE_PRIVATE);
                SharedPreferences.Editor edt = sp.edit();
                edt.putString("username", username.getText().toString());
                edt.putString("password", password.getText().toString());
                edt.apply();
                Toast.makeText(getApplicationContext(),"Success", Toast.LENGTH_SHORT).show();
                Intent pindahIntent = new Intent(getApplicationContext(), com.example.tugastraining3.MainActivity2.class);
                startActivity(pindahIntent);

            }
        });
    }
}