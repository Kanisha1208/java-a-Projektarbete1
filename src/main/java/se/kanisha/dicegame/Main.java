package se.kanisha.dicegame;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scannerA = new Scanner(System.in);
        // Scanner scannerB = new Scanner(System.in);
        Random random = new Random();


        System.out.println("Player A, Enter your name");
        //String playerNameA = scannerA.nextLine();
        // PlayerInfo playerNameA = new PlayerInfo(playerNameA);
        PlayerInfo playerNameA = new PlayerInfo(scannerA.nextLine());

        System.out.println("Player B, Enter your name");
        // String playerNameB = scannerB.nextLine();
        // PlayerInfo playerNameB = new PlayerInfo(String playerNameA);
        PlayerInfo playerNameB = new PlayerInfo(scannerA.nextLine());

       int scoreA1 = random.nextInt(6) + 1; // Turn 1st
       int scoreA2 = random.nextInt(6) + 1; // Turn 2nd
       int totalScoreA = scoreA1 + scoreA2;        //  Sum of both turns

        int scoreB1 = random.nextInt(6) + 1; // Turn 1st
        int scoreB2 = random.nextInt(6) + 1; // Turn 2nd
        int totalScoreB = scoreB1 + scoreB2;       //  sum of both turns

        System.out.println("Player A is: " + playerNameA.getPlayerName() + " and his score is:" + totalScoreA);
        System.out.println("Player B is: " + playerNameB.getPlayerName() + " and his score is:" + totalScoreB);

        if (totalScoreA > totalScoreB) {
            System.out.println("\n" + playerNameA.getPlayerName() + "wins!" + playerNameA.getPlayerName() + "'s Total score is: " + totalScoreA);
            System.out.println("\n" + playerNameB.getPlayerName() + "lose!" + playerNameB.getPlayerName()+ "'s Total score is: " + totalScoreB);
        }
        else if (totalScoreB > totalScoreA) {
            System.out.println("\n" + playerNameB.getPlayerName() + "wins!" + playerNameB.getPlayerName() + "'s Total score is: " + totalScoreB);
            System.out.println("\n" + playerNameA.getPlayerName()+ "lose!"  + playerNameA.getPlayerName() + "'s Total score is: " + totalScoreA);
        }
        else  {
            System.out.println("\n"+ "Its a tie! Both "+ playerNameA.getPlayerName() + " and " + playerNameB.getPlayerName()+ "have scored: "+ "equal");

        }

        }
    }


