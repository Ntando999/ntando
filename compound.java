
 import java.util.Scanner;
 public class compound{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the principal amount:");
        double P = scanner.nextDouble();

        System.out.println("Enter the annual interest rate (in decimal form):");
        double I = scanner.nextDouble();
        I = I /100;

        System.out.println("Enter the number of years:");
        int N = scanner.nextInt();

        double A = P * Math.pow(1 + I, N);
        
        System.out.println("The future value after " + N + " years is: " + A);

        scanner.close();
 }
}

