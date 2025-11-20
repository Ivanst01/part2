/**
 * Abstract superclass for all types of protective headgears.
 * Stores and validates the common protective features for all subclasses.
 * 
 * @author Ivan Stolnic
 */
public abstract class ProtectiveHeadgear implements Headgear {

    /**
     * Declares instance variable that stores the protection factor of the headgear.
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
        setProtectionFactor(protectionFactor);
    }

    /*Accessor method */
    /**
     * Returns the protection factor of this ProtectiveHeadgear that can be called in other classes.
     * 
     * @return protection factor;
     */
    public double getProtectionFactor() {
        return this.protectionFactor;
    }

    /**
     * Mutator method.
     * Sets the protection factor of of this protective headwear amd
     * validates only non-negative input.
     * 
     * @param protectionFactor must be a non-negative number.
     * @throws IllegalArgumentException if protectionFactor is negative.
     */
    public void setProtectionFactor(double protectionFactor) {
        if (protectionFactor < 0) {
            throw new IllegalArgumentException("Protection factor must be a non-negative number.");
        }
        this.protectionFactor = protectionFactor;
    }

    /**
     * Returns a string representation of the attributes of this ProtectiveHeadgear
     */
    @Override
    public String toString() {
        return "protectionFactor=" + protectionFactor;
    }
}