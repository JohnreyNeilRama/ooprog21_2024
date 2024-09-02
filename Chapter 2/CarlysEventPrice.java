import java.util.Scanner;

public class CarlysEventPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Display the company motto
        System.out.println("Carly's Catering: We make any event a great success!");
        
        // Prompt the user for the number of guests
        System.out.print("Enter the number of guests attending the event: ");
        int numberOfGuests = scanner.nextInt();
        
        // Define the price per guest
        final double PRICE_PER_PERSON = 35.0;
        
        // Calculate the total price
        double totalPrice = numberOfGuests * PRICE_PER_PERSON;
        
        // Determine if the event is large
        boolean isLargeEvent = numberOfGuests >= 50;
        
        // Details
        System.out.println("Number of guests: " + numberOfGuests);
        System.out.println("Price per guest: $" + PRICE_PER_PERSON);
        System.out.println("Total price: $" + totalPrice);
        System.out.println("Is this a large event? " + (isLargeEvent ? "True" : "False"));
        
        scanner.close();
    }
}
