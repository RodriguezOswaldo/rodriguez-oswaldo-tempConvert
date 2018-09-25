/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celsiustofahrenheit;

/**
 *
 * @author Own
 */
import java.util.Scanner;

public class CelsiusToFahrenheit {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        double tempc, tempf;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter the temperature in Celsius");
        
        tempc = keyboard.nextDouble();
        
        tempf = (9.0/ 5.0)* tempc + 32.0;
        
        System.out.println("The temperature in fahrenheit is: " +tempf);
    }
    
}
