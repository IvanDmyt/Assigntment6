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

public class Smoothie extends Beverage {
    private int numOfFruits;
    private boolean addProtein;

    public static final double FRUIT_COST = 0.5;
    public static final double PROTEIN_COST = 1.5;

    public Smoothie(String name, Size size, int numOfFruits, boolean addProtein) {
        super(name, Type.SMOOTHIE, size);
        this.numOfFruits = numOfFruits;
        this.addProtein = addProtein;
    }

    @Override
    public double calcPrice() {
        double price = addSizePrice();
        price += numOfFruits * FRUIT_COST;
        if (addProtein) price += PROTEIN_COST;
        return price;
    }

    @Override
    public String toString() {
        return super.toString() + ", Fruits: " + numOfFruits + ", Protein Added: " + addProtein + ", Price: " + calcPrice();
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (!(obj instanceof Smoothie)) return false;
        Smoothie other = (Smoothie) obj;
        return numOfFruits == other.numOfFruits && addProtein == other.addProtein;
    }

    // Getters and setters
    public int getNumOfFruits() { return numOfFruits; }
    public void setNumOfFruits(int numOfFruits) { this.numOfFruits = numOfFruits; }
    public boolean isAddProtein() { return addProtein; }
    public void setAddProtein(boolean addProtein) { this.addProtein = addProtein; }
}

