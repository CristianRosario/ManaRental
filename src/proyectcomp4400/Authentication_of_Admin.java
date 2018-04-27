/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectcomp4400;

/**
 *
 * @author crist
 */
class Authentication_of_Admin {
      static int Admin; 
      static int EditM;
      
    public static int getAdmin() {
        return Admin;
    }
    public static int getEditM(){
        return EditM;
    }
    public static void setAdmin(int Admin) {
        Authentication_of_Admin.Admin = Admin;
    }
   public static void setEditM(int EditM){
        Authentication_of_Admin.EditM  = EditM;
        
   }
 
    
}
