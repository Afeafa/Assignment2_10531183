/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment2_10531183;

import java.util.Random;

/**
 *
 * @author estherk
 */
public class DiceDouble 
{
    public static void main(String[] args)
    {
        Random r = new Random();
        int num1 = 1 + r.nextInt(6);
        int num2 = 1 + r.nextInt(6);
        
        while (num1 != num2)
        {
            System.out.println("Roll #1: " + num1);
            System.out.println("Roll #2: " + num2);
            int ans = num1 + num2;
            System.out.println("The total is " + ans);
        }
        
        System.out.println("Roll #1: " + num1);
        System.out.println("Roll #2: " + num2);
        int result = num1 + num2;
        System.out.println("The total is " + result);
        
        

    }
    
}
