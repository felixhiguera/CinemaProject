/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemaproject;

import java.util.Scanner;

/**
 *
 * @author edy
 */
public class menu {
    //variables
    private filmsReader film;
    film[] movies;
    private orderReader order;
    order[] orders;
    
    //constructor
     public menu(filmsReader film,orderReader order){
        this.film = film;
        this.order = order;
    }
   //method myMenu
    public void myMenu(){
        //conditional in order to show the menu again
        int choiceentry = 0;
        while(choiceentry!=4){
            if(choiceentry!=0){
                System.out.println("Press enter to continue");
                Scanner s = new Scanner(System.in);
                s.nextLine();
            }
            System.out.println("Enter one of the following commands");
            System.out.println("Create a new order-- Press 1");
            System.out.println("list of Films-- Press 2");
            System.out.println("View previous orders-- Press 3");
            System.out.println("Quit the program-- Press 4");
        
            Scanner scanchoice = new Scanner(System.in);
            int choice = scanchoice.nextInt();
            //switch in order to choice the option
            switch (choice){
                case 1: 
                    //case for buying a ticket
                    //it is called the method ordening
                     buy myOrder = new buy();
                    myOrder.ordening();
                break;
                case 2:
                 //it prints the list of movies
                 movies = film.loadFile();
                 for (int i=0; i<movies.length; i++){
                 System.out.println( movies[i].getMovie());
                    }
                break;
                case 3:
                    //it prints the list of previous orders
                 orders = order.loadFile();
                 for (int i=0; i<orders.length; i++){
                 System.out.println( orders[i]);
                    }
                break;
                //it finishes the program
                case 4:
                    System.out.println("End of the program");
                    System.exit(0);
                // when is not valid any number prints this msg
                default:
               System.out.println(choiceentry+ " is not a valid Menu Option! Please Select Another.");
            }
        }
        
    }
    
    
}
