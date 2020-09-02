package com.example.dicee;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button rollButton;
        rollButton=(Button)findViewById(R.id.rollbutton);
        final ImageView leftdice=(ImageView)findViewById(R.id.dice_left);
        final ImageView rightdice=(ImageView)findViewById(R.id.dice_right);
        final int[] diceArray={
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6,
                };
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Dice","Button pressed");
                Random randomNumberGenerator=new Random();
                int number=randomNumberGenerator.nextInt(6);
                int num2=randomNumberGenerator.nextInt(6);
                Log.d("Dice","The random number is"+number);
                leftdice.setImageResource(diceArray[number]);
                rightdice.setImageResource(diceArray[num2]);

            }
        });

    }
}