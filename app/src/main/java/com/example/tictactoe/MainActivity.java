package com.example.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button startButton;

    /**
     * @param savedInstanceState first Page in the app, leads to player names
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startButton = findViewById(R.id.startBtn);

        startButton.setOnClickListener(v -> {
            Intent intent = new Intent(this,FirstPlayerActivity.class);
            this.startActivity(intent);
        });
    }

}
