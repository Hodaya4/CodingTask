import java.util.Scanner;

public class Exercise9 {
    public static boolean division(int chosenNumber, int i) {
        return chosenNumber % i == 0;
    }

    public static boolean primeNumbers(int chosenNumber) {
        int i;
        if(chosenNumber <= 2){
            return false;
        }
        for(i = 2; i < chosenNumber; i++){
            if(division(chosenNumber,i))
                return false;
        }
        return true;
    }

    public static int positiveNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a positive number. ");
        int number = sc.nextInt();
        while (number < 0) {
            System.out.println("Please make sure to enter a positive number. ");
            number = sc.nextInt();
        } return number;
    }

    public static void main(String[] args) {
        int chosenNumber = positiveNumber();

        for (int i = 0; i <= chosenNumber; i++) {
            if (primeNumbers(i))
                System.out.println(i);

        }
        System.out.println("These are the primary numbers. ");
    }
}
