/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment2_10531183;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author estherk
 */
public class NunberGuessingWithaCounter 
{
    public static void main(String[] args)
    {
        Random r = new Random();
        Scanner keyboard = new Scanner(System.in);
        
        int num = 1 + r.nextInt(10);
        int tries = 0;
        
        System.out.println("I have chosen a number from 1 to 10. Try to guess it.");
        int guess = keyboard.nextInt();
        System.out.println("Your guess: " + guess);
        tries++;
        
        while (guess != num)
        {
            System.out.println("That is incorrect. Try again.");
            guess = keyboard.nextInt();
            System.out.println("Your guess: " + guess);
            tries++;
        }
        
        if (guess == num) 
        {
            System.out.println("Correct! You guessed it!");
            System.out.println("Number of tries is " + tries );
        }
        
    }
    
}
