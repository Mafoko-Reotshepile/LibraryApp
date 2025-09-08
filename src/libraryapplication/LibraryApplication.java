/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libraryapplication;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class LibraryApplication 
{
    
    private static ArrayList<Book> books = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // Create admin
        Admin admin = new Admin("admin", "1234");

        // Login
        System.out.println("==== Library Login ====");
        System.out.print("Enter username: ");
        String user = sc.nextLine();
        System.out.print("Enter password: ");
        String pass = sc.nextLine();

        if (!admin.login(user, pass)) 
        {
            System.out.println("Invalid login. Exiting...");
            return;
        }
        
        // Menu loop
        int choice;
        do {
            System.out.println("\n==== Library Book Manager ====");
            System.out.println("1. Add Book");
            System.out.println("2. Search Book");
            System.out.println("3. Delete Book");
            System.out.println("4. View Report");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> addBook();
                case 2 -> searchBook();
                case 3 -> deleteBook();
                case 4 -> viewReport();
                case 5 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 5);
        
    }
        //Method to add books
        private static void addBook() 
        {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Title: ");
        String title = sc.nextLine();
        System.out.print("Enter Author: ");
        String author = sc.nextLine();

        books.add(new Book(id, title, author));
        System.out.println("Book added successfully!");
        }

        //Search book method
        private static void searchBook() 
        {
           System.out.print("Enter title to search: ");
           String title = sc.nextLine();
        
        boolean found = false;

        for (Book b : books) 
        {
            if (b.getTitle().equalsIgnoreCase(title)) 
            {
                System.out.println("Found: " + b);
                found = true;
                break;
            }
        }
        if (!found) System.out.println("Book not found!");
    }

    //Delete books
    private static void deleteBook() 
    {
        System.out.print("Enter Book ID to delete: ");
        int id = sc.nextInt();
        sc.nextLine();

        books.removeIf(b -> b.getId() == id);
        System.out.println("Book deleted (if existed).");
    }

    //View the report
    private static void viewReport() 
    {
        System.out.println("\n==== Library Report ====");
        if (books.isEmpty()) 
        {
            System.out.println("No books available.");
        } else 
        {
            for (Book b : books) 
            {
                System.out.println(b);
            }
        }
        
    }    
        
    }//End of main method
        
//End of Class

    

