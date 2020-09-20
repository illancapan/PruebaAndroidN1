package com.example.pruebanumero1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    private EditText userId, passwordId;
    private TextView txt_V;
    private String user, pass;


    @Override
    protected void onCreate(Bundle savedInstanceState)

    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_V = (TextView)findViewById(R.id.txt_error);

        userId = (EditText)findViewById(R.id.userId);
        passwordId = (EditText)findViewById(R.id.passId);

    }

    public void btnLogin(View v)

    {
        user = userId.getText().toString();
        pass = passwordId.getText().toString();

        if (user.equalsIgnoreCase("android") && pass.equals("123"))
        {
            Intent botonInicio = new Intent(this,menu_act.class);
            startActivity(botonInicio);
        }

        else
            {
                txt_V.setText("Error al ingresar sus datos");
            }
    }

}