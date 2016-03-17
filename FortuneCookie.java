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
public class FortuneCookie
{
    public static void main(String[] args)
    {
        Random r = new Random();
        Scanner keyboard = new Scanner(System.in);
        
        int numbToGuess = r.nextInt(10);
        
        if (numbToGuess <= 5)
        {
            System.out.println("The number is " + numbToGuess );
            System.out.println("Fortune cookie says: You will find happiness with your new love.");
        }
        else
        {
            System.out.println("The number is " + numbToGuess);
            System.out.println("Fortune cookie says: Stick with your partner.");
        }
        
    }
    
}
