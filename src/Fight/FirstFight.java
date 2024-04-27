package Fight;

import Game.*;
import Game.MobStats.BanditStats;
import PlayStart.PlayGame;
import PlayerDeath.GameOver;

public class FirstFight {
    public static void FirstFighting() throws InterruptedException {

        System.out.println("You ran into a bandit please defeat him");

        while (BanditStats.BanditStats.get(3) > 0) {

            System.out.println("Will you *attack* or *flee* or use a *potion*");
            String choice = PlayGame.scanner.nextLine();
            switch (choice) {
                case "attack":
                    double attackDamage = Math.random() * ((double) PlayerStats.Strength / 2) + 1;
                    int newHealth = BanditStats.BanditStats.get(3) - (int) attackDamage;
                    if (newHealth < 0) {
                        newHealth = 0;
                    }
                    BanditStats.updateHealth(newHealth);
                    Thread.sleep(1000);
                    if (BanditStats.BanditStats.get(3) > 0 && PlayerStats.Stats.get(3) > 0) {
                        System.out.println("The bandits health is now: " + BanditStats.BanditStats.get(3));
                        double banditattackDamage = Math.random() * ((double) BanditStats.Strength / 2) + 1;
                        int newPlayerHealth = PlayerStats.Stats.get(3) - (int) banditattackDamage;
                        PlayerStats.TookDamage(newPlayerHealth);
                        if (PlayerStats.Stats.get(3) <= 0) {
                            PlayerStats.Health = 0;
                            System.out.println("Your Health is now: " + PlayerStats.Stats.get(3));
                            System.out.println("You have failed to defeat the bandit.");
                            GameOver.Death();
                            break;
                        }
                        if (PlayerStats.Stats.get(3) > 0) {
                            System.out.println("Oh no the bandit struck back your health is now: " + PlayerStats.Stats.get(3));
                        }
                    } else {
                        System.out.println("Congrats on defeating the bandit");
                        break;
                    }
                case "flee":
                    break;
                    //TODO will be changed later
                case "potion":
                    //TODO ill make a potions class later
                default:
                    if (PlayerStats.Stats.get(3) > 0) {
                        System.out.println("Oh no you seem to have fumbled your typing\nand let the bandit strike when you were vulnerable");
                        double banditattackDamage = Math.random() * ((double) BanditStats.Strength / 2) + 1;
                        int newPlayerHealth = PlayerStats.Stats.get(3) - (int) banditattackDamage;
                        PlayerStats.TookDamage(newPlayerHealth);
                        if (PlayerStats.Stats.get(3) <= 0) {
                            PlayerStats.Health = 0;
                            System.out.println("Your Health is now: " + PlayerStats.Stats.get(3));
                            System.out.println("You have failed to defeat the bandit.");
                            GameOver.Death();
                            break;
                        }
                        if (PlayerStats.Stats.get(3) > 0) {
                            System.out.println("Your Health is now: " + PlayerStats.Stats.get(3));
                        }
                    } else {
                        GameOver.Death();
                        break;
                    }
            }
        }
    }
}
