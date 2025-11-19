/**
 *  testing
 * @author Ivan Stolnic
 */


public class TestHeadgear {
    
    public static void main(String[] args) {
        // Test 1: Normal crown
        Crown c1 = new Crown(5);
        System.out.println("Crown with 5 jewels value: " + c1.getValue());
        // Expected: 5 * 200000 = 1,000,000

        // Test 2: Zero jewels
        Crown c2 = new Crown(0);
        System.out.println("Crown with 0 jewels value: " + c2.getValue());
        // Expected: 0.0

        // Test 3: Negative value (should throw exception)
        Crown c3 = new Crown(6);
        System.out.println("Crown with 6 jewels value: " + c3.getValue());

        // Test 4: Negative value (should throw exception)
        try {
            Crown bad = new Crown(-1);
            System.out.println("ERROR: this line should not print");
        } catch (IllegalArgumentException e) {
            System.out.println("Correctly caught exception: " + e.getMessage());
        }

        System.out.println("\n--- Scooter Helmet Tests ---");

        // Test 1: Helmet without visor, p = 1.0
        ScooterHelmet h1 = new ScooterHelmet(1.0, false);
        // Expected: 80 + 1.0 * 400 = 480
        System.out.println("Helmet (no visor, p=1.0) value: " + h1.getValue());

        // Test 2: Helmet with visor, p = 1.0
        ScooterHelmet h2 = new ScooterHelmet(1.0, true);
        // Expected: 160 + 1.0 * 400 = 560
        System.out.println("Helmet (visor, p=1.0) value: " + h2.getValue());

        // Test 3: p = 0, visor = false
        ScooterHelmet h3 = new ScooterHelmet(0.0, false);
        // Expected: 80 + 0 * 400 = 80
        System.out.println("Helmet (no visor, p=0) value: " + h3.getValue());

        // Test 4: p = 2.5, visor = true
        ScooterHelmet h4 = new ScooterHelmet(2.5, true);
        // Expected: 160 + 2.5 * 400 = 160 + 1000 = 1160
        System.out.println("Helmet (visor, p=2.5) value: " + h4.getValue());

        // Test 5: Negative protectionFactor (should throw exception)
        try {
            ScooterHelmet bad = new ScooterHelmet(-1.0, true);
            System.out.println("ERROR: this line should not print");
        } catch (IllegalArgumentException e) {
            System.out.println("Correctly caught exception (negative protection factor): " + e.getMessage());
        }
    }
}