package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import GUI.MenuChoices.StatsInterface;
public class GameMenu extends JFrame implements ActionListener {
    private JButton statsButton, inventoryButton, quitButton;

    public GameMenu() {
        setTitle("Game Menu");
        setSize(1600, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        statsButton = new JButton("Stats Menu");
        inventoryButton = new JButton("Inventory");
        quitButton = new JButton("Quit Menu");

        statsButton.addActionListener(this);
        inventoryButton.addActionListener(this);
        quitButton.addActionListener(this);

        panel.add(statsButton);
        panel.add(inventoryButton);
        panel.add(quitButton);

        add(panel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == statsButton) {
            StatsInterface statsinterface = new StatsInterface();
            dispose();
        } else if (e.getSource() == inventoryButton) {
            JOptionPane.showMessageDialog(this, "Inventory Selected");
            dispose();
        } else if (e.getSource() == quitButton) {
            int option = JOptionPane.showConfirmDialog(this, "Are you sure you want to quit the menu?", "Quit Menu", JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION) {
                dispose();
            }
        }
    }
}
