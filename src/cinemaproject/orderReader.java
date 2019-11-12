/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemaproject;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author edy
 */
public class orderReader {
    //method loadfile in order to load the previous orders
     public order[] loadFile(){
         //it will take 5 orders
        order[] orders = new order[5];
        
        try { 
            
            // Scanner to read the file Register.txt
            Scanner myScanner = new Scanner(new File("Register.txt"));
            // Counter to keep track of where on the array we are.
            int i = 0;
            	
            // The loop will repeat as long as there are lines to read 
            // on the file.
            while (myScanner.hasNext()) {
	
                // Reading 3 consecutive lines movie, tickets and price
                String movie = myScanner.nextLine();
                String tickets = myScanner.nextLine();
                String price = myScanner.nextLine();
                
               
                // Creating a new intance of the order Class using the
                // the data from the file.
                order current = new order(movie,tickets,price);
                
                // Saving the intance of orders into the array
                orders[i] = current;
                // moving forward on the array.
                i++;

            } //end of loop
    
        } catch (Exception e){
            System.out.println(e);
            System.exit(1); 
	}
	 
        // Returning the array.
        return orders;
    }
}
