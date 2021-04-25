package com.example.bmi;

public class BmiCalculation {
    private float waga;
    private float wzrost;
    private static float bmi;
    private static String[] opisy = {
            "Twoja waga jest za niska",
            "Prawidłowa waga",
            "Ważysz za dużo"
    };
    MainActivity mMainActivity = new MainActivity();


    public BmiCalculation() {
        waga = mMainActivity.getTempWaga();
        wzrost = mMainActivity.getTempWzrost();
        bmi = (waga) / ((wzrost * wzrost) / 10000);

    }

    public float getBMI() {
        return bmi;
    }

    public String getOpisy(int i) {
        return opisy[i];
    }
}

