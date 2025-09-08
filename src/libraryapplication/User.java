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
    
    public boolean login(String u, String p) 
    {
        return username.equals(u) && password.equals(p);
    }

    
    
}
