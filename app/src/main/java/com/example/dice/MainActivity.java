package com.example.dice;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button btnRollDice;
    private TextView tvDiceResult;
    private TextView tvWinStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRollDice = findViewById(R.id.btn_roll_dice);
        tvDiceResult = findViewById(R.id.tv_dice_result);
        tvWinStatus = findViewById(R.id.tv_win_status);

        btnRollDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollDice();
            }
        });
    }

    private void rollDice() {
        Random random = new Random();
        // Generate random numbers between 1 and 6 for two dice
        int dice1 = random.nextInt(6) + 1;
        int dice2 = random.nextInt(6) + 1;
        // Calculate the sum of the two dice
        int total = dice1 + dice2;
        // Display the result
        tvDiceResult.setText("Dice 1: " + dice1 + "\nDice 2: " + dice2 + "\nTotal: " + total);

        // Check if both dice have the same value
        if (dice1 == dice2) {
            tvWinStatus.setText("You win!");
        } else {
            tvWinStatus.setText("Better luck next time!");
        }
    }
}
