import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        double a = sc.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = sc.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = sc.nextDouble();
        double d = b * b - 4.0 * a * c;
        if (a == 0.0){
            double r1 = -c / b;
            System.out.println("Single solution and its value is" + r1);
        }
        else {
            if (d > 0.0) {
                double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
                double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
                System.out.println("Two solutions and their values are " + r1 + " and " + r2);
            } else if (d == 0.0) {
                double r1 = -b / (2.0 * a);
                System.out.println("Single solution and its value is " + r1);
            } else {
                System.out.println("No solution");
            }
        }
    }
}