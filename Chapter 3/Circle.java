public class Circle {

    // Static variables for radius, diameter, and area
    static double radius;
    static double diameter;
    static double area;

    // Constructor to initialize radius and calculate diameter and area
    public Circle() {
        radius = 1;
        diameter = 2 * radius;
        area = Math.PI * radius * radius;
    }

    // Method to set radius and recalculate diameter and area
    public static void setRadius(double rad) {
        radius = rad;
        diameter = 2 * radius;
        area = Math.PI * radius * radius;
    }

    // Getter method to return the radius
    public static double getRadius() {
        return radius;
    }

    // Getter method to return the diameter
    public static double getDiameter() {
        return diameter;
    }

    // Getter method to return the area
    public static double getArea() {
        return area;
    }
}
