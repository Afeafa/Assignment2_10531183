/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment2_10531183;
import java.util.Scanner;

/**
 *
 * @author estherk
 */
public class CountingWithaWhileLoop 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Type in a message and I'll display it five times.");
        System.out.println("Message: ");
        String message = keyboard.nextLine();
        
        int n = 0;
        while (n < 5)
        {
            System.out.println( (n+1) + ". " + message );
            n++;
        }
        
    }
    
}
