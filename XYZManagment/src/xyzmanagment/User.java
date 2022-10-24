/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xyzmanagment;

/**
 *
 * @author mical
 */
class User {
    
    private String UserID, Password, UserType;
    
    public User(String UserID, String Password, String UserType)
    {
        this.UserID=UserID;
        this.Password=Password;
        this.UserType=UserType;
    }
    public String getUserID(){
    return UserID;
    }
    
    public String getPassword(){
    return Password;
    }
    
    public String getUserType(){
    return UserType;
    }
    
}
