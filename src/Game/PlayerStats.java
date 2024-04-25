package Game;

import java.util.ArrayList;

public class PlayerStats {

    public static int Strength = 10;
    public static int Agility = 10;
    public static int Dexterity = 10;
    public static int Health = 100;
    public static int Remaining_Points = 0;
    public static ArrayList<Integer> Stats = new ArrayList<>();

    public static void PlayerCreationArrayStats() {

        Stats.add(PlayerStats.Strength);
        Stats.add(PlayerStats.Agility);
        Stats.add(PlayerStats.Dexterity);
        Stats.add(PlayerStats.Health);
        Stats.add(PlayerStats.Remaining_Points);
    }
}
