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

public class CoffeeTestStudent {

    private Coffee coffee1;
    private Coffee coffee2;

    @Before
    public void setUp() {
        coffee1 = new Coffee("Latte", Size.SMALL, true, true);
        coffee2 = new Coffee("Espresso", Size.LARGE, false, false);
    }

    @Test
    public void testConstructor() {
        assertEquals("Latte", coffee1.getName());
        assertEquals(Size.SMALL, coffee1.getSize());
        assertTrue(coffee1.hasExtraShot());
        assertTrue(coffee1.hasExtraSyrup());

        assertEquals("Espresso", coffee2.getName());
        assertEquals(Size.LARGE, coffee2.getSize());
        assertFalse(coffee2.hasExtraShot());
        assertFalse(coffee2.hasExtraSyrup());
    }

    @Test
    public void testCalcPrice() {
        double expectedPrice1 = Beverage.BASE_PRICE + Coffee.EXTRA_COST + Coffee.EXTRA_COST; // Small + Extra shot + Extra syrup
        assertEquals(expectedPrice1, coffee1.calcPrice(), 0.01);

        double expectedPrice2 = Beverage.BASE_PRICE + (2 * Beverage.SIZE_PRICE); // Large with no extras
        assertEquals(expectedPrice2, coffee2.calcPrice(), 0.01);
    }

    @Test
    public void testToString() {
        String expected1 = "Beverage: Latte, Size: SMALL, Extra Shot: true, Extra Syrup: true, Price: " + coffee1.calcPrice();
        assertEquals(expected1, coffee1.toString());

        String expected2 = "Beverage: Espresso, Size: LARGE, Extra Shot: false, Extra Syrup: false, Price: " + coffee2.calcPrice();
        assertEquals(expected2, coffee2.toString());
    }

    @Test
    public void testEquals() {
        Coffee coffee3 = new Coffee("Latte", Size.SMALL, true, true);
        Coffee coffee4 = new Coffee("Mocha", Size.SMALL, true, true);

        assertTrue(coffee1.equals(coffee3));
        assertFalse(coffee1.equals(coffee4));
        assertFalse(coffee1.equals(coffee2));
    }
}
