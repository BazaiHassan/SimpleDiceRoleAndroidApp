package com.masterdev.diceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button myBtn;
    private Random myRandomNumber = new Random();
    private ImageView dice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();
        listener();

    }

    private void listener() {
        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number = myRandomNumber.nextInt(6)+1;
                diceRoll(number);
            }
        });
    }

    private void diceRoll(int number) {
        switch (number){
            case 1:
                dice.setImageResource(R.drawable.tas01);
                break;
            case 2:
                dice.setImageResource(R.drawable.tas02);
                break;
            case 3:
                dice.setImageResource(R.drawable.tas03);
                break;
            case 4:
                dice.setImageResource(R.drawable.tas04);
                break;
            case 5:
                dice.setImageResource(R.drawable.tas05);
                break;
            case 6:
                dice.setImageResource(R.drawable.tas06);
                break;



        }
    }

    private void findViews() {
        myBtn = findViewById(R.id.btn_dice);
        dice = findViewById(R.id.img_dice);
    }
}