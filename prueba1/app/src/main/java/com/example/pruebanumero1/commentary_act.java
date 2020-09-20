package com.example.pruebanumero1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.Spinner;

import java.util.Timer;
import java.util.TimerTask;

public class commentary_act extends AppCompatActivity {

    private Spinner spin;
    private ProgressBar progress;
    private int progreso;
    private RatingBar rating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commentary_act);

        spin = (Spinner) findViewById(R.id.spinn);
        progress = (ProgressBar) findViewById(R.id.progressBar);
        rating = (RatingBar) findViewById(R.id.RatingBar);


        String[] listaSpin = {"TELEVISOR", "REFRIGERADOR", "HORNO", "LAVADORA"};

        ArrayAdapter<String> adap = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaSpin);
        spin.setAdapter(adap);

    }
    public void Calificar(View v)
    {
        //TEMPORIZADOR

        Timer t = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {

                progreso++;
                progress.setProgress(progreso);
            }
        };

        long period = 30;
        long delay = 0;

        t.schedule(tt, delay, period);


        //RATINGBAR
        rating.setRating(3);
    }
}