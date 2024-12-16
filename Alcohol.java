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

public class Alcohol extends Beverage {
    private boolean isWeekend;

    public static final double WEEKEND_COST = 0.6;

    public Alcohol(String name, Size size, boolean isWeekend) {
        super(name, Type.ALCOHOL, size);
        this.isWeekend = isWeekend;
    }

    @Override
    public double calcPrice() {
        double price = addSizePrice();
        if (isWeekend) price += WEEKEND_COST;
        return price;
    }

    @Override
    public String toString() {
        return super.toString() + ", Weekend: " + isWeekend + ", Price: " + calcPrice();
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (!(obj instanceof Alcohol)) return false;
        Alcohol other = (Alcohol) obj;
        return isWeekend == other.isWeekend;
    }

    // Getters and setters
    public boolean isWeekend() { return isWeekend; }
    public void setWeekend(boolean isWeekend) { this.isWeekend = isWeekend; }
}


