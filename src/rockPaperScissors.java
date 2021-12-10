//import java.sql.Struct;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

// Now that I'm thinking Straight I should import player, computer


public class rockPaperScissors {

    private static final int rock;
    private static final int paper;
    private static final int scissors;
    public static Scanner scan;



    static {
        scan = new Scanner(System.in);
        rock = 0;
        paper = 1;
        scissors = 2;
    }


    public static void main(String[] args) {
        Random random = new Random();
        int playerV = 0;
        int playerV2 = 1;

//        System.out.println("Who would you like to play with, The Robot?? or another Player??");
//        String playerChoice = scan.nextLine();
//
//        if (


        do {
            int computerV = random.nextInt(3);
            String computerChoice;

            if (computerV == rock){ computerChoice = "rock";}
            else if (computerV == paper) { computerChoice = "paper";}
            else { computerChoice = "scissors";}

            System.out.println("Please enter rock, paper or scissors ");
            String playerChoice = scan.nextLine().toLowerCase();

            switch (playerChoice) {
                case "rock":
                    playerV = rock;
                    break;
                case "paper":
                    playerV = paper;
                    break;
                case "scissors":
                    playerV = scissors;
                    break;
                default:
                    System.out.printf("%s No choice was selected.%n", playerChoice);
                    break;
            }

            System.out.printf("Computer chose %s, player chose %s. %n", computerChoice, playerChoice);

            if (playerV == computerV) {
                System.out.println("Its a draw!!! - ");
            } else if ((playerV - 1 == computerV)
                    || (playerV== rock && computerV == scissors)) {
                System.out.println("Player wins!!!");
            } else {
                System.out.println("The computer wins!!!");
            }
        } while (getYesOrNo());

        scan.close();
        }

    private static boolean getYesOrNo() {
        while (true) {
            Object[] question = new Object[0];
            final PrintStream printf = System.out.printf("%s%n", question);
            String answer = scan.nextLine();
            answer = answer.toLowerCase();
            if (answer.equals("y")) {
                return true;
            }
            if (answer.equals("n")) {
                return false;
            }
        }
    }
}

