/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libraryapplication;

/**
 *
 * @author RC_Student_lab
 */

public class Book 
{
    private int id;
    private String title;
    private String author;
    
    public Book(int id, String title, String author) 
    {
        this.id = id;
        this.title = title;
        this.author = author;
    }
    
    // Getters
    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    @Override
    public String toString() 
    {
        return id + " | " + title + " | " + author;
    }
    
}
