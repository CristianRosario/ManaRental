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
import static repository.Add.comm;
import static repository.Add.customer;

/**
 *
 * @author crist
 */

public class update {
     static Connection comm = Connector.DBAccess.DBAccess();
   static List<Model.Customer> customer = Connector.ConnectorDB.ClientList(); 
   static List<Model.Movies> movies = Connector.ConnectorDB.MoviesMana(); 
   static List<Model.Rent> rent = Connector.ConnectorDB.Rental(); 
      public static List<Model.Customer> UpdateCustomer(int ID, String Fname, String LName, String MName, String Address, String City, String Zipcode, String Admin, String Phone, String UserName, String Password, String DOB ){
       PreparedStatement pst;
       String SQLUpdateCustomer = "UPDATE `pf`.`customer` SET `FirstName`='"+Fname+"', `LastName`='"+LName+"', `MiddleName`='"+MName+"', `Address`='"+Address+"', `City`='"+City+"', `ZipCode`='"+Zipcode+"',`Admin`='"+Admin+"' , `Phone`='"+Phone+"', `UserName`='"+UserName+"', `Password`='"+Password+"', `DOB`='"+DOB+"' WHERE `idCustomer`='"+ID+"';";
       try {
           pst = comm.prepareStatement(SQLUpdateCustomer);
           pst.executeUpdate();
           
          customer = Connector.ConnectorDB.ClientList();
    
       } catch (SQLException ex) {
           Logger.getLogger(Add.class.getName()).log(Level.SEVERE, null, ex);
       }
        
       
       return customer;
   }
        public static List<Model.Movies> UpdateMovie(int ID, String Titulo, String RD, String Genre, String Runtime, String Rated ){
       PreparedStatement pst;
       String SQLUpdateCustomer = "UPDATE `pf`.`movies` SET `Title`='"+Titulo+"', `ReleaseDate`='"+RD+"', `Genre`='"+Genre+"', `RunTime`='"+Runtime+"' WHERE `idMovies`='"+ID+"';";
       try {
           pst = comm.prepareStatement(SQLUpdateCustomer);
           pst.executeUpdate();
           
          movies = Connector.ConnectorDB.MoviesMana();
    
       } catch (SQLException ex) {
           Logger.getLogger(Add.class.getName()).log(Level.SEVERE, null, ex);
       }
        
       
       return movies;
   }
}
