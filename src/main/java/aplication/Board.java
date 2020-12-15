package aplication;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Board {

    private String wordToGuess;

    public void printEmptyBoard(String wordToGuess) {
        char[] clue = new char[wordToGuess.length()];

        for (int i = 0; i < clue.length; i++) {
            clue[i] = wordToGuess.charAt(i);
        }

        char letter = '_';
        char space = ' ';

        for (int i = 0; i < clue.length; i++) {
            if(clue[i] == ' '){
                clue[i] = space;
            }else{
                clue[i] = letter;
            }
        }

        System.out.println(clue);
    }
}
