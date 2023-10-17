import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame("Game Name");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel emptyLabel = new JLabel("Hello, World!");
        window.getContentPane().add(emptyLabel, BorderLayout.CENTER);
        window.pack();
        window.setVisible(true);
    }
}
