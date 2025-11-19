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
    }
}