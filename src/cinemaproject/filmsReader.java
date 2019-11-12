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
public class filmsReader {
     public film[] loadFile(){
        
        // Array to be returned.
       
        film[] films = new film[6];
        
        try { 
            
            // Scanner to read the file.
            Scanner myScanner = new Scanner(new File("movies.txt"));
            // Counter to keep track of where on the array we are.
            int i = 0;
            
            while (myScanner.hasNext()) {
	
                // Reading the line in the file
                String movie = myScanner.nextLine();

                // Creating a new intance of the film Class using the
                // the data from the file.
                film current = new film(movie);
                
                // Saving the intance of film into the array
                films[i] = current;
                // moving forward on the array.
                i++;

            } //end of loop
    
        } catch (Exception e){
            System.out.println(e);
            System.exit(1); 
	}
	 
        // Returning the array.
        return films;
    }
}
