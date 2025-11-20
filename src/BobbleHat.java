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
        super(protectionFactor); // protectionFactor is validated by superclass and IllegalArgumentException is thrown by superclass
        setDiameterInMm(diameterInMm);
    }

     /*Accessor method */
    /**
     * Returns the diameter of the Bobble. 
     * 
     * @return diameter in milimetres;
     */
    public double getDiameterInMm() {
        return this.diameterInMm;
    }

    /**
     * Mutator method.
     * Sets the diameter of this bobble hat and 
     * validates only non-negative input.
     * 
     * @param diameterInMm must be a non-negative number.
     * @throws IllegalArgumentException if diameterInMm is negative.
     */
    public void setDiameterInMm(int diameterInMm) {
        if (diameterInMm < 0) {
            throw new IllegalArgumentException("Diameter must be a non-negative number.");
        }
        this.diameterInMm = diameterInMm;
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

    /**
     * Returns a string representation of the attributes of this Bobblehat
     */
    @Override
    public String toString() {
        return "Bobblehat{" + super.toString() + ", diameterInMm=" + diameterInMm + ", value=" + getValue() + "}";
    }

}
