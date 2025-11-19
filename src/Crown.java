/**
 * A crown is a piece of headgear which value  is determined by its number of jewels
 * 
 * @author Ivan Stolnic
 */


public class Crown implements Headgear {

    /**
     * Constant value factor per jewel.
     */
    private static final int FIXED_VALUE_FACTOR = 200000;

    /**
     * Declares instant variable that stores the number of jewels in the crown.
     */
    private int numberOfJewels;

    /* Constructors */

    /**
     * Constructs a crown with a given number of jewels.
     * 
     * @param numberOfJewels must be a positive number.
     * @throws IllegalArgumentException if numberOfJewels is negative.
     */

    public Crown(int numberOfJewels) {
        if (numberOfJewels < 0) {
            throw new IllegalArgumentException("Number of jewels must be a positive number.");
        }
        this.numberOfJewels = numberOfJewels;
    }


    @Override
    public double getValue() {
        return numberOfJewels * FIXED_VALUE_FACTOR;
    }


}