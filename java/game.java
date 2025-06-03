package Activities;

import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask Player 1
        System.out.print("Player 1, enter your choice (rock/paper/scissors): ");
        String player1Choice = scanner.nextLine().trim().toLowerCase();

        // Ask Player 2
        System.out.print("Player 2, enter your choice (rock/paper/scissors): ");
        String player2Choice = scanner.nextLine().trim().toLowerCase();

        // Validate input
        if (!isValid(player1Choice) || !isValid(player2Choice)) {
            System.out.println("Invalid input by one or both players. Please enter rock, paper, or scissors.");
        } else {
            // Show both choices
            System.out.println("\nPlayer 1 chose: " + player1Choice);
            System.out.println("Player 2 chose: " + player2Choice);

            // Determine result
            String result = determineWinner(player1Choice, player2Choice);
            System.out.println(result);
        }

        
    }

    public static boolean isValid(String choice) {
        return choice.equals("rock") || choice.equals("paper") || choice.equals("scissors");
    }

    public static String determineWinner(String p1, String p2) {
        if (p1.equals(p2)) {
            return "It's a draw!";
        }

        if ((p1.equals("rock") && p2.equals("scissors")) ||
            (p1.equals("scissors") && p2.equals("paper")) ||
            (p1.equals("paper") && p2.equals("rock"))) {
            return "Player 1 wins!";
        } else {
            return "Player 2 wins!";
        }
    }
}
