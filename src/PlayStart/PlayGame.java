package PlayStart;

import java.util.Scanner;
import GUI.GameMenu;
import Game.*;
import Fight.FirstFight;
import Game.MobStats.BanditStats;
import javax.swing.*;

public class PlayGame {

    public static Scanner scanner = new Scanner(System.in);

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

        int potionDurationInSeconds = 11;
        StrengthPotion potionTimer = new StrengthPotion(potionDurationInSeconds);

        potionTimer.startTimer();

        */
        GameMenu gamemenu = new GameMenu();
        JOptionPane.showMessageDialog(null,"Minimize this window (cannot be reopened)");
        Thread.sleep(2000);
        GameStart();


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