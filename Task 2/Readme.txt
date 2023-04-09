In this program, we have used the Random class to generate a random number between a given range (minNumber and maxNumber).
We have also set the number of attempts to 10 and the initial score to 0.

The program uses a while loop to keep the game going until the user has guessed the correct number or has exceeded the maximum number of attempts.
In each iteration of the loop, the user is prompted to enter their guess using a JOptionPane.showInputDialog method, and the entered number is converted to an integer
using the Integer.parseInt method.

If the user has guessed the correct number, their score is calculated based on the number of attempts they had left, and a congratulatory message is displayed with their
final score. If the user has not guessed the correct number, the program gives them a hint whether the number they entered is higher or lower than the generated number.

If the user has exceeded the maximum number of attempts without guessing the correct number, the program displays a message indicating that the game is over and shows
the correct number that the user could not guess.

You can modify the program to add more rounds by putting the game in a loop and resetting the guessedNumber variable and numberOfAttempts variable after each round.
You can also display the score after each round and give points based on the number of attempts.
