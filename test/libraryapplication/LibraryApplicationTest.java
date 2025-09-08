/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libraryapplication;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

/**
 *
 * @author RC_Student_lab
 */
public class LibraryApplicationTest 
{
    private Admin admin;
    private ArrayList<Book> books;

    @BeforeEach
    void setUp() {
        // Prepare a test admin and fresh book list
        admin = new Admin("testUser", "testPass");
        books = new ArrayList<>();
    }

    @Test
    void testLoginAlwaysSucceeds() {
        boolean result = admin.login("anyUser", "anyPass");
        assertTrue(result, "Login should always succeed");
        assertEquals("anyUser", admin.getUsername(), "Username should be stored correctly");
    }

    @Test
    void testAddBook() {
        Book book = new Book(1, "Java Basics", "John Doe");
        books.add(book);

        assertEquals(1, books.size(), "Book list should have 1 book after adding");
        assertEquals("Java Basics", books.get(0).getTitle(), "Book title should match");
    }

    @Test
    void testSearchBookFound() {
        Book book = new Book(2, "OOP Concepts", "Alice");
        books.add(book);

        boolean found = books.stream().anyMatch(b -> b.getTitle().equalsIgnoreCase("OOP Concepts"));
        assertTrue(found, "Book should be found in the list");
    }

    @Test
    void testSearchBookNotFound() {
        Book book = new Book(3, "Data Structures", "Bob");
        books.add(book);

        boolean found = books.stream().anyMatch(b -> b.getTitle().equalsIgnoreCase("Algorithms"));
        assertFalse(found, "Non-existent book should not be found");
    }

    @Test
    void testDeleteBook() {
        Book book1 = new Book(4, "Networks", "Charlie");
        Book book2 = new Book(5, "Databases", "Diana");
        books.add(book1);
        books.add(book2);

        // Simulate deletion
        books.removeIf(b -> b.getId() == 4);

        assertEquals(1, books.size(), "Book list should only contain 1 book after deletion");
        assertEquals("Databases", books.get(0).getTitle(), "Remaining book should be Databases");
    }
    
}
