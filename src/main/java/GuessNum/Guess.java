package GuessNum;

public class Guess {
    public String compare(String targetNum, String guessNum) {
        int aNum = 0;
        int bNum = 0;
        for (int i = 0; i < 4; i++) {
            if (targetNum.charAt(i) == guessNum.charAt(i)) {
                aNum++;
            } else if (guessNum.contains(targetNum.charAt(i) + "")) {
                bNum++;
            }
        }
        return String.format("%dA%dB",aNum,bNum);
    }
}
