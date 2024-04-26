package Fight;

import Game.*;
import Game.MobStats.BanditStats;

public class FirstFight {

    public static void FirstFighting() throws InterruptedException {

        System.out.println("You ran into a bandit please defeat him");
        while (BanditStats.BanditStats.get(3) > 0) {
            double attackDamage = Math.random() * ((double) PlayerStats.Strength / 2) + 1;
            int newHealth = BanditStats.BanditStats.get(3) - (int) attackDamage;
            if (newHealth < 0) {
                newHealth = 0;
            }
            BanditStats.updateHealth(newHealth);
            Thread.sleep(1000);
            System.out.println("\n\nStrength: " + BanditStats.BanditStats.get(0) + "\nAgility: " +
                    BanditStats.BanditStats.get(1) + "\nDexterity: " + BanditStats.BanditStats.get(2) +
                    "\nHealth: " + BanditStats.BanditStats.get(3));
        }
    }
}
