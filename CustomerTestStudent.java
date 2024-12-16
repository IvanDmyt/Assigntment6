/*
 * Class: CMSC203 
 * Instructor:Professor Monshi
 * Description: Computer Science class where we study object oriented design using Java programming language
 * Due: 12/15/2024
 * Platform/compiler: Eclipse IDE
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Ivan Sergiyovych Dmytriiev
*/


import static org.junit.Assert.*;
import org.junit.Test;

public class CustomerTestStudent {

    @Test
    public void testCustomerConstructor() {
        Customer customer = new Customer("John Doe", 25);
        assertEquals("John Doe", customer.getName());
        assertEquals(25, customer.getAge());
    }

    @Test
    public void testCopyConstructor() {
        Customer original = new Customer("Jane Doe", 30);
        Customer copy = new Customer(original);
        assertEquals(original.getName(), copy.getName());
        assertEquals(original.getAge(), copy.getAge());
    }

    @Test
    public void testToString() {
        Customer customer = new Customer("Alice", 22);
        assertEquals("Customer: Alice, Age: 22", customer.toString());
    }

    @Test
    public void testEquals() {
        Customer customer1 = new Customer("Tom", 40);
        Customer customer2 = new Customer("Tom", 40);
        assertTrue(customer1.equals(customer2));
    }
}
