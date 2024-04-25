package CoolDowns;

import javax.swing.*;
import java.awt.event.*;

public class StrengthPotion implements Runnable {
    private int potionDuration; // Duration of the potion effect in seconds
    private Timer timer;

    public StrengthPotion(int durationInSeconds) {
        this.potionDuration = durationInSeconds;
        this.timer = new Timer(1000, new CountdownListener());
    }

    // Start the potion timer
    public void startTimer() {
        Thread thread = new Thread(this);
        thread.start();
    }

    // Stop the potion timer
    public void stopTimer() {
        timer.stop();
    }

    // Runnable implementation
    @Override
    public void run() {
        timer.start();
    }

    // Listener for countdown events
    private class CountdownListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            potionDuration--; // Decrease the remaining duration

            if (potionDuration <= 0) {
                // Potion effect has expired
                System.out.println("Potion effect expired!");
                stopTimer(); // Stop the timer when the duration reaches zero
            }
        }
    }
}
