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
public class ThreeCadMonte 
{
    public static void main(String[] args)
    {
        Random r = new Random();
        Scanner keyboard = new Scanner(System.in);
        
        int num = 1 + r.nextInt(3);
        
        System.out.println("Which one is the ace?");
        System.out.println(" ##  ##  ## ");
        System.out.println(" ##  ##  ## ");
        System.out.println(" 1   2   3 ");
        int guess = keyboard.nextInt();
        
        if (guess == num)
        {
         System.out.println("Wow, you nailed it! The ace was 1. ");
         System.out.println(" AA  ##  ## ");
         System.out.println(" AA  ##  ## ");
         System.out.println(" 1   2   3 ");
        }
        else if (guess == num)
        {
          System.out.println("Wow, you nailed it! The ace was 2.");

          System.out.println(" ##  AA  ## ");
          System.out.println(" ##  AA  ## ");
          System.out.println(" 1   2   3 ");
        }
        else if (guess == num)
        {
         System.out.println("Wow, you nailed it! The ace was 3.");

         System.out.println(" ##  ##  AA ");
         System.out.println(" ##  ##  AA ");
         System.out.println(" 1   2   3 ");
        }
        else 
        {
            System.out.println("Sorry, try again. The ace was " + num);
                    
                   
        }

   
    
        
        
        
    }
    
}
