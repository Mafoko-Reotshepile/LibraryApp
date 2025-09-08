/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libraryapplication;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class User 
{
    private String username;
    private String password;
    
    public User(String username, String password) 
    {
        this.username = username;
        this.password = password;
    }
    
    
    // login method (accepts any username & password)
    public boolean login(String u, String p) 
    {
        this.username = u;   // store whoever logged in
        this.password = p;   // store the entered password
        return true;         // always returns true
    }

    public String getUsername() {
        return username;
    }
    
    
}
