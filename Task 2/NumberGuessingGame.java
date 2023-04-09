import java.util.Random;
import javax.swing.JOptionPane;

public class NumberGuessingGame {

    public static void main(String[] args) {
        int minNumber = 1;
        int maxNumber = 100;
        int numberOfAttempts = 10;
        int score = 0;

        Random random = new Random();
        int guessedNumber = random.nextInt(maxNumber - minNumber + 1) + minNumber;

        while (numberOfAttempts > 0) {
            String input = JOptionPane.showInputDialog("Guess the number between " + minNumber + " and " + maxNumber);
            int enteredNumber = Integer.parseInt(input);

            if (enteredNumber == guessedNumber) {
                score += numberOfAttempts;
                JOptionPane.showMessageDialog(null, "Congratulations! You guessed the number in " + numberOfAttempts + " attempts. Your score is " + score);
                break;
            } else if (enteredNumber < guessedNumber) {
                JOptionPane.showMessageDialog(null, "The number is higher than " + enteredNumber);
            } else {
                JOptionPane.showMessageDialog(null, "The number is lower than " + enteredNumber);
            }

            numberOfAttempts--;
        }

        if (numberOfAttempts == 0) {
            JOptionPane.showMessageDialog(null, "Sorry, you have exceeded the maximum number of attempts. The correct number was " + guessedNumber);
        }
    }
}
