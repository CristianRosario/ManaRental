/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author crist
 */
public class ManyToMany {
    int idCus; 
    int idMovie; 
    String FirstName; 
    String LastNamr; 
    String Title;
    String RD; 

    public ManyToMany() {
    }

    public ManyToMany(int idCus, int idMovie, String FirstName, String LastNamr, String Title, String RD) {
        this.idCus = idCus;
        this.idMovie = idMovie;
        this.FirstName = FirstName;
        this.LastNamr = LastNamr;
        this.Title = Title;
        this.RD = RD;
    }

    public int getIdCus() {
        return idCus;
    }

    public void setIdCus(int idCus) {
        this.idCus = idCus;
    }

    public int getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(int idMovie) {
        this.idMovie = idMovie;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastNamr() {
        return LastNamr;
    }

    public void setLastNamr(String LastNamr) {
        this.LastNamr = LastNamr;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getRD() {
        return RD;
    }

    public void setRD(String RD) {
        this.RD = RD;
    }
    
    
}
