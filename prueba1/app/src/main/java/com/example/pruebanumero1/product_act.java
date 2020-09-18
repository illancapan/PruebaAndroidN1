package com.example.pruebanumero1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class product_act extends AppCompatActivity {

    private CheckBox check_envio, check_retiro, check_gratis;
    private Spinner menu_spinner;
    private EditText pago_monto;
    private TextView mos_calculo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_act);

        check_envio = (CheckBox)findViewById(R.id.chk_envio);
        check_retiro = (CheckBox)findViewById(R.id.chk_retiro);
        check_gratis = (CheckBox)findViewById(R.id.chk_gratis);

        menu_spinner = (Spinner)findViewById(R.id.menu_spinn);
        pago_monto = (EditText)findViewById(R.id.pagarProducto);

        mos_calculo = (TextView)findViewById(R.id.txtvCalculo);
    }
}