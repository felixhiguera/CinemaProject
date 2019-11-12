/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemaproject;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author edy
 */
public class buy {
    //method ordening
    public void ordening(){
    //filmss save the info from filmsReader    
    film[] filmss;
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Which movie do you want to watch?");
    //it creates a object in order to load the movies
    filmsReader read = new filmsReader();
    read.loadFile();
    filmss = read.loadFile();
    //filmss runs in the cycle for in order to show the movies     
    for (int i=0; i<filmss.length; i++){
    System.out.println(i +" " + filmss[i].getMovie());
        }
    int filmName = myObj.nextInt();// Read user input
   //System.out.println("you choosed "+ filmss[filmName].getMovie());
  
    // Create a Scanner object to ask the number of tickets
    System.out.println("The number of tickets");
    int tickets = myObj.nextInt();
    double totalPrice=0;
   // cycle for in order to ask the age
    for (int i=0; i<tickets; i++){
      int age = 0;
      double disc=0;
      double total=0;
    //Scanner in order to receive the age of each ticket
      Scanner sc = new Scanner(System.in);
      System.out.println("what is the age of the ticket No." + (i+1));
      age = sc.nextInt();
      //load the price
      priceReader prices = new priceReader();
      int price = prices.loadFile();
      //conditional and calculate when the age is between 0 and 12
      if (age>0 && age<=12){
          disc =price*.40;
          total = price - disc;
        }
      //conditional and calculate when the age is between 13 and 64
        else if(age>13 &&age<64){
            total =price;
        }
        //conditional and calculate when the age is more than 64
        else {
            disc = price *.20;
            total = price-disc;
    }
      //total price
         totalPrice= totalPrice + total;
    
    }
    //printwriter and filewriter to upload the data in a file
       PrintWriter writer; 
       FileWriter fw;
        
        
        try {
            
            // create a file called register 
            fw = new FileWriter("Register.txt", true);
            writer = new PrintWriter(fw);
            
            
            // load the data into the file
            writer.println(filmss[filmName]+ ", ");
            writer.println(tickets + " tickets, ");
             writer.println("total price €" + totalPrice);
            // Closing the writer to save the file.
            writer.close();     
            
        } catch (Exception ex) {
           System.out.println(ex);
        }
}
}
