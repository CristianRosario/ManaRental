/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author crist
 */
public class Delete {
     static Connection comm = Connector.DBAccess.DBAccess();
   static List<Model.Customer> customer = Connector.ConnectorDB.ClientList(); 
   static List<Model.Movies> movies = Connector.ConnectorDB.MoviesMana(); 
   static List<Model.Rent> rent = Connector.ConnectorDB.Rental(); 
  public static List <Model.Movies> DeleteMovie(int ID){
      PreparedStatement pst; 
      String SQLDeleteMovie = "DELETE FROM `pf`.`movies` WHERE `idMovies`='"+ID+"';";

       try {
           pst = comm.prepareStatement(SQLDeleteMovie);
           pst.executeUpdate();
           
          movies = Connector.ConnectorDB.MoviesMana();
    
       } catch (SQLException ex) {
           Logger.getLogger(Add.class.getName()).log(Level.SEVERE, null, ex);
       }
      
      
      
      return movies;
  }
     public static List<Model.Rent> DeleteRent2(int ID){
       PreparedStatement pst;
       String SQLDeleteRent = "DELETE FROM `pf`.`rent` WHERE `MovieId`='"+ID+"';";

       try {
           pst = comm.prepareStatement(SQLDeleteRent);
           pst.executeUpdate();
           
          rent = Connector.ConnectorDB.Rental();
    
       } catch (SQLException ex) {
           Logger.getLogger(Add.class.getName()).log(Level.SEVERE, null, ex);
       }
        
       
       return rent;
   }
   public static List<Model.Rent> DeleteRent(int ID){
       PreparedStatement pst;
       String SQLDeleteRent = "DELETE FROM `pf`.`rent` WHERE `CusId`='"+ID+"';";

       try {
           pst = comm.prepareStatement(SQLDeleteRent);
           pst.executeUpdate();
           
          rent = Connector.ConnectorDB.Rental();
    
       } catch (SQLException ex) {
           Logger.getLogger(Add.class.getName()).log(Level.SEVERE, null, ex);
       }
        
       
       return rent;
   }
   public static List<Model.Customer> DeleteCustomer(int ID){
       PreparedStatement pst;
       String SQLDeleteCustomer = "DELETE FROM `pf`.`customer` WHERE `idCustomer`='"+ID+"';";

       try {
           pst = comm.prepareStatement(SQLDeleteCustomer);
           pst.executeUpdate();
           
          customer = Connector.ConnectorDB.ClientList();
    
       } catch (SQLException ex) {
           Logger.getLogger(Add.class.getName()).log(Level.SEVERE, null, ex);
       }
        
       
       return customer;
   }
}
