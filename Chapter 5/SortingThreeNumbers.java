import java.util.Scanner;

public class SortingThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Ask the user to input three integers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Output numbers in ascending order
        if (num1 <= num2 && num1 <= num3) {
            if (num2 <= num3) {
                System.out.println("Numbers in ascending order: " + num1 + " " + num2 + " " + num3);
            } else {
                System.out.println("Numbers in ascending order: " + num1 + " " + num3 + " " + num2);
            }
        } else if (num2 <= num1 && num2 <= num3) {
            if (num1 <= num3) {
                System.out.println("Numbers in ascending order: " + num2 + " " + num1 + " " + num3);
            } else {
                System.out.println("Numbers in ascending order: " + num2 + " " + num3 + " " + num1);
            }
        } else {
            if (num1 <= num2) {
                System.out.println("Numbers in ascending order: " + num3 + " " + num1 + " " + num2);
            } else {
                System.out.println("Numbers in ascending order: " + num3 + " " + num2 + " " + num1);
            }
        }
        
        scanner.close();
    }
}
