import java.util.Scanner;
import Game.*;
import CoolDowns.StrengthPotion;
import Fight.FirstFight;
import Game.MobStats.BanditStats;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        PlayerStats.PlayerCreationArrayStats();
        BanditStats.BanditCreationArrayStats();
        /*
        PlayerStats.Agility = 5;


        ArrayList<Integer> Stats = new ArrayList<>();

        Stats.add(PlayerStats.Strength);
        Stats.add(PlayerStats.Agility);
        Stats.add(PlayerStats.Dexterity);
        Stats.add(PlayerStats.Health);
        Stats.add(PlayerStats.Remaining_Points);

        System.out.println("Strength: " + Stats.get(0) + "\nAgility: " + Stats.get(1) + "\nDexterity: " + Stats.get(2) + "\nHealth: " + Stats.get(3) + "\nRemaining Points: " + Stats.get(4));

        Stats.set(0, 50);
        Thread.sleep(2000);

        System.out.println("Strength: " + Stats.get(0) + "\nAgility: " + Stats.get(1) + "\nDexterity: " + Stats.get(2) + "\nHealth: " + Stats.get(3) + "\nRemaining Points: " + Stats.get(4));

        int potionDurationInSeconds = 11; // Example: 60 seconds duration
        StrengthPotion potionTimer = new StrengthPotion(potionDurationInSeconds);

        // Start the potion timer in a separate thread
        potionTimer.startTimer();

        // Continue executing your game logic here

        */
        GameStart();
        while (true) {
            try {
                // Simulating game activities for a short interval
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        //GameStart();
    }

    private static void GameStart() throws InterruptedException {
        System.out.println("Would you like to play the game? y/n: ");
        String StartGame = scanner.nextLine();
        if (StartGame.contains("y")) {
            System.out.println("Welcome to the game please enjoy");
            Thread.sleep(1000);
            FirstFight.FirstFighting();

        } else if (StartGame.contains("n")) {
            for (int i = 0; i < 9; i++) {
                System.out.println(".........................");
            }
            System.out.println("......Shutting Down......");
            Thread.sleep(100);
            for (int i = 0; i < 9; i++) {
                System.out.println(".........................");
            }
        } else {
            GameStart();
        }
    }
}