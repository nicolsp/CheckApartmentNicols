package com.example.checkapartmentni;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText txtnombre, txtpasword;
    private Button button
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtnombre = (EditText) findViewById(R.id.txtnombre);
        txtpasword = (EditText) findViewById(R.id.txtpasword);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EnviarPrincipal(view);
                Toast.makeText(LoginActivity.this, "Hola querido lunes", Toast.LENGTH_SHORT).show
            }
        };

        }
    }

    public void EnviarPrincipal(View view) {
        String pasword = "";
        if (txtnombre.getText().toString().isEmpty()) {
            Toast.makeText(this, "Campo Correo Vacio", Toast.LENGTH_LONG).show();
        } else {
            if (txtpasword.getText().toString().isEmpty()) {
                Toast.makeText(this, "Campo Contraseña Vacio", Toast.LENGTH_LONG).show();
            } else {
                pasword = txtpasword.getText().toString();
                if (pasword.equals("123pass")) {
                    Intent iniciar = new Intent(this, LoginActivity.class);
                    startActivity(iniciar);
                }
            }
        }


}