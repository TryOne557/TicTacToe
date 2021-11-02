package com.example.tictactoe;

public class TurnManager {
    /**
     * true: Player 1's turn
     * false: Player 2's turn
     */
    private static boolean currentTurn;

    /**
     * @return returns the which player has to play
     */
    public static boolean getTurn() {
        return currentTurn;
    }

    /**
     * switches the player's turn
     */
    public static void nextTurn() {
        currentTurn = !currentTurn;
    }
}
