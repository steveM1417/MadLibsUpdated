package com.example.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.CharacterPickerDialog;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

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
    private Button btnGenerate;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNoun = findViewById(R.id.et_Noun);
        etAdverb = findViewById(R.id.et_Adverb);
        etAdjective = findViewById(R.id.et_Adjective);
        etColor = findViewById(R.id.et_Color);
        etAnimal = findViewById(R.id.et_Animal);
        etFavoriteColor = findViewById(R.id.et_FavoriteColor);
        etNumber = findViewById(R.id.et_Number);
        etToy = findViewById(R.id.et_Toy);
        etCar = findViewById(R.id.et_Car);
        etResturant = findViewById(R.id.et_Resturant);
        etAmountOfMoney = findViewById(R.id.et_AmountOfMoney);
        btnGenerate=findViewById(R.id.btn_generate);

        btnGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String story = "";
                story += "\nI went to the " + etNoun.getText() + " and I had a " + etAnimal.getText() + ".";
                story += "\n...";
                story += "\n...";
                story += "\n...";
                story += "\n...";
                story += "\n...";
                story += "\n...";
                story += "\n...";


            }
        });


    }
}