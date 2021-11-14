import java.util.Scanner;

public class Exercise8 {
    public static int enterNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number between 5 and 20 (5, 20 included). ");
        int number = sc.nextInt();
        while (number < 5 || number > 20) {
            System.out.println("Please enter a number again. ");
            number = sc.nextInt();
        }
        return number;
    }
    public static void formation(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int number = enterNumber();
        formation(number);

    }
}
