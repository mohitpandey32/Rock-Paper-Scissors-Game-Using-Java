import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissors {
    public static void main(String args[]) {
        // Create instance of Random class
        Random rand = new Random();

        Scanner sc = new Scanner(System.in);
        System.out.println("-----WELCOME LET'S PLAY-----");
        System.out.print("PLEASE ENTER YOUR NAME: ");
        String username = sc.next();

        System.out.println("Hello " + username);

        boolean playAgain = true;
        while (playAgain) {
            int rand_int1 = rand.nextInt(3);

            System.out.println("-----Computer has made its choice. Your turn!-----");
            System.out.print("0.ROCK , 1.Paper , 2.Scissor: ");
            int myturn = sc.nextInt();
            System.out.println("Computer Turn: " + rand_int1); // Print computer's turn

            if (rand_int1 == myturn) {
                System.out.println("DRAW MATCH! PLAY AGAIN");
                System.out.println("1. PLAY AGAIN   2. EXIT");
                int choice = sc.nextInt();
                if (choice != 1) {
                    playAgain = false;
                }
            } 
			else if (rand_int1 == 0 && myturn == 1 || 
                       rand_int1 == 1 && myturn == 2 || 
                       rand_int1 == 2 && myturn == 0) {
                System.out.println("YOU WIN! CONGRATULATIONS " + username);
                playAgain = false;
            } 
			else {
                System.out.println("COMPUTER WINS! PLAY AGAIN");
                playAgain = false;
            }

            if (!playAgain) {
                System.out.print("1. PLAY AGAIN   2. EXIT: ");
                int choice = sc.nextInt();
                if (choice == 1) {
                    playAgain = true;
                }
            }
        }

        System.out.println("THANK YOU FOR PLAYING!");
        sc.close();
    }
}
