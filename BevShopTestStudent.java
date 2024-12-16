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
import org.junit.Before;
import org.junit.Test;

public class BevShopTestStudent {

    private BevShop shop;

    @Before
    public void setUp() {
        shop = new BevShop();
    }

    @Test
    public void testIsValidTime() {
        assertTrue(shop.isValidTime(10));
        assertFalse(shop.isValidTime(25));
    }

    @Test
    public void testStartNewOrder() {
        shop.startNewOrder(9, Day.MONDAY, "Alex", 19);
        assertNotNull(shop.getCurrentOrder());
    }

    @Test
    public void testProcessAlcoholOrder() {
        shop.startNewOrder(11, Day.SATURDAY, "John", 21);
        shop.processAlcoholOrder("Whiskey", Size.SMALL);
        assertEquals(1, shop.getNumOfAlcoholDrink());
    }

    @Test
    public void testTotalMonthlySale() {
        shop.startNewOrder(10, Day.FRIDAY, "Ella", 22);
        shop.processCoffeeOrder("Espresso", Size.LARGE, false, false);
        assertTrue(shop.totalMonthlySale() > 0);
    }

    @Test
    public void testSortOrders() {
        shop.startNewOrder(9, Day.MONDAY, "Tom", 24);
        shop.processSmoothieOrder("Green Smoothie", Size.MEDIUM, 3, true);

        shop.startNewOrder(10, Day.TUESDAY, "Lisa", 25);
        shop.processCoffeeOrder("Latte", Size.LARGE, true, true);

        shop.sortOrders();
        assertNotNull(shop.getOrderAtIndex(0));
    }
}
