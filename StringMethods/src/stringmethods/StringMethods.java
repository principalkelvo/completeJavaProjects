/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringmethods;
import java.util.Scanner;
/**
 *
 * @author KELVO FRAYAY
 */
public class StringMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //create new string
        String str;
        //get the user to enter the string
        System.out.print("Enter a string without spaces: ");
        str= keyboard.next();
        //display the length of the user's string
        System.out.println("the length of the string is "+str.length());
        //display the third character of the user's string
        System.out.println("the character of position 3 is "+str.charAt(2));
        //display a selected part of the user's string
        System.out.println("characters 2 to 4 are "+str.substring(1,4));
        //display the users string joined with another string
        System.out.println(str.concat(" was the string entered"));
        //display the users string in uppercase
        System.out.println("This is upper case: "+str.toUpperCase());
        //display the users string in lower case
        System.out.println("This is lower case: "+str.toLowerCase());
    }
    
}
