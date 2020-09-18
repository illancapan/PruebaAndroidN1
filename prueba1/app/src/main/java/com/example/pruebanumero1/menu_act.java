package com.example.pruebanumero1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.nio.channels.InterruptedByTimeoutException;

public class menu_act extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_act);
    }

    public void Productos(View v)
    {
        Intent product = new Intent(this, product_act.class);
        startActivity(product);
    }

    public void Comentarios(View v)
    {
        Intent comentary = new Intent(this,commentary_act.class);
        startActivity(comentary);
    }

    public void Clientes(View v)
    {
        Intent cliente = new Intent(this,clientes_act.class);
        startActivity(cliente);
    }

    public void Info(View v)
    {
        Intent informacion = new Intent(this,info_act.class);
        startActivity(informacion);
    }

}