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

        if (!admin.login(user, pass)) {
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
        
        
    }//End of main method
        
//End of Class

    

