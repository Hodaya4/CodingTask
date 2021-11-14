import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[3];
        System.out.println("Please enter a number: ");
        numbers[0] = sc.nextInt();
        System.out.println("Please enter a second number: ");
        numbers[1] = sc.nextInt();
        System.out.println("Please enter a third number: ");
        numbers[2] = sc.nextInt();
        Arrays.sort(numbers);
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
