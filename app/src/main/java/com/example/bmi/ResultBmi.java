package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class ResultBmi extends AppCompatActivity {
    BmiCalculation mBmiCalculation = new BmiCalculation();
    private static float wynik = 0;
    private TextView mWynik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wynik_bmi);
        mWynik = (TextView) findViewById(R.id.wynik);
        wynik = mBmiCalculation.getBMI();
        if (wynik > 25) {
            mWynik.setText(String.valueOf(wynik) + "\n" + mBmiCalculation.getOpisy(2));
        }
        if (wynik < 25 && wynik > 18.5) {
            mWynik.setText(String.valueOf(wynik) + "\n" + mBmiCalculation.getOpisy(1));
        }
        if (wynik < 18.5) {
            mWynik.setText(String.valueOf(wynik) + "\n" + mBmiCalculation.getOpisy(0));
        }
    }
}