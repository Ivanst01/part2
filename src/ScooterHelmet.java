/**
 * A scooter helmet is a protective headgear whose value is determined by
 * its protection factor and whether it has a visor.
 * 
 * @author Ivan Stolnic
 */
public class ScooterHelmet extends ProtectiveHeadgear {

    /**
     * The multiplier used in the scooter helmet value formula.
     */
    private static final int C2 = 400;
    
    /**
     * Declares instance variable that stores a boolean for presence of a visor.
     */
    private boolean hasVisor;
    
    /**
     * Constructs a scooter helmet with a given protection factor and boolean value for visor.
     * 
     * @param protectionFactor must be a non-negative number.
     * @param hasVisor true if helmet has a visor.
     * @throws IllegalArgumentException if protectionFactor is negative.
     */

    public ScooterHelmet(double protectionFactor, boolean hasVisor) {
        super(protectionFactor); // protectionFactor is validated by superclass and IllegalArgumentException is thrown by superclass
        hasVisor();
    }

    /*Accessor method */
    /**
     * Returns boolean value wether the helmet has a visor.
     * 
     * @return true if helmet has a visor, otherwise false;
     */
    public boolean hasVisor() {
        return this.hasVisor;
    }

    /**
     * Mutator method.
     * Sets the value of the helmet visor.
     * 
     * @param hasVisor true if helmet has a visor.
     */
    public void setHasVisor(boolean hasVisor) {
        this.hasVisor = hasVisor;
    }

    /**
     * Implementation of the Headgear interface method
     * Calculates the value of the scooter helmet using its (p) protection factor,
     * (c1) wether it has a visor (160) or not (80), and C2 constant.
     * @return value in GBP (c1 + p*C2)
     */
    @Override
    public double getValue() {
        int c1 = hasVisor() ? 160 : 80;
        return c1 + getProtectionFactor() * C2;
    }
    
    /**
     * Returns a string representation of the attributes of this Scooter Helmet
     */
    @Override
    public String toString() {
        return "ScooterHelmet{" + super.toString() + ", hasVisor=" + hasVisor() + ", value=" + getValue() + "}";
    }
}
