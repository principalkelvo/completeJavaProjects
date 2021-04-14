import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KELVO FRAYAY
 */
public class SecretNumberBreakStatementLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        final int SECRET = 27; // secret number 
        int num; // to hold user's guess 
        boolean guessed = false; // so far number not guessed 
        System.out.println("You have 3 goes to guess the secret number");
        System.out.println("HINT: It is a number less than 50!");
        System.out.println();
        // look carefully at this loop 
        for (int i= 1; i <= 3; i++) // loop repeats 3 times  
        { 
            System.out.print("Enter guess: ");
         
        num = keyboard.nextInt(); // check guess 
        if (num == SECRET) // check if number guessed correctly   
        { guessed = true; // record number has been guessed correctly 
        break; // exit loop   
        }   
    } // now check to see if the number was guessed correctly or not 
    if (guessed) { 
    System.out.println("Number guessed correctly");  
    }
    else  
        { System.out.println("Number NOT guessed");  
        }
    }

}

        // TODO code application logic here