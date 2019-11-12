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
public class film {
      String movie ;
//constructor
    public film (){
        this.movie = null;
       
    }
//getter and setters
    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }
    //constructor 
    public film(String movie){
        
        this.movie = movie;
            
    }
    
    // Behabiour
    public String toString(){
        
        return "TITLE: " + movie ;
    }
}
