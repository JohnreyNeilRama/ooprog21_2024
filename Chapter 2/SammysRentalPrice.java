import java.util.Scanner;

public class SammysRentalPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display Sammy's motto
        System.out.println("Sammy's Seashore Supplies: Your fun begins here!");
        
        // Asking the costumer for the number of minutes rented
        System.out.print("Enter the number of minutes you rented the equipment: ");
        int minutesRented = scanner.nextInt();
        
        // Calculate the number of hours and additional minutes
        int hoursRented = minutesRented / 60;
        int additionalMinutes = minutesRented % 60;
        
        // Calculate the total rental cost
        double totalCost = (hoursRented * 40.0) + (additionalMinutes * 1.0);
        
        // Display the results
        System.out.println("Hours rented: " + hoursRented);
        System.out.println("Minutes rented: " + additionalMinutes);
        System.out.println("Total price: $" + totalCost);
        
        scanner.close();
    }
}
