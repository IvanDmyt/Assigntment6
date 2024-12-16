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

public class BevShopDriverApp {
    public static void main(String[] args) {
        BevShop bevShop = new BevShop();

        System.out.println("The current order in process can have at most 3 alcoholic beverages.");
        System.out.println("The minimum age to order alcohol drink is 21");

        // First Order
        System.out.println("Start please a new order:");
        bevShop.startNewOrder(10, Day.MONDAY, "John", 23);
        System.out.println("Your Total Order for now is " + bevShop.getCurrentOrder().calcOrderTotal());

        System.out.println("Would you please add an alcohol drink");
        bevShop.processAlcoholOrder("Whiskey", Size.SMALL);
        System.out.println("The current order of drinks is " + bevShop.getCurrentOrder().getTotalItems());
        System.out.println("The Total price on the Order is " + bevShop.getCurrentOrder().calcOrderTotal());

        System.out.println("Would you please add a second alcohol drink");
        bevShop.processAlcoholOrder("Vodka", Size.MEDIUM);
        System.out.println("The current order of drinks is " + bevShop.getCurrentOrder().getTotalItems());
        System.out.println("The Total Price on the Order: " + bevShop.getCurrentOrder().calcOrderTotal());

        System.out.println("Add third alcohol drink");
        bevShop.processAlcoholOrder("Rum", Size.LARGE);
        System.out.println("The current order of drinks is " + bevShop.getCurrentOrder().getTotalItems());
        System.out.println("The Total Price on the Order: " + bevShop.getCurrentOrder().calcOrderTotal());

        System.out.println("Would you please add a COFFEE to your order:");
        bevShop.processCoffeeOrder("Espresso", Size.MEDIUM, true, false);
        System.out.println("Total items on your order is " + bevShop.getCurrentOrder().getTotalItems());
        System.out.println("The Total Price on the Order: " + bevShop.getCurrentOrder().calcOrderTotal());

        // Second Order
        System.out.println("#------------------------------------#");
        System.out.println("Would you please start a new order");
        bevShop.startNewOrder(12, Day.SATURDAY, "Ray", 18);
        System.out.println("The Total Price on the Order: " + bevShop.getCurrentOrder().calcOrderTotal());

        System.out.println("Would you please add a SMOOTHIE to order");
        bevShop.processSmoothieOrder("Tropical", Size.MEDIUM, 3, true);
        System.out.println("The Total Price on the Order: " + bevShop.getCurrentOrder().calcOrderTotal());

        System.out.println("Would you please add a SMOOTHIE to order");
    }
    
}