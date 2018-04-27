/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


public class Rent {
  
    int idMovies; 
    int idCustomer;
    String RD;
    String Reservation;
    
    public Rent() {
      
    }
    public Rent(int idMovies, int idCustomer, String RD, String Reservation) {
        this.idMovies = idMovies;
        this.idCustomer = idCustomer;
        this.RD = RD;
        this.Reservation = Reservation;
    }

    public String getReservation() {
        return Reservation;
    }

    public void setReservation(String Reservation) {
        this.Reservation = Reservation;
    }

    
    public String getRD(){
        return RD;
    }
    public void setRd(String RD){
        this.RD = RD;
    }
    public int getIdMovies() {
        return idMovies;
    }

    public void setIdMovies(int idMovies) {
        this.idMovies = idMovies;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }
    
    
}
