package com.example.tictactoe;

public class GameHandler {
    private static boolean[][] clickedList = new boolean[2][9];

    /**
     * @param id says which player klicked on which field
     * @return
     */
    public static void clicked(int id) {
        int player = (TurnManager.getTurn()) ? 0 : 1;
        clickedList[player][id] = true;

    }
}
