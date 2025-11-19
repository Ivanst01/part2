/**
 * Abstract class for all protective headgears.
 * Stores the common protective features.
 * 
 * @author Ivan Stlnic
 */
public abstract class ProtectiveHeadgear implements Headgear {

     /**
     * Declares instant variable that stores the protection factor.
     */
    private double protectionFactor;

    
    /* Constructors */

    /**
     * Constructs a ProtectiveHeadgear with a given protection factor.
     * 
     * @param protectionFactor must be a non-negative number.
     * @throws IllegalArgumentException if protectionFactor is negative.
     */

    public ProtectiveHeadgear(double protectionFactor) {
        if (protectionFactor < 0) {
            throw new IllegalArgumentException("Protection factor must be a non-negative number.");
        }
        this.protectionFactor = protectionFactor;
    }

    /*Accessor method */
    /**
     * Returns the protection factor of ProtectiveHeadgear that can be called in other classes.
     * 
     * @return protection factor;
     */
    public double getProtectionFactor() {
        return this.protectionFactor;
    }
}