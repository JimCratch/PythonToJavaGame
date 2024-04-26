package Game;

import java.util.ArrayList;

public class PlayerStats {

    public static int Strength = 10;
    public static int Agility = 10;
    public static int Dexterity = 10;
    public static int Health = 100;
    public static int Remaining_Points = 15;
    public static ArrayList<Integer> Stats = new ArrayList<>();

    public static void PlayerCreationArrayStats() {

        Stats.add(PlayerStats.Strength);
        Stats.add(PlayerStats.Agility);
        Stats.add(PlayerStats.Dexterity);
        Stats.add(PlayerStats.Health);
        Stats.add(PlayerStats.Remaining_Points);
    }

    public static void updateStat(String statName, int newValue) {
        switch (statName) {
            case "Strength":
                Strength = newValue;
                Stats.set(0, newValue);
                Remaining_Points--;
                break;
            case "Agility":
                Agility = newValue;
                Stats.set(1, newValue);
                Remaining_Points--;
                break;
            case "Dexterity":
                Dexterity = newValue;
                Stats.set(2, newValue);
                Remaining_Points--;
                break;
            case "Health":
                Health = newValue;
                Stats.set(3, newValue);
                Remaining_Points--;
                break;
            default:
                break;
        }
    }
}
