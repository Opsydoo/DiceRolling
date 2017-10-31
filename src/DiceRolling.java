/**The application simulates the rolling of two dice. It uses the Random class
 * twice, the sum of each die roll is computed, as each die can show an integer between
 * 1 to 6, so the sum will vary from 2 to 12, with 7 being the most frequent sum, and 2 and
 * 12 the least frequent
 */

import java.util.Random;

public class DiceRolling {
    //Initialisation of class instance variables

    private static int firstDice =0;
    private static int secondDice = 0;

    /*Instances of the Random class, which will be used to generate random/pseudo-random numbers
      to represent the sides of a dice.
    */
    private static final Random randomNumber1 = new Random();
    private static final Random randomNumber2 = new Random();

    /*Frequency array, which will hold the frequency with which
      the sum (simulating a dice roll) is held
    */
    private static int[] frequency = new int[13];


    //Function that actually performs the dice roll
    public static int addition () {
        firstDice = 1 + randomNumber1.nextInt(6);
        secondDice = 1 + randomNumber2.nextInt(6);

        int sum = firstDice + secondDice;
        return sum;

    }

    public static void main (String[] args) {

        for(int counter=0; counter < 36000000; counter++){
            ++frequency[addition()];
        }

        for (int i=1; i < frequency.length; i++) {
            System.out.printf("%2d: %3d%n", i, frequency[i]);
        }

    }

}
