/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

/**
 *
 * @author crist
 */
import Connector.*;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Add {
   static Connection comm = Connector.DBAccess.DBAccess();
   static List<Model.Customer> customer = Connector.ConnectorDB.ClientList(); 
   static List<Model.Movies> movies = Connector.ConnectorDB.MoviesMana(); 
   static List<Model.Rent> rent = Connector.ConnectorDB.Rental(); 
   
   public static List<Model.Rent> AddRent1 (String cusID, String movID, String RD, int Reserve ){
       PreparedStatement pst;
       int CusID;
       CusID = Integer.parseInt(cusID);
       int MovID = Integer.parseInt(movID);
       String SQLAddRent = "INSERT INTO `pf`.`rent` (`CusId`, `MovieId`, `RentDate`, `Reservation`) VALUES ('"+CusID+"', '"+MovID+"', '"+RD+"', '"+Reserve+"');";
       
           try {
               pst = comm.prepareStatement(SQLAddRent);
               pst.executeUpdate();
               
               rent = Connector.ConnectorDB.Rental();
               
           } catch (SQLException ex) {
               
               Logger.getLogger(Add.class.getName()).log(Level.SEVERE, null, ex);
           }
           
       
       return rent;
   }
   public static List<Model.Customer> AddCustomer(String Fname, String LName, String MName, String Address, String City, String Zipcode, String Admin, String Phone, String UserName, String Password, String DOB ){
       PreparedStatement pst;
       String SQLAddCustomer = "INSERT INTO `pf`.`customer` (`FirstName`, `LastName`, `MiddleName`, `Address`, `City`, `ZipCode`, `Phone`, `Admin`, `UserName`, `Password`, `DOB`) VALUES "
               + "('"+Fname+"', '"+LName+"', '"+MName+"', '"+Address+"', '"+City+"', '"+Zipcode+"', '"+Phone+"', '"+Admin+"', '"+UserName+"', '"+Password+"', '"+DOB+"');";
       try {
           pst = comm.prepareStatement(SQLAddCustomer);
           pst.executeUpdate();
           
          customer = Connector.ConnectorDB.ClientList();
    
       } catch (SQLException ex) {
           Logger.getLogger(Add.class.getName()).log(Level.SEVERE, null, ex);
       }
        
       
       return customer;
   }
    public static List<Model.Movies> AddMovies (String Title, String RD, String Genre, String RunTime, String Rated){
       PreparedStatement pst;
       String SQLAddCustomer = "INSERT INTO `pf`.`movies` (`Title`, `ReleaseDate`, `Genre`, `RunTime`, `Rated`) VALUES "
               + "('"+Title+"', '"+RD+"', '"+Genre+"', '"+RunTime+"','"+Rated+"');";
       try {
           pst = comm.prepareStatement(SQLAddCustomer);
           pst.executeUpdate();
           
          movies = Connector.ConnectorDB.MoviesMana();
    
       } catch (SQLException ex) {
           Logger.getLogger(Add.class.getName()).log(Level.SEVERE, null, ex);
       }
        
       
       return movies;
   }
}
