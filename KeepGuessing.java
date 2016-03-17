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
public class KeepGuessing 
{
    public static void main(String[] args)
    {
        Random r = new Random();
        Scanner keyboard = new Scanner(System.in);
        
        int num = 1 + r.nextInt(10);
        
        System.out.println("I have chosen a number between from 1 to 10. Try to guess it.");
        int guess = keyboard.nextInt();
        System.out.println("Your guess: " + guess);
        
        while (guess != num)
        {
            System.out.println("That's incorrect. Guess again.");
            guess = keyboard.nextInt();
        }
        
        System.out.println("Wow! You nailed it!");
    }
    
}
