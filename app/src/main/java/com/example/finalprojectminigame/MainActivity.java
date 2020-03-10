package com.example.finalprojectminigame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//import static com.example.finalprojectminigame.VocabMedium.incorrectAnswers;

public class MainActivity extends AppCompatActivity {
    String difficulty;
    public Button buttonCheck;
    public TextView guessAmountView, terminalView, guessResultView, guessInput;
    VocabEasy easyGame = new VocabEasy(); //LOGAN PLEASE USE THESE AND NOT STATIC CALLS!!!! -BRAXTON
    VocabMedium mediumGame = new VocabMedium(); //LOGAN PLEASE USE THESE AND NOT STATIC CALLS!!!! -BRAXTON
    VocabHard hardGame = new VocabHard(); //LOGAN PLEASE USE THESE AND NOT STATIC CALLS!!!! -BRAXTON
    BracketCommands bracketCommands = new BracketCommands();
    Controller controller;
    int guesses = 4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        difficulty = intent.getStringExtra("difficulty");
        bracketCommands.removeDudCommands();
        easyGame.incorrectAnswers();
        easyGame.theLikenessValues();
        mediumGame.incorrectAnswers();
        mediumGame.theLikenessValues(); //LIKE THIS
        hardGame.incorrectAnswers();
        hardGame.theLikenessValues();

        Prompt p = new Prompt();
        p.stringCall(difficulty);
        guessAmountView = findViewById(R.id.guessAmountView);
        terminalView = findViewById(R.id.terminalView);
        guessResultView = findViewById(R.id.guessResultView);
        guessInput = findViewById(R.id.guessInput);
        buttonCheck = findViewById(R.id.buttonCheck);
        controller = new Controller(guessInput, guessAmountView, terminalView, guessResultView, buttonCheck);

        // main textview is 20 characters wide and 18 strings tall
        //sets the textview at the start of the game
        terminalView.setText(p.thePrompt);
        // guess result view is 12 characters wide and 18 strings tall
        guessResultView.setText("");
    }

        //literally the entire game | Checks to see if the user's guess is correct or if it is one of the "bracket commands"
    public void onClickCheck(View v){
        controller.buttonCode();
    }
}