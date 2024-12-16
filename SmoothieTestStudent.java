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

public class SmoothieTestStudent {

    private Smoothie smoothie1;
    private Smoothie smoothie2;

    @Before
    public void setUp() {
        smoothie1 = new Smoothie("Green Detox", Size.SMALL, 2, true);
        smoothie2 = new Smoothie("Berry Blast", Size.LARGE, 5, false);
    }

    @Test
    public void testConstructor() {
        assertEquals("Green Detox", smoothie1.getName());
        assertEquals(Size.SMALL, smoothie1.getSize());
        assertEquals(2, smoothie1.getNumOfFruits());
        assertTrue(smoothie1.isAddProtein());

        assertEquals("Berry Blast", smoothie2.getName());
        assertEquals(Size.LARGE, smoothie2.getSize());
        assertEquals(5, smoothie2.getNumOfFruits());
        assertFalse(smoothie2.isAddProtein());
    }

    @Test
    public void testCalcPrice() {
        double expectedPrice1 = Beverage.BASE_PRICE + (2 * Smoothie.FRUIT_COST) + Smoothie.PROTEIN_COST;
        assertEquals(expectedPrice1, smoothie1.calcPrice(), 0.01);

        double expectedPrice2 = Beverage.BASE_PRICE + (2 * Beverage.SIZE_PRICE) + (5 * Smoothie.FRUIT_COST);
        assertEquals(expectedPrice2, smoothie2.calcPrice(), 0.01);
    }

    @Test
    public void testToString() {
        String expected1 = "Beverage: Green Detox, Size: SMALL, Fruits: 2, Protein Added: true, Price: " + smoothie1.calcPrice();
        assertEquals(expected1, smoothie1.toString());

        String expected2 = "Beverage: Berry Blast, Size: LARGE, Fruits: 5, Protein Added: false, Price: " + smoothie2.calcPrice();
        assertEquals(expected2, smoothie2.toString());
    }

    @Test
    public void testEquals() {
        Smoothie smoothie3 = new Smoothie("Green Detox", Size.SMALL, 2, true);
        Smoothie smoothie4 = new Smoothie("Berry Blast", Size.MEDIUM, 5, false);

        assertTrue(smoothie1.equals(smoothie3));
        assertFalse(smoothie1.equals(smoothie4));
        assertFalse(smoothie1.equals(smoothie2));
    }
}
