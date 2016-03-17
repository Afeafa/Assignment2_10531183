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
public class OneShotHiLo 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        
        int num = 1 + r.nextInt(100);
        
        System.out.println("I'm thinking of a number from 1 to 100. Try to guess it.");
        int guess = keyboard.nextInt();
        
        if (guess == num)
        {
            System.out.println("That's right! You guessed it!");
        }
        else if (guess < num)
        {
            System.out.println("Sorry, you're too low. I was thinking " + num);
        }
        else if (guess > num)
        {
            System.out.println("Sorry, you're too high. I was thinking " + num);
        }
        
    }
    
}
