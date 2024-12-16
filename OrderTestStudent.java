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

public class OrderTestStudent {

    @Test
    public void testOrderConstructor() {
        Customer customer = new Customer("Sam", 35);
        Order order = new Order(12, Day.MONDAY, customer);
        assertEquals(12, order.getOrderTime());
        assertEquals(Day.MONDAY, order.getOrderDay());
        assertEquals(customer.getName(), order.getCustomer().getName());
    }

    @Test
    public void testAddNewBeverage() {
        Customer customer = new Customer("Mia", 28);
        Order order = new Order(10, Day.SATURDAY, customer);
        order.addNewBeverage("Latte", Size.MEDIUM, true, true);
        assertEquals(1, order.getTotalItems());
    }

    @Test
    public void testCalcOrderTotal() {
        Customer customer = new Customer("Jake", 21);
        Order order = new Order(8, Day.SUNDAY, customer);
        order.addNewBeverage("Latte", Size.SMALL, false, false);
        order.addNewBeverage("Smoothie", Size.LARGE, 3, false);
        double total = order.calcOrderTotal();
        assertTrue(total > 0);
    }

    @Test
    public void testIsWeekend() {
        Order order1 = new Order(14, Day.SATURDAY, new Customer("Lucy", 25));
        Order order2 = new Order(14, Day.WEDNESDAY, new Customer("Mark", 30));
        assertTrue(order1.isWeekend());
        assertFalse(order2.isWeekend());
    }
}
