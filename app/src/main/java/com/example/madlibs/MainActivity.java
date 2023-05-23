package com.example.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etNoun;
    private EditText etAdverb;
    private EditText etAdjective;
    private EditText etColor;
    private EditText etAnimal;
    private EditText etFavoriteColor;
    private EditText etAnyNumber;
    private EditText etToy;
    private EditText etCar;
    private EditText etResturant;
    private EditText etAmountOfMoney;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}