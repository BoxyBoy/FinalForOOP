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
        guessAmountView = findViewById(R.id.guessAmountView);
        terminalView = findViewById(R.id.terminalView);
        guessResultView = findViewById(R.id.guessResultView);
        guessInput = findViewById(R.id.guessInput);
        buttonCheck = findViewById(R.id.buttonCheck);

        // main textview is 20 characters wide and 18 strings tall
        //sets the textview at the start of the game
        terminalView.setText("[}',./!$#>//@^*@)(!&\n#..?#!&@(#@/;'[}" + bracketCommands.get(0) + "!@\n%&$#:!><./#}{" + wrongAnswers.get(0) + "-\n+#$!@%$#@" + wrongAnswers.get(1) + ")(!#\n!#&*@':|{]" + bracketCommands.get(1) + ",>\n/?'!^%==-#@" + bracketCommands.get(2) + "))(#$$\n@!-.<'" + wrongAnswers.get(2) + "!#@-]{|!\n" + correctAnswer + "$%#@!':.<+*&%$\n" + bracketCommands.get(3) + "!?$#%[}(" +bracketCommands.get(4) + "\n$#>,-=+!-+=" + wrongAnswers.get(3) + "(}]\n'$?;<!#%@%z^&*" + wrongAnswers.get(4) + "\n^&)($@!':}{#@" + bracketCommands.get(5) + ";\n===-#$(]!@" + resetTries + "?><\n:'$*&^@!" + wrongAnswers.get(5) + ",,.?//\n" + wrongAnswers.get(6) + "!@##$%--" + wrongAnswers.get(7) + "\n%%^$@*;:" + wrongAnswers.get(8) + "!^*^#@");
        // guess result view is 12 characters wide and 18 strings tall
        guessResultView.setText("");
    }
        //literally the entire game | Checks to see if the user's guess is correct or if it is one of the "bracket commands"
    public void onClickCheck(View v){
        String searchName = guessInput.getText().toString();
        //if the entered guess is wrong
        if(wrongAnswers.contains(searchName.toUpperCase())) {
            guessResultView.append("\n>" + searchName.toUpperCase() + "\n>ACCESS DENIED\n>LIKENESS = " + likeness.get(wrongAnswers.indexOf(searchName.toUpperCase())) + "/6" );
            guesses--;
            String guessAmount = guesses + " attempt(s) left:";
            //ticks down a guess when wrong
            for(int i = 0;i<guesses;i++){
                guessAmount += " []";
            }
            guessAmountView.setText(guessAmount);
            return;
        }
        //if the guess is correct
        else if(searchName.toUpperCase().equals(correctAnswer)){
            guessResultView.append("\n>" + searchName + "\n>ACCESS GRANTED!");
            buttonCheck.setEnabled(false);
            return;
        }
        //this removes a wrong answer when the correct "command" is entered. Does not use a guess.
        String searchBracket = guessInput.getText().toString();
        if(bracketCommands.contains(searchBracket)){
            guessResultView.append("\n>" + searchBracket + "\n>REMOVED DUD");
            for(int i = 0;i<wrongAnswers.size();i++){
                if(wrongAnswers.get(i).equals("......")){
                    continue;
                }
                wrongAnswers.set(i, "......");
                break;
            }
            terminalView.setText("[}',./!$#>//@^*@)(!&\n#..?#!&@(#@/;'[}" + bracketCommands.get(0) + "!@\n%&$#:!><./#}{" + wrongAnswers.get(0) + "-\n+#$!@%$#@" + wrongAnswers.get(1) + ")(!#\n!#&*@':|{]" + bracketCommands.get(1) + ",>\n/?'!^%==-#@" + bracketCommands.get(2) + "))(#$$\n@!-.<'" + wrongAnswers.get(2) + "!#@-]{|!\n" + correctAnswer + "$%#@!':.<+*&%$\n" + bracketCommands.get(3) + "!?$#%[}(" +bracketCommands.get(4) + "\n$#>,-=+!-+=" + wrongAnswers.get(3) + "(}]\n'$?;<!#%@%z^&*" + wrongAnswers.get(4) + "\n^&)($@!':}{#@" + bracketCommands.get(5) + ";\n===-#$(]!@" + resetTries + "?><\n:'$*&^@!" + wrongAnswers.get(5) + ",,.?//\n" + wrongAnswers.get(6) + "!@##$%--" + wrongAnswers.get(7) + "\n%%^$@*;:" + wrongAnswers.get(8) + "!^*^#@");
            return;
        }
        //this resets the amount of guesses back to 4 if the correct "command" is entered
        else if(searchBracket.equals(BracketCommands.resetTries)){
            guessResultView.append("\n>ATTEMPTS RESET");
            //reset tries on text view and in code
            guesses = 4;
            guessAmountView.setText(guesses + " attempt(s) left: [] [] [] []");
            return;
        }
        //this executes if the guess someone enters isnt one of the options
        guessResultView.append("\n>" + searchName + "\n>ERROR");
    }
}