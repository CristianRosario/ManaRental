/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


public class Movies {
   int ID;
   String Title; 
   String RD; 
   String Genre; 
   String RunTime; 
   String Rated; 

    public Movies(int ID, String Title, String RD, String Genre, String RunTime, String Rated) {
        this.ID = ID;
        this.Title = Title;
        this.RD = RD;
        this.Genre = Genre;
        this.RunTime = RunTime;
        this.Rated = Rated;
    }

    public Movies() {
       
    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String Genre) {
        this.Genre = Genre;
    }

    public String getRunTime() {
        return RunTime;
    }

    public void setRunTime(String RunTime) {
        this.RunTime = RunTime;
    }

    public String getRated() {
        return Rated;
    }

    public void setRated(String Rated) {
        this.Rated = Rated;
    }
   
   
}
