package com.example.pruebanumero1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class product_act extends AppCompatActivity {

    private CheckBox check_envio, check_retiro, check_gratis;
    private EditText nombre_producto, pago_monto;
    private TextView mos_calculo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_act);

        check_envio = (CheckBox)findViewById(R.id.chk_envio);
        check_retiro = (CheckBox)findViewById(R.id.chk_retiro);
        check_gratis = (CheckBox)findViewById(R.id.chk_gratis);

        nombre_producto = (EditText)findViewById(R.id.nombreProducto);
        pago_monto = (EditText)findViewById(R.id.pagarProducto);

        mos_calculo = (TextView)findViewById(R.id.txtvCalculo);
    }

    public void Calcular(View v)
    {
        String producto = nombre_producto.getText().toString();
        int pago = Integer.parseInt(pago_monto.getText().toString());

        if (producto.equalsIgnoreCase("televisor") && check_envio.isChecked() == true)
        {
            int sumaTotal = 129000 + 14500;
            int operacion = sumaTotal - pago;

            String resultado = String.valueOf(operacion);
            if (resultado != "0") {
                pago_monto.setText("Su deuda es: "+resultado);
            }
            else
            {
                mos_calculo.setText("No tiene deuda");
            }
        }

        else if (producto.equalsIgnoreCase("microondas") && check_envio.isChecked() == true)
        {
            int sumaTotal = 50000  + 5500;
            int operacion = sumaTotal - pago;

            String resultado = String.valueOf(operacion);

            if (resultado != "0") {
                mos_calculo.setText("Su deuda es: "+resultado);
            }
            else
            {
                mos_calculo.setText("No tiene deuda");
            }
        }

        else if (producto.equalsIgnoreCase("lavadora") && check_envio.isChecked() == true)
        {
            int sumaTotal = 100000 + 25000;
            int operacion = sumaTotal - pago;

            String resultado = String.valueOf(operacion);

            if (resultado != "0") {
                mos_calculo.setText("Su deuda es: " + resultado);
            } else {
                mos_calculo.setText("No tiene deuda");
            }
        }

        else if (producto.equalsIgnoreCase("televisor") && check_retiro.isChecked() == true)
        {
            int sumaTotal = 129000;
            int operacion = sumaTotal - pago;

            String resultado = String.valueOf(operacion);

            if (resultado != "0") {
                mos_calculo.setText("Su deuda es: "+resultado);
            }
            else
            {
                mos_calculo.setText("No tiene deuda");
            }

        }

        else if (producto.equalsIgnoreCase("microondas") && check_retiro.isChecked() == true)
        {
            int sumaTotal = 50000;
            int operacion = sumaTotal - pago;

            String resultado = String.valueOf(operacion);

            if (resultado != "0") {
                mos_calculo.setText("Su deuda es: "+resultado);
            }
            else
            {
                mos_calculo.setText("No tiene deuda");
            }

        }

        else if (producto.equalsIgnoreCase("lavadora") && check_retiro.isChecked() == true)
        {
            int sumaTotal = 100000;
            int operacion = sumaTotal - pago;

            String resultado = String.valueOf(operacion);

            if (resultado != "0") {
                mos_calculo.setText("Su deuda es: "+resultado);
            }
            else
            {
                mos_calculo.setText("No tiene deuda");
            }

        }

        else if (producto.equalsIgnoreCase("televisor") && check_gratis.isChecked() == true)
        {
            int sumaTotal = 129000;
            int operacion = sumaTotal - pago;

            String resultado = String.valueOf(operacion);

            if (resultado != "0") {
                mos_calculo.setText("Su deuda es: "+resultado);
            }
            else
            {
                mos_calculo.setText("No tiene deuda");
            }

        }

        else if (producto.equalsIgnoreCase("microondas") && check_gratis.isChecked() == true)
        {
            int sumaTotal = 50000;
            int operacion = sumaTotal - pago;

            String resultado = String.valueOf(operacion);

            if (resultado != "0") {
                mos_calculo.setText("Su deuda es: "+resultado);
            }
            else
            {
                mos_calculo.setText("No tiene deuda");
            }

        }

        else if (producto.equalsIgnoreCase("lavadora") && check_gratis.isChecked() == true)
        {
            int sumaTotal = 100000;
            int operacion = sumaTotal - pago;

            String resultado = String.valueOf(operacion);

            if (resultado != "0") {
                mos_calculo.setText("Su deuda es: "+resultado);
            }
            else
            {
                mos_calculo.setText("No tiene deuda");
            }

        }
    }
}