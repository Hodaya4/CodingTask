import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What day would you arrive on? ");
        System.out.println("Sunday - 1, Monday - 2, Tuesday - 3, Wednesday - 4, ");
        System.out.println("Thursday - 5, Friday - 6, Saturday - 7.");
        int day = sc.nextInt();
        System.out.println("What is the earliest hour you can arrive at? ");
        int earliestHour = sc.nextInt();
        System.out.println("What is the latest hour you can arrive at? ");
        int latestHour = sc.nextInt();


        switch (day) {
            case 1:
            case 2:
            case 4:
            case 5: {
                if (earliestHour < 0 || earliestHour > 23 || latestHour < 0 || latestHour > 23) {
                    System.out.println("ERROR : Invalid hour. ");
                    break;
                }
                if (latestHour < earliestHour) {
                    System.out.println("ERROR : Earliest hour cannot take place after latest hour.");
                    break;
                }
                if (earliestHour < 9 && earliestHour > 0 || latestHour > 17 && latestHour < 23) {
                    System.out.println("The IRS' reception hours today are; 09:00-17:00. ");
                    return;
                }
                System.out.println("Your request has been accepted. ");
                break;
            }
            case 3: {
                if (earliestHour < 0 || earliestHour > 23 || latestHour < 0 || latestHour > 23) {
                    System.out.println("ERROR : Invalid hour. ");
                    break;
                }
                if (latestHour < earliestHour) {
                    System.out.println("ERROR : Earliest hour cannot take place after latest hour.");
                    break;
                }
                if (earliestHour < 8 && earliestHour > 0 || latestHour > 12 && latestHour < 23) {
                    System.out.println("The IRS' reception hours today are; 08:00-12:00. ");
                    return;
                }
                System.out.println("Your request has been accepted. ");
            }
            case 6:
            case 7: {
                System.out.println("The IRS is closed on Friday and Saturday. ");
                break;
            }
            default: {
                System.out.println("ERROR : Incorrect day. ");
                break;
            }
        }
    }
}