/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package someusefularraytemperaturetrial;
import java.util.Scanner;
/**
 *
 * @author KELVO FRAYAY
 */
public class SomeUsefulArrayTemperatureTrial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char choice;
        Scanner keyboard=new Scanner(System.in);
        double[]temperature;
        System.out.print("***WEEKLY TEMPERATURE***");
        temperature= new double[7];
        
        //menu
        do{
            System.out.println();
            System.out.println("[1] Enter temperatures for the week");
            System.out.println("[2] Show maximum and minimum "
                    + "temperature for the week");
            System.out.println("[3] calculate average temperature "
                    + "for the week");
            System.out.println("[4] Check temperature ");
            System.out.println("[5] Search for temperature");
            System.out.println("[6] Display temperatures");
            System.out.println("[7] Exit");
            System.out.println("Enter choice [1-7]: ");
            choice= keyboard.next().charAt(0);
            System.out.println();
            
            //process choice by calling additional methods
            switch(choice){
                case '1': fillTemperature(temperature);
                         break;
                case '2': double max = max(temperature);
                         System.out.println("Highest temperature "
                                 + "for week 1 = "+ max);
                         double min = min(temperature);
                         System.out.println("Lowest temperature "
                                 + "for week 1 = "+ min);
                         break;
                case '3': double total= sum(temperature);
                         double average= total/7;
                         System.out.println("sum of this week "
                                 + "temperature= "+total); 
                         System.out.println("average of this week "
                                 + "temperature= "+average);
                         break;
                case '4': System.out.println("Enter temperature to find");
                         double value= keyboard.nextDouble();
                         boolean found= contains(temperature,value);
                         if (found){
                             System.out.println(value+
                                     " is in this weeks temperature");
                         }
                         else{
                             System.out.println(value+
                                     " is not in this weeks temperature");
                         }
                         break;
                case '5': System.out.print("Enter temperature to find: ");
                         double item= keyboard.nextDouble();
                         double index = search(temperature,item);
                         if (index==-999){
                             System.out.println("This temperature is not "
                                     + "in this weeks temperature");
                         }
                         else{
                             System.out.println("This temperature is "
                                     + "in this weeks temperature day"+index);
                         }
                         break;
                case '6': System.out.println("***THIS WEEKS TEMPERATURE***");
                         displayTemperature(temperature);
                         break;
            }
        }while(choice!='7');
        System.out.println("Goodbye");
    }
    
    //additional methods
    
    //fills temperature with values
    static void fillTemperature(double [] temperatureIn){
        Scanner keyboard = new Scanner (System.in);
        for (int i=0;i<temperatureIn.length;i++){
            System.out.println("enter temperature "+"day "+(i+1));
            temperatureIn[i]=keyboard.nextDouble();
        }
    }
    static double max(double [] temperatureIn){
        double result= temperatureIn[0];
        for(int i=1;i<temperatureIn.length;i++){
            if(temperatureIn[i]>result){
                result= temperatureIn[i];//reset result to new maximum
            }
        }
        return result;
    }
    static double min(double [] temperatureIn){
        double result= temperatureIn[0];
        for(int i=1;i<temperatureIn.length;i++){
            if(temperatureIn[i]<result){
                result= temperatureIn[i];//reset result to new maximum
            }
        }
        return result;
    }
    
    static double sum(double [] temperatureIn){
        double total= 0;
        for(double currentElement:temperatureIn){
            total= total + currentElement;
        }
        return total;
    }
    
    //checks if a given item is contained within the array
    static boolean contains(double [] temperatureIn, double valueIn){
        //enhanced 'for' loop used here
        for(double currentElement:temperatureIn){
            if(currentElement==valueIn){
                return true;//exit loop early if temperature value found
            }
        }
        return false; //temperature not pesent
    }
    
    //returns the position of an item within the temperature
    static double search(double [] temperatureIn, double itemIn){
        for(int i=0;i<temperatureIn.length;i++){
            if(temperatureIn[i]==itemIn){
                return i+1;
            }
        }
        return -999;
    }
    
    //displays the array values on the screen
    static void displayTemperature(double [] temperatureIn){
        System.out.println();
        //standard 'for' loop used here as the array index is required
        for (int i=0;i<temperatureIn.length;i++){
            System.out.println("temperature day ["+(i+1)+"]= "+ temperatureIn[i]);
        }
    }
}
