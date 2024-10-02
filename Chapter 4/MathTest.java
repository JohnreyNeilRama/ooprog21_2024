public class MathTest {
    public static void main(String[] args) {
        // sqrt method
        double number = 37;
        double radians = 4.71239;  
        double value = 22.9;
        int a = 68;
        int b = 71;

        // Display results of various Math methods
        System.out.println("SQRT: " + Math.sqrt(number));           // Square root of 37
        System.out.println("SIN: " + Math.sin(radians));            // Sine of ~270 degrees (4.71239 radians)
        System.out.println("COS: " + Math.cos(radians));            // Cosine of ~270 degrees (4.71239 radians)
        System.out.println("FLOOR: " + Math.floor(value));          // Floor of 22.9
        System.out.println("CEIL: " + Math.ceil(value));            // Ceil of 22.9
        System.out.println("ROUND: " + Math.round(value));          // Round 22.9
        System.out.println("MAX: " + Math.max(a, b));               // Maximum of 68 and 71
        System.out.println("MIN: " + Math.min(a, b));               // Minimum of 68 and 71
        System.out.println("RANDOM: " + Math.random());   
     
    }
}
