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
public class Customer {
    int ID; 
    String FName; 
    String LName; 
    String MName; 
    String Address; 
    String ZipCode; 
    String Phone;
    String Admin; 
    String UserName; 
    String Password; 
    String City;

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }
    String DOB; 
    public Customer(){
    
    }
    public Customer(int ID, String FName, String LName, String MName, String Address, String ZipCode, String Phone, String Admin, String UserName, String Password, String DOB, String City) {
        this.ID = ID;
        this.FName = FName;
        this.LName = LName;
        this.MName = MName;
        this.Address = Address;
        this.ZipCode = ZipCode;
        this.Phone = Phone;
        this.Admin = Admin;
        this.UserName = UserName;
        this.Password = Password;
        this.DOB = DOB;
        this.City = City;
    }

    @Override
    public String toString() {
        return "Customer{" + "FName=" + FName + ", LName=" + LName + ", MName=" + MName + ", Address=" + Address + ", ZipCode=" + ZipCode + ", Phone=" + Phone + ", Admin=" + Admin + ", UserName=" + UserName + ", Password=" + Password + ", DOB=" + DOB + '}';
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public String getMName() {
        return MName;
    }

    public void setMName(String MName) {
        this.MName = MName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getZipCode() {
        return ZipCode;
    }

    public void setZipCode(String ZipCode) {
        this.ZipCode = ZipCode;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getAdmin() {
        return Admin;
    }

    public void setAdmin(String Admin) {
        this.Admin = Admin;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }
    
    
}
