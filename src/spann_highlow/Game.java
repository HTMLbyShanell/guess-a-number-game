/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spann_highlow;

/**
 *
 * @author Shanell A. Spann
 */
import java.util.Random;
import java.util.Scanner;
public class Game 
{
    int guess;
    int count;
    char runAgain;
    Admin a = new Admin();
    Scanner keyboard = new Scanner(System.in);
    
    public void reset()
    {
        boolean run = true;
        int guess = -9;
        int count = 0;
        char runAgain;
    }
    
    public void play()
    {
        while(guess != -999)  
        {
            Ask();
        }
    }
    
    public void Ask()
    {
        boolean run = true;
        int randomNumber = 26;
        
        System.out.println("Enter a number or -999 to quit.");
        guess = keyboard.nextInt();
        

            if (guess == -999)
            {
                run = false;
            } 
            else if (guess > randomNumber)
            {
                    System.out.println("\n You guessed too high");
            }
            else if (guess < randomNumber)
            {
                    System.out.println("\n You guessed too low");
            }
            else 
            {
                System.out.println("Congrats! You guessed correctly");
                guess = -999;
            }
            
}       
    public void getRandomNumber()
    {
         // get a random number between 1 and 100
          int max = 100;
          int min = 1;
          int randomNumber;
          Random c = new Random();
          randomNumber = c.nextInt(max - min) + min;
          System.out.println("Your random number between " + min + " and " + max + ": " + randomNumber);
 
    }
    
    public void runAgain()
    {
       System.out.println("Would you like to play again? Y or N");
        runAgain = keyboard.next().toUpperCase().charAt(0);
    }
    
}
