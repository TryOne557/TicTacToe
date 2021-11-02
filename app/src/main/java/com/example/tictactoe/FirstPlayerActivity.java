package com.example.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class FirstPlayerActivity extends AppCompatActivity {

    private EditText playerName;
    private Button nextBtn;
    private Button backBtn;

    /**
     * @param savedInstanceState creates first player
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_player);

        playerName = findViewById(R.id.playerName);
        nextBtn = findViewById(R.id.nextBtn);
        backBtn = findViewById(R.id.backBtn);

        nextBtn.setOnClickListener(v -> {
            String player1Name = playerName.getText().toString();
            Intent intent = new Intent(this, SecondPlayerActivity.class);
            intent.putExtra("player1",player1Name);
            startActivity(intent);
        });

        backBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });
    }
}
