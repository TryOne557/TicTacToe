package com.example.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SecondPlayerActivity extends AppCompatActivity {

    private EditText playerName;
    private Button startBtn;
    private Button backBtn;


    /**
     * @param savedInstanceState set's a second player
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_player);

        playerName = findViewById(R.id.playerName);
        startBtn = findViewById(R.id.startBtn);
        backBtn = findViewById(R.id.backBtn);

        startBtn.setOnClickListener(v -> {
            //String player2Name = playerName.getText().toString();
            //String player1Name = getIntent().getStringExtra("player1");
            Intent intent = new Intent(this, GameActivity.class);
            //intent.putExtra("player1",player1Name);
            //intent.putExtra("player2",player2Name);
            startActivity(intent);
        });

        backBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, FirstPlayerActivity.class);
            startActivity(intent);
        });
    }
}
