import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean game = true;
        String choice;
        int scorePlayer = 0;
        int scoreComputer = 0;

        System.out.println("Welcome to Rock, Paper, Scissors");
        System.out.println("Please enter R, P, S, or (E)xit");

        while (game) {
            String entry = input.nextLine();

            // I used if statements because casting and multiplication would give a uneven percentage of Paper
            double random = Math.random();
            if (random > 0 && random <= 0.33) {
                choice = "R";
            } else if (random > 0.33 && random <= 0.66) {
                choice = "P";
            } else {
                choice = "S";
            }

            if (entry.equals("E")) {
                game = false;
                System.out.println("You ended the game.");
            } else if ((choice.equals("R") && entry.equals("S")) || (choice.equals("S") && entry.equals("P")) || (choice.equals("P") && entry.equals("R"))) {
                System.out.println("Computer wins with " + choice);
                scoreComputer += 1;
            } else if ((entry.equals("R") && choice.equals("S")) || (entry.equals("S") && choice.equals("P")) || (entry.equals("P") && choice.equals("R"))) {
                System.out.println("Player wins with " + entry + ". Computer chose " + choice);
                scorePlayer += 1;
            } else {
                System.out.println("It's a tie. Computer chose " + choice);
            }
            System.out.println("The score is " + scoreComputer + " (Computer) - " + scorePlayer + " (Player)");
            if (scoreComputer > scorePlayer) {
                System.out.println("Computer wins by " + (scoreComputer - scorePlayer));
            } else if (scoreComputer < scorePlayer) {
                System.out.println("Player wins by " + (scorePlayer - scoreComputer));
            } else {
                System.out.println("The game is a draw");
            }
        }

    }
}
