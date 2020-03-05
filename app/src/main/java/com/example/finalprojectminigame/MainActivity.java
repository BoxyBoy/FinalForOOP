package com.example.finalprojectminigame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.finalprojectminigame.BracketCommands.resetTries;
import static com.example.finalprojectminigame.Vocab.correctAnswer;
import static com.example.finalprojectminigame.Vocab.likeness;
import static com.example.finalprojectminigame.Vocab.wrongAnswers;
import static com.example.finalprojectminigame.BracketCommands.bracketCommands;

public class MainActivity extends AppCompatActivity {

    int guesses = 4;

    public TextView guessAmountView, terminalView, guessResultView, guessInput;

    public Button buttonCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new BracketCommands().removeDudCommands();
        new Vocab().incorrectAnswers();
        new Vocab().theLikenessValues();
        Prompt p = new Prompt();
        guessAmountView = findViewById(R.id.guessAmountView);
        terminalView = findViewById(R.id.terminalView);
        guessResultView = findViewById(R.id.guessResultView);
        guessInput = findViewById(R.id.guessInput);
        buttonCheck = findViewById(R.id.buttonCheck);

        // main textview is 20 characters wide and 18 strings tall
        //sets the textview at the start of the game
        terminalView.setText(p.thePrompt);
        // guess result view is 12 characters wide and 18 strings tall
        guessResultView.setText("");
    }
        //literally the entire game | Checks to see if the user's guess is correct or if it is one of the "bracket commands"
    public void onClickCheck(View v){
        new Controller().buttonCode();
    }
}