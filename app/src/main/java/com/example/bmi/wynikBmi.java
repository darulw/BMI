package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class wynikBmi extends AppCompatActivity {
    bmi_calculation mBmi_calculation = new bmi_calculation();
    private static float wynik=0;
    private TextView mWynik;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_wynik_bmi);
        mWynik = (TextView) findViewById(R.id.wynik);
        wynik = mBmi_calculation.getBMI();
        if(wynik>25){
            mWynik.setText(String.valueOf(wynik)+"\n" +mBmi_calculation.getOpisy(2));
        }
        if(wynik<25&& wynik>18.5){
            mWynik.setText(String.valueOf(wynik)+"\n" +mBmi_calculation.getOpisy(1));
        }
        if(wynik<18.5){
            mWynik.setText(String.valueOf(wynik)+"\n"+mBmi_calculation.getOpisy(0));
        }
    }
}