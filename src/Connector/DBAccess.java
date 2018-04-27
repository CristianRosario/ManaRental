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

/**
 *
 * @author crist
 */
 


public class DBAccess {
     static  Connection comm = null;
       static String Url = "Jdbc:mysql://localhost:3306/";
       static String driver = "com.mysql.jdbc.Driver"; 
       static String dbName = "pf";
       static String UserName = "root";
       static String Password = "root"; 
       static String SSL = "?autoReconnect=true&useSSL=false";
       public static Connection DBAccess(){
             try{
         Class.forName(driver).newInstance(); 
         comm = DriverManager.getConnection(Url+dbName+SSL, UserName, Password);
             }catch(Exception e){
                 
                 }
             return(comm);
       }
        public static void Exit (){
         try{
          comm.close();
         }catch(Exception e){
             e.printStackTrace();
         }
     }
 
}
