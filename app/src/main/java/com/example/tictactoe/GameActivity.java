package com.example.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.EventListener;

public class GameActivity extends AppCompatActivity {
    private TextView turn;
    private ImageButton[] btnList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        btnList = new ImageButton[]
                {
                        findViewById(R.id.topLeft),
                        findViewById(R.id.topMiddle),
                        findViewById(R.id.topRight),
                        findViewById(R.id.middleLeft),
                        findViewById(R.id.middleMiddle),
                        findViewById(R.id.middleRight),
                        findViewById(R.id.downLeft),
                        findViewById(R.id.downMiddle),
                        findViewById(R.id.downRight),
                };
        turn = findViewById(R.id.turn);

        btnList[0].setOnClickListener(listener -> {
            if(TurnManager.getTurn()) btnList[0].setImageDrawable(getDrawable(R.drawable.cross));
            else btnList[0].setImageDrawable(getDrawable(R.drawable.circle));
            btnList[0].setEnabled(false);
            GameHandler.clicked(0);
            TurnManager.nextTurn();
            updateTurn();
        });

        btnList[1].setOnClickListener(listener -> {
            if(TurnManager.getTurn()) btnList[1].setImageDrawable(getDrawable(R.drawable.cross));
            else btnList[1].setImageDrawable(getDrawable(R.drawable.circle));
            btnList[1].setEnabled(false);
            GameHandler.clicked(1);
            TurnManager.nextTurn();
            updateTurn();
        });

        btnList[2].setOnClickListener(listener -> {
            if(TurnManager.getTurn()) btnList[2].setImageDrawable(getDrawable(R.drawable.cross));
            else btnList[2].setImageDrawable(getDrawable(R.drawable.circle));
            btnList[2].setEnabled(false);
            GameHandler.clicked(2);
            TurnManager.nextTurn();
            updateTurn();
        });

        btnList[3].setOnClickListener(listener -> {
            if(TurnManager.getTurn()) btnList[3].setImageDrawable(getDrawable(R.drawable.cross));
            else btnList[3].setImageDrawable(getDrawable(R.drawable.circle));
            btnList[3].setEnabled(false);
            GameHandler.clicked(3);
            TurnManager.nextTurn();
            updateTurn();
        });

        btnList[4].setOnClickListener(listener -> {
            if(TurnManager.getTurn()) btnList[4].setImageDrawable(getDrawable(R.drawable.cross));
            else btnList[4].setImageDrawable(getDrawable(R.drawable.circle));
            btnList[4].setEnabled(false);
            GameHandler.clicked(4);
            TurnManager.nextTurn();
            updateTurn();
        });

        btnList[5].setOnClickListener(listener -> {
            if(TurnManager.getTurn()) btnList[5].setImageDrawable(getDrawable(R.drawable.cross));
            else btnList[5].setImageDrawable(getDrawable(R.drawable.circle));
            btnList[5].setEnabled(false);
            GameHandler.clicked(5);
            TurnManager.nextTurn();
            updateTurn();
        });

        btnList[6].setOnClickListener(listener -> {
            if(TurnManager.getTurn()) btnList[6].setImageDrawable(getDrawable(R.drawable.cross));
            else btnList[6].setImageDrawable(getDrawable(R.drawable.circle));
            btnList[6].setEnabled(false);
            GameHandler.clicked(6);
            TurnManager.nextTurn();
            updateTurn();
        });

        btnList[7].setOnClickListener(listener -> {
            if(TurnManager.getTurn()) btnList[7].setImageDrawable(getDrawable(R.drawable.cross));
            else btnList[7].setImageDrawable(getDrawable(R.drawable.circle));
            btnList[7].setEnabled(false);
            GameHandler.clicked(7);
            TurnManager.nextTurn();
            updateTurn();
        });

        btnList[8].setOnClickListener(listener -> {
            if(TurnManager.getTurn()) btnList[8].setImageDrawable(getDrawable(R.drawable.cross));
            else btnList[8].setImageDrawable(getDrawable(R.drawable.circle));
            btnList[8].setEnabled(false);
            GameHandler.clicked(8);
            TurnManager.nextTurn();
            updateTurn();
        });
        
    }

    /**
     * changes the player's Turn after one move
     */
    private void updateTurn() {
        String playerTurn = (TurnManager.getTurn()) ? "Player 1" : "Player 2";
        turn.setText("Turn: " + playerTurn);
    }
}
