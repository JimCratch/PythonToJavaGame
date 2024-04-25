package Game.MobStats;

import Game.PlayerStats;
import java.util.ArrayList;

public class BanditStats {

    public static int Strength = 3;
    public static int Agility = 4;
    public static int Dexterity = 6;
    public static int Health = 50;
    public static ArrayList<Integer> BanditStats = new ArrayList<>();

    public static void BanditCreationArrayStats() {

        BanditStats.add(Strength);
        BanditStats.add(Agility);
        BanditStats.add(Dexterity);
        BanditStats.add(Health);
    }

    public static void updateHealth(int newHealth) {
        Health = newHealth;
        BanditStats.set(3, Health);
    }
}
