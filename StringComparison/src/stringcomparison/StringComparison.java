/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringcomparison;
import java.util.Scanner;
/**
 *
 * @author KELVO FRAYAY
 */
public class StringComparison {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard =new Scanner(System.in);
        String string1,string2;
        int comparison;
        //get two strings
        System.out.println("Enter a string: ");
        string1= keyboard.next();
        System.out.println("Enter another string: ");
        string2= keyboard.next();
        //compare the string
        comparison= string1.compareTo(string2);
        if (comparison<0){//compareTo returned a negative number
            System.out.println(string1+" comes before "
                    +string2+" in the alphabet");
            
        }
        else if(comparison>0){//compareTo returned a positive number
            System.out.println(string2+" comes before "
                    +string1+" in the alphabet");
        }
        else{//compareTo returned 0
            System.out.println("The strings are identical");
        }
    }
    
}
