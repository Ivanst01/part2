/**
 * A utility class providing helper method to calculate the totaal value 
 * of an arry of Headgear items. 
 * It is not meant to be instantiated.
 *  
 * @author Ivan Stolnic
 */

public final class HeadgearUtils {
    
    /*Private constructor to prevent instantiation of this class */
    private HeadgearUtils() {}

    /**
     * Calculates the total value of all headgears in s given array.
     * 
     * @param items array of Headgears, must not be null or contain null elements, but may contain.
     * @return total value in GBP
     * @throws IllegalArgumentException if the array is null or is contains null elements.
     */
    public static double totalValue(Headgear[] items) {
        if (items == null) throw new IllegalArgumentException("Array must not be null");

        double sum = 0.0;

        for (int i = 0; i < items.length; i++) {
            if (items[i] == null){
                throw new IllegalArgumentException("Headgear element at index " + i + "must is null");
            }
            sum += items[i].getValue();
        }

        return sum;
    }
}
