package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private SeekBar waga;
    private SeekBar wzrost;
    private TextView mWzrost;
    private TextView mWaga;
    private static int tempWzrost;
    private static int tempWaga;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wzrost = (SeekBar) findViewById(R.id.SeekBar_wzrost);
        waga = (SeekBar) findViewById(R.id.seekBar_waga);
        mWaga = (TextView) findViewById(R.id.waga_text);
        mWzrost = (TextView) findViewById(R.id.wzrost_text);


        wzrost.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                if (i == 0) {
                    mWzrost.setText("WZROST");
                }
                if (i < 100 && i != 0) {
                    mWzrost.setText(String.valueOf(i) + " CM");
                } else if (i > 100) {
                    mWzrost.setText(String.valueOf(i).substring(0, 1) + "," + String.valueOf(i).substring(1) + " CM");
                }
                tempWzrost = i;

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }

        });

        waga.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                if (i == 0) {
                    mWaga.setText("WAGA");
                }
                if (i > 0) {
                    mWaga.setText(String.valueOf(i) + " KG");
                }

                tempWaga = i;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }


    public void Oblicz(View view) {

        Intent it = new Intent(MainActivity.this, ResultBmi.class);
        startActivity(it);

    }

    public int getTempWzrost() {
        return tempWzrost;
    }

    public int getTempWaga() {
        return tempWaga;
    }
}