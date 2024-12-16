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

public class AlcoholTestStudent {

    @Test
    public void testCalcPriceWeekend() {
        Alcohol alcohol = new Alcohol("Whiskey", Size.LARGE, true);
        double expectedPrice = alcohol.addSizePrice() + Alcohol.WEEKEND_COST;
        assertEquals(expectedPrice, alcohol.calcPrice(), 0.01);
    }

    @Test
    public void testCalcPriceWeekday() {
        Alcohol alcohol = new Alcohol("Wine", Size.MEDIUM, false);
        double expectedPrice = alcohol.addSizePrice();
        assertEquals(expectedPrice, alcohol.calcPrice(), 0.01);
    }

    @Test
    public void testToString() {
        Alcohol alcohol = new Alcohol("Beer", Size.SMALL, true);
        String expected = "Beverage: Beer, Size: SMALL, Weekend: true, Price: " + alcohol.calcPrice();
        assertEquals(expected, alcohol.toString());
    }

    @Test
    public void testEquals() {
        Alcohol alcohol1 = new Alcohol("Whiskey", Size.LARGE, true);
        Alcohol alcohol2 = new Alcohol("Whiskey", Size.LARGE, true);
        assertTrue(alcohol1.equals(alcohol2));
    }
}
