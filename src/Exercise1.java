import java.util.Scanner;
/*
Write a program that receives an integer from the user , and prints its absolute value on the screen .
*/
public class Exercise1 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = sc.nextInt();
        if (number > 0) {
            System.out.println("The absolute value of " + number + " is " + number);
        } else {
            int result = number * -1;
            System.out.println("The absolute value of " + number + " is " + result);
        }
    }
}
