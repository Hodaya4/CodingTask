import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int numberOne = sc.nextInt();
        System.out.println("Please enter a second number: ");
        int numberTwo = sc.nextInt();
        if ((numberOne + numberTwo) % 2 == 0 ) {
            System.out.println("The score of these two numbers is even.");
        } else {
            System.out.println("The score of these two numbers is odd.");
        }
    }
}
