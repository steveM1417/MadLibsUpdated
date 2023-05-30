package com.example.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.CharacterPickerDialog;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText etBaseballTeam;
    private EditText etTrueOrFalse;
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

        etBaseballTeam = findViewById(R.id.et_BaseballTeam);
        etTrueOrFalse = findViewById(R.id.et_TrueOrFalse);
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
                story += "\nAre you scared of the dark? " + etTrueOrFalse.getText();
                story += "\nIt is " + etTrueOrFalse.getText() + " that you believe in ghost? ";
                story += "\nIt was a " + etAdjective.getText() + " type of night with you and some friends. ";
                story += "\nIn the distance you hear a " + etAnimal.getText() + ". Its crying out to the sky. ";
                story += "\nYou begin to " + etAdverb.getText() + " look for it. ";
                story += "\nThe screams are coming from a " + etColor.getText() + " house. ";
                story += "\nYou feel attracted to this house and take a look inside. ";
                story += "\nAs soon as you walk in you see " + etNumber.getText() + " of broken " + etToy.getText() + ".";
                story += "\nOh nah this place gives me the creeps yells out one of your friends. ";
                story += "\nYou walk back out and pick up a " +  etBaseballTeam.getText() + " next to the " + etNoun.getText() + ".";
                story += "\nYou go to the street and see a " + etColor.getText() + etCar.getText() +" parked. ";
                story += "\nYou check if its open and see the keys already in the ignition. ";
                story += "\nYour friends are hungry from adventuring so you stop at " + etResturant.getText() + ".";
                story += "\n...";
                story += "\n...";
                story += "\n...";


            }
        });


    }
}