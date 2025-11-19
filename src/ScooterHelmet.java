/**
 * A scooter helmet is a protective headgear which value is determined by
 * its protection factor and whether it has a visor.
 * 
 * @author Ivan Stolnic
 */
public class ScooterHelmet extends ProtectiveHeadgear {

    /**
     * Given constant value c2.
     */
    private static final int C2 = 400;
    
    /**
     * Declares instant variable that stores a boolean for presence of a visor.
     */
    private boolean hasVisor;
    
    /**
     * Constructs a scooter helmet with inherited protection value and boolean value for visor.
     * 
     * @param protectionFactor must be a non-negative number.
     * @param hasVisor true if helmet has a visor.
     * @throws IllegalArgumentException if protectionFactor is negative.
     */

    public ScooterHelmet(double protectionFactor, boolean hasVisor) {
        super(protectionFactor);
        this.hasVisor = hasVisor;
    }


    /**
     * Implementation of the Headgear interface method
     * Calculates the value of the scooter helmet using its (p) protection factor  and
     * (c1) wether it has a visor (160) or not (80), and C2 constant.
     * @return value in GBP (c1 + p*C2)
     */
    @Override
    public double getValue() {
        int c1 = hasVisor ? 160 : 80;
        return c1 + getProtectionFactor() * C2;
    }

    
}
