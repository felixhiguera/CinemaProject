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
public class CinemaProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // the Welcome message
        Scanner s = new Scanner(System.in);
        //the information load in the memory
        filmsReader film = new filmsReader();
        orderReader order = new orderReader();
        priceReader price = new priceReader();
        System.out.println("Welcome to the CCT Cinema!!");
        System.out.println("the price for the ticket today is €"+ price.loadFile());
        System.out.println("Press ENTER to continue");
        
        s.nextLine();
        
        //load the menu
        menu mymenu =  new menu(film,order);
        //load the method myMenu
        mymenu.myMenu();
        
    }
    
}
