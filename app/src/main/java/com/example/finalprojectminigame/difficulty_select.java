package com.example.finalprojectminigame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class difficulty_select extends AppCompatActivity {

    String difficulty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_difficulty_select);
    }

    public void onClickEasy(View v){
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        difficulty = "easy";
        intent.putExtra("difficulty", difficulty);
        startActivity(intent);
    }

    public void onClickMedium(View v){
        difficulty = "medium";
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        intent.putExtra("difficulty", difficulty);
        startActivity(intent);

    }

    public void onClickHard(View v){
        difficulty = "hard";
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        intent.putExtra("difficulty", difficulty);
        startActivity(intent);

    }
}
