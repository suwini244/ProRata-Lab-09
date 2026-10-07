import java.util.Scanner;

public class IT22158840Lab9Q1 { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get coefficients from the user
        System.out.print("Enter value a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter value b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter value c: ");
        double c = scanner.nextDouble();

        // Calculate the determinant (discriminant)
        double determinant = Math.pow(b, 2) - 4 * a * c;

        // Check the nature of the roots based on the determinant
        if (determinant > 0) {
            // Two real and distinct roots
            double sqrt = Math.sqrt(determinant);
            double root1 = (-b + sqrt) / (2 * a);
            double root2 = (-b - sqrt) / (2 * a);
            System.out.println("Roots are real and different:");
            System.out.println("Root 1: " + String.format("%.2f", root1)); // Format to 2 decimal places
            System.out.println("Root 2: " + String.format("%.2f", root2)); // Format to 2 decimal places
        } else if (determinant == 0) {
            // One real root (both roots are equal)
            double root = -b / (2 * a);
            System.out.println("Roots are real and equal:");
            System.out.println("Root: " + String.format("%.2f", root)); // Format to 2 decimal places
        } else {
            // Complex roots (determinant < 0)
            double realPart = -b / (2 * a); // The real part of the complex roots
            double imaginaryPart = Math.sqrt(-determinant) / (2 * a); // The imaginary part
            System.out.println("Roots are complex and different:");
            System.out.println("Root 1: " + String.format("%.2f", realPart) + " + " + String.format("%.2f", imaginaryPart) + "i");
            System.out.println("Root 2: " + String.format("%.2f", realPart) + " - " + String.format("%.2f", imaginaryPart) + "i");
        }
    }
}
