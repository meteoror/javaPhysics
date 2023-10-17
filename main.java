import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Create a JFrame and configure it
        JFrame window = new JFrame("Game Name");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JLabel (emptyLabel) or any other component you want to add
        JLabel emptyLabel = new JLabel("Hello, World!");

        // Add the component to the JFrame's content pane
        window.getContentPane().add(emptyLabel, BorderLayout.CENTER);

        // Pack the window and make it visible
        window.pack();
        window.setVisible(true);
    }
}
