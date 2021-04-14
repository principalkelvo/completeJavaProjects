/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringcheckwithswitch;
import java.util.Scanner;

/**
 *
 * @author KELVO FRAYAY
 */
public class StringCheckWithSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String symbol;
        //get symbol from user
        System.out.println("Enter the symbol(squre/circle/triangle)");
        symbol = keyboard.next();
        //use string object in switch
        switch(symbol){
            case "square" : System.out.println("ATTACK");
                            break;
            case"circle": System.out.println("BLOCK");
                           break;
            case"triangle":System.out.println("JUMP");
            default:System.out.println("INVALID CHOICE");
            
        }

    }
}
