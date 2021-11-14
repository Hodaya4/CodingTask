import java.util.Scanner;
/*
The function receives arguments by order and not by name.
 */
public class Exercise5  {
    static double salaryCalc(int status, double hours, int dailyGoal) {
        double salary;
        if (status == 0) {
            salary = ((hours * 50) + (dailyGoal * 250));
        } else {
            salary = ((hours * 200) + (dailyGoal * 250));
        }

        return salary;
    }

    public static void main(String[] args) {
        int answer;

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Hello, are you a junior or a senior?");
            System.out.println("For junior, enter 0. For senior, enter 1. ");
            int status = sc.nextInt();
            System.out.println("How many hours have you worked for the past month? ");
            double hours = sc.nextDouble();
            System.out.println("Out of 30, in how many days have you reached your daily goal? ");
            int dailyGoal = sc.nextInt();
            double salary = salaryCalc(status, hours, dailyGoal);
            System.out.println("Your salary is " + salary);
            System.out.println("Would you like to repeat the process?");
            System.out.println("To repeat, type 1. To quit, type 0.");
            answer = sc.nextInt();
        } while (answer != 0);
        System.out.println("Goodbye!");
    }
}