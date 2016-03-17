/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment2_10531183;

/**
 *
 * @author estherk
 */
import java.util.Random;
import java.util.Scanner;

public class ANumberGuessingGame 
{
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        
        int numbToGuess = r.nextInt(10);
        
        System.out.println("I'm thinking of a number from 1 to 10, guess.");
        System.out.println("Your guess: ");
        int guess = keyboard.nextInt();
        
        if (guess == numbToGuess)
        {
            System.out.println("That's right! My secret number was " + numbToGuess );
        }
        else 
        {
            System.out.println("Sorry, but i was actually thinking of " + numbToGuess );
        }
    }
    
}
