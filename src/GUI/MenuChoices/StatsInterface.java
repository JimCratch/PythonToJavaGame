package GUI.MenuChoices;

import GUI.GameMenu;
import Game.PlayerStats;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class StatsInterface extends JFrame {
    private final Map<String, Integer> stats;

    public StatsInterface() {
        stats = new HashMap<>();
        stats.put("Strength", PlayerStats.Strength);
        stats.put("Agility", PlayerStats.Agility);
        stats.put("Dexterity", PlayerStats.Dexterity);
        stats.put("Health", PlayerStats.Health);

        setTitle("Stats Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        JPanel titlePanel = new JPanel();
        titlePanel.setBackground(new Color(30, 30, 30));
        JLabel titleLabel = new JLabel("Player Stats");
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titlePanel.add(titleLabel);
        contentPane.add(titlePanel, BorderLayout.NORTH);

        JPanel statsPanel = new JPanel();
        statsPanel.setLayout(new GridLayout(5, 3, 10, 10));
        statsPanel.setBackground(new Color(60, 60, 60));

        addStatWithButton(statsPanel, "Strength");
        addStatWithButton(statsPanel, "Agility");
        addStatWithButton(statsPanel, "Dexterity");
        addStatWithButton(statsPanel, "Health");

        contentPane.add(statsPanel, BorderLayout.CENTER);

        JPanel returnPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton returnButton = new JButton("Return");
        returnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                GameMenu gamemenu = new GameMenu();
                dispose();
            }
        });
        returnPanel.add(returnButton);
        contentPane.add(returnPanel, BorderLayout.SOUTH);

        pack();
        setSize(1600, 800);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void addStatWithButton(JPanel panel, String statName) {
        JLabel statLabel = new JLabel(statName + ":");
        statLabel.setForeground(Color.WHITE);
        statLabel.setFont(new Font("Arial", Font.BOLD, 16));

        JLabel valueLabel = new JLabel(String.valueOf(stats.get(statName)));
        valueLabel.setForeground(Color.WHITE);
        valueLabel.setFont(new Font("Arial", Font.BOLD, 16));

        JButton incrementButton = new JButton("+1");
        incrementButton.addActionListener(new IncrementActionListener(statName, valueLabel));

        panel.add(statLabel);
        panel.add(valueLabel);
        panel.add(incrementButton);
    }

    private class IncrementActionListener implements ActionListener {
        private final String statName;
        private final JLabel valueLabel;

        public IncrementActionListener(String statName, JLabel valueLabel) {
            this.statName = statName;
            this.valueLabel = valueLabel;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (PlayerStats.Remaining_Points > 0) {
                int newValue = stats.get(statName) + 1;
                stats.put(statName, newValue);
                valueLabel.setText(String.valueOf(newValue));
                PlayerStats.updateStat(statName, newValue);
            }
        }
    }
}