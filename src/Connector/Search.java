/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connector;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import repository.Add;

/**
 *
 * @author crist
 */
public class Search {
    static Connection comm = Connector.DBAccess.DBAccess();
   static List<Model.Customer> customer = Connector.ConnectorDB.ClientList(); 
   static List<Model.Movies> movies = Connector.ConnectorDB.MoviesMana(); 
   static List<Model.Rent> rent = Connector.ConnectorDB.Rental(); 
   public static List<Model.ManyToMany> ManyTOMany(){
        String SQLManyToMany = "select pf.customer.FirstName, pf.customer.LastName, pf.movies.Title, pf.rent.* from rent inner join customer On customer.idCustomer = rent.CusId \n" +
                               "inner join movies on movies.idMovies = rent.MovieId;";
         List<Model.ManyToMany> mm = new ArrayList<Model.ManyToMany>();
        try{
       
         
        PreparedStatement pstC = comm.prepareStatement(SQLManyToMany);
         ResultSet rst = pstC.executeQuery();
          while(rst.next()){
             
             Model.ManyToMany m = new Model.ManyToMany(); 
             m.setIdCus(rst.getInt("CusId"));
             m.setIdMovie(rst.getInt("MovieID"));
             m.setFirstName(rst.getString("FirstName"));
             m.setLastNamr(rst.getString("LastName"));
             m.setTitle(rst.getString("Title"));
             m.setRD(rst.getString("RentDate"));
          
             mm.add(m);
         }
    
     }catch(Exception e){
         e.printStackTrace();
     }
        return  mm;
    }
    public static List<Model.Movies> FindMovie(int ID){
        String SQLFindCustomer = "SELECT * FROM `pf`.`movies` WHERE `idMovies`='"+ID+"';";
        List<Model.Movies> movie = new ArrayList<Model.Movies>();
        try{
        
         PreparedStatement pstC = comm.prepareStatement(SQLFindCustomer);
         ResultSet rst = pstC.executeQuery();
          while(rst.next()){
             
             Model.Movies c = new Model.Movies(); 
             c.setID(rst.getInt("idMovies"));
             c.setRD(rst.getString("ReleaseDate"));
             c.setGenre(rst.getString("Genre"));
             c.setRated(rst.getString("Rated"));
             c.setRunTime(rst.getString("RunTime"));
             movie.add(c);
         }
    
     }catch(Exception e){
         e.printStackTrace();
     }
        return  movie;
    }
  public static List<Model.Customer> FindClient(int ID){
        String SQLFindCustomer = "SELECT * FROM `pf`.`customer` WHERE `idCustomer`='"+ID+"';";
        List<Model.Customer> customer = new ArrayList<Model.Customer>();
        try{
        
         PreparedStatement pstC = comm.prepareStatement(SQLFindCustomer);
         ResultSet rst = pstC.executeQuery();
          while(rst.next()){
             
             Model.Customer c = new Model.Customer(); 
             c.setID(rst.getInt("idCustomer"));
             c.setAddress(rst.getString("Address"));
             c.setAdmin(rst.getString("Admin"));
             c.setDOB(rst.getString("DOB"));
             c.setCity(rst.getString("City"));
             c.setFName(rst.getString("FirstName"));
             c.setLName(rst.getString("LastName"));
             c.setMName(rst.getString("MiddleName"));
             c.setPhone(rst.getString("Phone"));
             c.setZipCode(rst.getString("ZipCode"));
             c.setUserName(rst.getString("UserName"));
             c.setPassword(rst.getString("Password"));
             customer.add(c);
         }
    
     }catch(Exception e){
         e.printStackTrace();
     }
        return  customer;
    }
}
