/**
 * A crown is a piece of headgear whose value is determined by its number of jewels it contains
 * 
 * @author Ivan Stolnic
 */

public class Crown implements Headgear {

    /**
     * Constant value factor per jewel in GBP.
     */
    private static final double FIXED_VALUE_FACTOR = 200000.0;

    /**
     * Declares instance variable that stores the number of jewels in this crown.
     */
    private int numberOfJewels;

    /* Constructors */
    /**
     * Constructs a crown with a given number of jewels.
     * 
     * @param numberOfJewels must be a non-negative number.
     * @throws IllegalArgumentException if numberOfJewels is negative.
     */
    public Crown(int numberOfJewels) {
        setJewelNumber(numberOfJewels);
    }

    /**
     * Accessor method
     * Returns the number of jewels
     * 
     * @return number of jewels
     */
    public int getJewels() {
        return numberOfJewels;
    }

    /**
     * Mutator method.
     * Sets the number of jewels in this crown and 
     * validates only non-negative input.
     * 
     * @param numberOfJewels must be non-negative number.
     * @throws IllegalArgumentException if numberOfJewels is negative.
     */
    public void setJewelNumber(int numberOfJewels) {
        if (numberOfJewels < 0) {
            throw new IllegalArgumentException("Number of jewels must be a non-negative number.");
        }
        this.numberOfJewels = numberOfJewels;
    }

    /**
     * Implementation of the Headgear interface method.
     * Calculates the value of this crown using its number of jewels.
     * @return value in GBP
     */
    @Override
    public double getValue() {
        return numberOfJewels * FIXED_VALUE_FACTOR;
    }

    /**
     * Returns a string representation of this Crown
     */
    @Override
    public String toString() {
        return "Crown{numberOfJewels=" + numberOfJewels + ", value=" + getValue() + "}";
    }
}