package Homework2;

import java.util.ArrayList;
import java.util.Scanner;

public class League {
    private static final ArrayList<Game> games = new ArrayList<>();
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        while(true){
            System.out.println("""
                
                        1.Add Game
                        2.Team Performance
                        3.Exit
                        Select: """);
            String choice = in.nextLine().trim();



            switch(choice){
                case "1" -> addGame();
                case "2" -> showStats();
                case "0" -> System.out.println("Exit");
                default -> System.out.println("Invalid choice");

            }

        }
    }
    private static void addGame() {
        System.out.print("Home team: ");
        String homeTeamName = in.nextLine().trim();
        System.out.print("Away team: ");
        String awayTeamName = in.nextLine().trim();
        if (homeTeamName.equalsIgnoreCase(awayTeamName)) {
            System.out.println("Teams must be different");
            return;
        }
        int hg = askGoals("Goals by " + homeTeamName + ": ");
        int ag = askGoals("Goals by " + awayTeamName + ": ");

        games.add(new Game(homeTeamName, awayTeamName, hg, ag));
        System.out.println("Game saved");
    }

    private static void showStats() {
        System.out.print("Team name: ");
        String t = in.nextLine().trim();
        int wins = 0, draws = 0, losses = 0;

        for (Game g : games) {
            boolean isHome = g.home.equalsIgnoreCase(t);
            boolean isAway = g.away.equalsIgnoreCase(t);
            if (!isHome && !isAway) continue;

            int gf = isHome ? g.homeScore : g.awayScore;
            int ga = isHome ? g.awayScore : g.homeScore;

            if (gf > ga)      wins++;
            else if (gf < ga) losses++;
            else              draws++;
        }

        if (wins + draws + losses == 0) {
            System.out.println("No games for " + t + ".");
        } else {
            System.out.printf("""
                    %s
                      Wins : %d
                      Draws: %d
                      Losses: %d%n%n""", t, wins, draws, losses);
        }
    }

    private static int askGoals(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                int g = Integer.parseInt(in.nextLine().trim());
                if (g >= 0) return g;
            } catch (NumberFormatException ignored) {
                System.out.println("Enter a valid number.");
            }
        }
    }


}

