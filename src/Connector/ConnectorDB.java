/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connector;
import Model.Customer;
import Model.Movies;
import Model.Rent;
import java.sql.*; 
import  java.sql.Driver;
import java.util.*; 
import model.*; 


public class ConnectorDB {
     
       static String testSQLCON = "Select * from pf.movies"; 
       static String testSQLCON1 = "Select * from pf.customer"; 
       static String testSQLCON2 = "Select * from pf.rent";
       static Connection comm = Connector.DBAccess.DBAccess();
    public static List<Customer> ClientList(){
        
        List<Customer> customer = new ArrayList<Customer>();
        try{
        
         PreparedStatement pstC = comm.prepareStatement(testSQLCON1);
         ResultSet rst = pstC.executeQuery();
          while(rst.next()){
             
             Customer c = new Customer(); 
             c.setID(rst.getInt("idCustomer"));
             c.setAddress(rst.getString("Address"));
             c.setAdmin(rst.getString("Admin"));
             c.setCity(rst.getString("City"));
             c.setDOB(rst.getString("DOB"));
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
    public static List<Movies> MoviesMana(){
        
         List<Movies> movies = new ArrayList(); 
         try{
        
        
         PreparedStatement pst = comm.prepareStatement(testSQLCON);
         ResultSet rst = pst.executeQuery();
         while(rst.next()){
             
             Movies m = new Movies(); 
             m.setID(rst.getInt("idMovies"));
             m.setGenre(rst.getString("Genre"));
             m.setRD(rst.getString("ReleaseDate"));
             m.setRated(rst.getString("Rated"));
             m.setRunTime(rst.getString("RunTime"));
             m.setTitle(rst.getString("Title"));
             movies.add(m);
         }
         
         }catch(Exception e){
             e.printStackTrace();
         }
        
        return movies;
    }
    public static List<Rent> Rental (){
       List<Rent> rent = new ArrayList(); 
       try{
        
         PreparedStatement pst = comm.prepareStatement(testSQLCON2);
         ResultSet rst = pst.executeQuery();
          while(rst.next()){
             
             Rent r = new Rent(); 
             r.setIdCustomer(rst.getInt("CusId"));
             r.setIdMovies(rst.getInt("MovieId"));
      
             r.setRd(rst.getString("RentDate"));
             r.setReservation(rst.getString("Reservation"));
            
             rent.add(r);
         }
    
       }catch(Exception e){
         e.printStackTrace();
       }
        return rent;
    }
    
                
    }
  