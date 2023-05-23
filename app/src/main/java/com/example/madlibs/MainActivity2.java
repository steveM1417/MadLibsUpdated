package com.example.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    private EditText etNoun;
    private EditText etAdverb;
    private EditText etAdjective;
    private EditText etColor;
    private EditText etAnimal;
    private EditText etFavoriteColor;
    private EditText etNumber;
    private EditText etToy;
    private EditText etCar;
    private EditText etResturant;
    private EditText etAmountOfMoney;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        etNoun = findViewById(R.id.et_Noun)
        etAdverb = findViewById(R.id.et_Adverb)
        etAdjective = findViewById(R.id.et_Adjective)
        etColor = findViewById(R.id.et_Color)
        etAnimal = findViewById(R.id.et_Animal)
        etFavoriteColor = findViewById(R.id.et_FavoriteColor)
        etNumber = findViewById(R.id.et_Number)
        etToy = findViewById(R.id.et_Toy)
        etCar = findViewById(R.id.et_Car)
        etResturant = findViewById(R.id.et_Resturant)
        etAmountOfMoney = findViewById(R.id.et_AmountOfMoney)

    }
}