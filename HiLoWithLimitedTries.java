/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment2_10531183;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author estherk
 */
public class HiLoWithLimitedTries 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        int num = 1 + r.nextInt(100);
        int tries = 0;
        int guessn = 0;
        
        System.out.println("I'm thinking of a number between 1-100. You have 7 guesses.");
        int guess = keyboard.nextInt();
        System.out.println("Guess # " + (guessn + 1) + guess);
        tries++;
        
        while (guess < num && tries < 7)
        {
            System.out.println("Sorry, you're too low. Try again.");
            guess = keyboard.nextInt();
            System.out.println("Guess # " + (guessn + 1) + guess);
            tries++;
            
            
        }
        while (guess > num && tries < 7)
        {
            System.out.println("Sorry, you're too high. Try again.");
            guess = keyboard.nextInt();
            System.out.println("Guess # " + (guessn + 1) + guess);
            tries++;
        }
        System.out.println("Wow! You're right!");
        System.out.println("Number of tries is " + tries); 
       
        
    }
    
}
