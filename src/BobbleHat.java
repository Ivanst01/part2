/**
 * A bobble hat is a protective headgear whose value is determined by
 * its protection factor and its diameter.
 * 
 * @author Ivan Stolnic
 */
public class BobbleHat extends ProtectiveHeadgear {

    /**
     * The multiplier used in the bobble hat value formula.
     */
    private static final int MULTIPLIER = 4;
    
    /**
     * Declares instance variable that stores diameter in millimetres.
     */
    private int diameterInMm;
    
    /**
     * Constructs a bobble hat with a given protection factor and bobble diameter.
     * 
     * @param protectionFactor must be a non-negative number.
     * @param diameterInMm must be a non-negative number.
     * @throws IllegalArgumentException if protectionFactor or diameterInMm are negative.
     */

    public BobbleHat(double protectionFactor, int diameterInMm) {
        super(protectionFactor);
        if (diameterInMm < 0) {
            throw new IllegalArgumentException("Diameter must be a non-negative number.");
        }
        this. diameterInMm = diameterInMm;
    }


    /**
     * Implementation of the Headgear interface method
     * Calculates the value of this bobble hat using its protection factor and diameter.
     * @return value in GBP 
     */
    @Override
    public double getValue() {
        return diameterInMm * MULTIPLIER * getProtectionFactor() ;
    }

    
}
