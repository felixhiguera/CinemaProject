/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemaproject;

/**
 *
 * @author edy
 */
public class order {
    //variables
    String movie;
    String tickets;
    String price;
    //constructor
    public order(String movie, String tickets, String price){
        this.movie = movie;
        this.tickets=tickets;
        this.price=price;
    }
    //getters and setters
    public String getMovie() {
        return movie;
    }

    public String getTickets() {
        return tickets;
    }

    public String getPrice() {
        return price;
    }
    //tostring
    public String toString(){
        
        return movie +" " + tickets + " " + price;
    }
}
