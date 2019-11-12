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
public class priceReader {
    int line=0;
    // the method loadfile will return a int
    public int loadFile(){
        
        //try if find the document price
        try { 
            
            // Scanner to read the file.
            Scanner myScanner = new Scanner(new File("price.txt"));
            // Counter to keep track of where on the array we are.
            int i = 0;
   
                // Reading two consecutive lines
                 line = myScanner.nextInt();


            } //end of loop
        //in case that it does not find the file, send a error
         catch (Exception e){
            System.out.println(e);
            System.exit(1); 
	}
	 
        // Returning the array.
        return line;
    }
}

