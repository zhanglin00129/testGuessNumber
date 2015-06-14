package GuessNum;

public class Game {
    private Guess guess;
    private GenerateNum expectedNum;
    private String guessNum;

    public Game(Guess guess, GenerateNum expectedNum, String guessNum) {
        this.guess = guess;
        this.expectedNum = expectedNum;
        this.guessNum = guessNum;
    }

    public String result(){
        return guess.compare(expectedNum.generate(),guessNum);
    }
}