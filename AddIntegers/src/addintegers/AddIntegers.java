/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addintegers;

/**
 *
 * @author Own
 */
// import makes the Scanner class available to us to use

import java.util.Scanner; 

//This was added with the name of the file        
public class AddIntegers {

    /**
     * @param args the command line arguments
     */
    
    //This was added too with the name of file
    public static void main(String[] args) {
        // TODO code application logic here
        //here we create the variable int.
        int n1, n2, sum;
        /*keyboard creates and instance of the Scanner class, 
        *and connects it to System.in, which represents 
        *the keyboard on your computer */
        
        Scanner keyboard = new Scanner(System.in);
        //this prompt asking the user for info
        System.out.println("Enter your first integer value: ");
        //get the user's input      
        n1 = keyboard.nextInt();
        4545
        //Prompt asking for the second integer
        System.out.println("Enter ypur second integer value");
        //recording the value here
        n2 = keyboard.nextInt();
        
        sum = n1 + n2;
        
        System.out.println("The sum of your two number is : " +sum);
    }
    
}
