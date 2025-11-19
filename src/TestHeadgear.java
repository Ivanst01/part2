/**
 *  testing
 * @author Ivan Stolnic
 */


public class TestHeadgear {
    
    public static void main(String[] args) {
        
        System.out.println("=== CROWN TESTS ===");
        testCrown();

        System.out.println("=== sCOOTER HELMET TESTS ===");
        testScooterHelmet();

        System.out.println("=== BOOBLE HAT TESTS ===");
        testBobbleHat();

        // System.out.println("=== TOTAL VALUE TESTS ===");
        // testTotalValue();
    }

    private static void testCrown() {

        //Test 1: normal value
        Crown c1 = new Crown(5);
        System.out.println("Crown(5) value: " + c1.getValue() + " (expected 1000000.0)");
        System.out.println("Crown(5) toString: " + c1.toString());
        System.out.println();


        //Test 2: zero jewels
        Crown c2 = new Crown(0);
        System.out.println("Crown(0) value: " + c2.getValue() + " (expected 0.0)");
        System.out.println("Crown(0) toString: " + c2.toString());
        System.out.println();

        // Test 3: Larger number of jewels
        Crown c3 = new Crown(10);
        System.out.println("Crown(10) value: " + c3.getValue() + " (expected 2000000.0)");
        System.out.println();

        // Test 4: Negative jewels should throw IllegalArgumentException
        try {
            Crown bad = new Crown(-1);
            System.out.println("ERROR: Crown(-1) should have thrown an exception.");
        } catch (IllegalArgumentException e) {
            System.out.println("Correctly caught exception for Crown(-1): " + e.getMessage());
        }
        System.out.println();

    }

        private static void testScooterHelmet() {
        // Test 1: No visor, p = 1.0 → 80 + 1 * 400 = 480
        ScooterHelmet h1 = new ScooterHelmet(1.0, false);
        System.out.println("Helmet(p=1.0, no visor) value: " + h1.getValue() + " (expected 480.0)");
        System.out.println("Helmet(p=1.0, no visor) toString: " + h1.toString());
        System.out.println();

        // Test 2: With visor, p = 1.0 → 160 + 1 * 400 = 560
        ScooterHelmet h2 = new ScooterHelmet(1.0, true);
        System.out.println("Helmet(p=1.0, visor) value: " + h2.getValue() + " (expected 560.0)");
        System.out.println("Helmet(p=1.0, visor) toString: " + h2.toString());
        System.out.println();

        // Test 3: p = 0, no visor → 80
        ScooterHelmet h3 = new ScooterHelmet(0.0, false);
        System.out.println("Helmet(p=0.0, no visor) value: " + h3.getValue() + " (expected 80.0)");
        System.out.println();

        // Test 4: p = 2.5, visor → 160 + 2.5 * 400 = 1160
        ScooterHelmet h4 = new ScooterHelmet(2.5, true);
        System.out.println("Helmet(p=2.5, visor) value: " + h4.getValue() + " (expected 1160.0)");
        System.out.println();

        // Test 5: Negative protection factor should throw exception
        try {
            ScooterHelmet bad = new ScooterHelmet(-0.5, true);
            System.out.println("ERROR: Helmet(p=-0.5, visor) should have thrown an exception.");
        } catch (IllegalArgumentException e) {
            System.out.println("Correctly caught exception for negative protectionFactor: " + e.getMessage());
        }
        System.out.println();
    }

    private static void testBobbleHat() {
        // Test 1: p = 1.0, diameter = 10 → 10 * 4 * 1 = 40
        BobbleHat b1 = new BobbleHat(1.0, 10);
        System.out.println("BobbleHat(p=1.0, d=10) value: " + b1.getValue() + " (expected 40.0)");
        System.out.println("BobbleHat(p=1.0, d=10) toString: " + b1.toString());
        System.out.println();

        // Test 2: p = 2.0, diameter = 5 → 5 * 4 * 2 = 40
        BobbleHat b2 = new BobbleHat(2.0, 5);
        System.out.println("BobbleHat(p=2.0, d=5) value: " + b2.getValue() + " (expected 40.0)");
        System.out.println();

        // Test 3: Zero diameter → value 0
        BobbleHat b3 = new BobbleHat(1.5, 0);
        System.out.println("BobbleHat(p=1.5, d=0) value: " + b3.getValue() + " (expected 0.0)");
        System.out.println();

        // Test 4: Negative diameter should throw exception
        try {
            BobbleHat badDiameter = new BobbleHat(1.0, -3);
            System.out.println("ERROR: BobbleHat(p=1.0, d=-3) should have thrown an exception.");
        } catch (IllegalArgumentException e) {
            System.out.println("Correctly caught exception for negative diameter: " + e.getMessage());
        }
        System.out.println();

        // Test 5: Negative protection factor should throw from superclass
        try {
            BobbleHat badProtection = new BobbleHat(-1.0, 10);
            System.out.println("ERROR: BobbleHat(p=-1.0, d=10) should have thrown an exception.");
        } catch (IllegalArgumentException e) {
            System.out.println("Correctly caught exception for negative protectionFactor: " + e.getMessage());
        }
        System.out.println();
    }


}