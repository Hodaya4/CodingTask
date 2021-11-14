import java.util.Scanner;

public class Exercise6 {
    static void aProgression(int firstVariable, int difference, int howManyVariables) {
        for (int i = 0; i < howManyVariables; i++) {
            System.out.println(firstVariable);
            firstVariable += difference;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the first Variable of the arithmetic progression: ");
        int firstVariable = sc.nextInt();
        System.out.print("What number is the difference between variables: ");
        int difference = sc.nextInt();
        System.out.print("What is the number of variables in the arithmetic progression? ");
        int howManyVariables = sc.nextInt();
        aProgression(firstVariable, difference, howManyVariables);
    }
}
