package aplication;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Clue clue = new Clue();
        clue.addClueToList("Test word");
        final List<String> clueList = clue.getClueList();
        final String randomClue = clue.getRandomClue(clueList);


        Board board = new Board();
        board.printEmptyBoard(randomClue);


    }
}
