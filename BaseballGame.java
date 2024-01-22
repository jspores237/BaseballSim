import java.util.Scanner;


public class BaseballGame {
    public static void main(String[] args) {
        int away = 0;
        int home = 0;
        int inning = 0;
        boolean gamePlaying = true;

        Scanner scnr = new Scanner(System.in);
        System.out.println("Type in Away Team: ");
        String awayTeam = scnr.nextLine();
        System.out.println("Type in Home Team: ");
        String homeTeam = scnr.nextLine(); //what is nextLine()?

        System.out.println("Play Ball!");

        while (gamePlaying) {
            inning++;
            System.out.println("Input " + awayTeam + " runs from the top of inning " + inning);
            int runsAway = scnr.nextInt();

            int runsHome = 0;  // Initialize runsHome

            if (inning < 9 || (inning >= 9 && runsAway + away >= home)) {
                System.out.println("Input " + homeTeam + " runs from the bottom of inning " + inning);
                runsHome = scnr.nextInt();
            } else {
                gamePlaying = false;
                break;
            }

            away += runsAway;
            home += runsHome;

            System.out.println("Score after inning " + inning + " is the " + awayTeam + " " + away + ", the " + homeTeam + " " + home);

            gamePlaying = (inning < 9 || (inning >= 9 && away <= home));
        }

        if (away > home) {
            System.out.println("The " + awayTeam + " win!");
        } else {
            System.out.println("The " + homeTeam + " win!");
        }
        scnr.close();
    }
    public static String addTeam(String team) {
        return team;
    }
}
