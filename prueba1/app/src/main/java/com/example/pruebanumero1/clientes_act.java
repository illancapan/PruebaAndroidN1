package com.example.pruebanumero1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class clientes_act extends AppCompatActivity {

    private Spinner spin;
    private EditText producto;
    private TextView saldo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clientes_act);

        spin = (Spinner)findViewById(R.id.spinn);
        producto = (EditText)findViewById(R.id.ingresarProducto);
        saldo = (TextView)findViewById(R.id.saldoFinal);

        String[] listaSpin = {"MARIO", "CONSTANZA", "FERNANDA"};

        ArrayAdapter<String> adap = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaSpin);
        spin.setAdapter(adap);
    }

    public void calcular(View v) {
        String productoElegir = producto.getText().toString();
        String elegir;
        int restaTotal;


        elegir = spin.getSelectedItem().toString();

        if (productoElegir.equalsIgnoreCase("horno") && elegir.equals("MARIO"))
        {
            restaTotal = 500000 - 45000;
            saldo.setText("El saldo total es: "+restaTotal);
        }

        else if (productoElegir.equalsIgnoreCase("espejo") && elegir.equals("MARIO"))
        {
            restaTotal = 500000 - 100000;
            saldo.setText("El saldo total es: "+restaTotal);
        }

        else if (productoElegir.equalsIgnoreCase("sillas") && elegir.equals("MARIO"))
        {
            restaTotal = 500000 - 80000;
            saldo.setText("El saldo total es: "+restaTotal);
        }

        else if (productoElegir.equalsIgnoreCase("horno") && elegir.equals("CONSTANZA"))
        {
            restaTotal = 320000 - 100000;
            saldo.setText("El saldo total es: "+restaTotal);
        }
        else if (productoElegir.equalsIgnoreCase("espejo") && elegir.equals("CONSTANZA"))
        {
            restaTotal = 320000 - 100000;
            saldo.setText("El saldo total es: "+restaTotal);
        }
        else if (productoElegir.equalsIgnoreCase("sillas") && elegir.equals("CONSTANZA"))
        {
            restaTotal = 320000 - 100000;
            saldo.setText("El saldo total es: "+restaTotal);
        }
        else if (productoElegir.equalsIgnoreCase("horno") && elegir.equals("FERNANDA"))
        {
            restaTotal = 120000 - 100000;
            saldo.setText("El saldo total es: "+restaTotal);
        }
        else if (productoElegir.equalsIgnoreCase("espejo") && elegir.equals("FERNANDA"))
        {
            restaTotal = 120000 - 100000;
            saldo.setText("El saldo total es: "+restaTotal);
        }
        else if (productoElegir.equalsIgnoreCase("sillas") && elegir.equals("FERNANDA"))
        {
            restaTotal = 120000 - 100000;
            saldo.setText("El saldo total es: "+restaTotal);
        }
        else{
            saldo.setText("Los valores ingresados son invalidos");
        }



    }
}