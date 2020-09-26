import java.util.Scanner;

public class University
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your last name?");
        String lastname = scan.next();

        System.out.println("What is your SAT score?");
        boolean isOkay = true;
        int sat = scan.nextInt();
        int elites = 0;
        int solids = 0;
        int accepts = 0;
        if (sat >= 1500) {
            elites = elites + 1;
        } else if (sat >= 1400) {
            solids = solids + 1;
        } else if (sat >= 1200) {
            accepts = accepts + 1;
        } else {
            isOkay = false;
        }

        System.out.println("What is your class rank percentile?");
        int rank = scan.nextInt();
        if (rank >= 95) {
            elites = elites + 1;
        } else if (rank >= 90) {
            solids = solids + 1;
        } else if (rank >= 85) {
            accepts = accepts + 1;
        } else {
            isOkay = false;
        }

        System.out.println("How many awards have you earned?");
        int awards = scan.nextInt();
        if (awards >= 10) {
            elites = elites + 1;
        } else if (awards >= 8) {
            solids = solids + 1;
        } else if (awards >= 3) {
            accepts = accepts + 1;
        } else {
            isOkay = false;
        }

        System.out.println("Where do you live?");
        String home = scan.next();
        if (home == "Colorado") {
            elites = elites + 1;
        } else if (home == "Florida") {
            isOkay = false;
        } else {
            accepts = accepts + 1;
        }
        scan.close();


        if (isOkay) {
            if ((elites >= 1) || (solids >= 2) || (lastname == "Padjen")) {
                System.out.println("You meet the requirements! Welcome to Padjen university!");
            } else {
                System.out.println("Sorry, you do not meet the requirements.");
            }
        } else {
            System.out.println("Sorry, one of your metrics is lower than acceptable.");
        }


    }
}