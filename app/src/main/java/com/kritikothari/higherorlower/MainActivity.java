package com.kritikothari.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
          int randomNumber;
    public void guessNumber(View view){
        EditText guessEditText = (EditText) findViewById(R.id.guessEditText);
        int guessedNumber = Integer.parseInt(guessEditText.getText().toString());
        String str;
        if(guessedNumber < randomNumber)
            str="Higher!";
        else if(guessedNumber > randomNumber)
            str="Lower!";
        else {str="You guessed it right. Now try again!";
            Random rand = new Random();
            randomNumber = rand.nextInt(20) + 1;}
        Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand = new Random();
        randomNumber = rand.nextInt(20) + 1;
    }
}
