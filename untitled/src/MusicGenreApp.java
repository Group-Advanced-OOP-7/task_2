import javax.swing.*;
import java.awt.*;

public class MusicGenreApp {

    public void metod() {
        JFrame frame = new JFrame("Music Genre Interface");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());
        frame.setLocationRelativeTo(null);
        JLabel titleLabel = new JLabel("My Music Genre", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        frame.add(titleLabel, BorderLayout.NORTH);
        JButton rapButton = new JButton("Rap Music");
        rapButton.setBackground(Color.BLACK);
        rapButton.setForeground(Color.WHITE);
        rapButton.setBorderPainted(false);
        rapButton.setFocusPainted(false);
        JButton gospelButton = new JButton("Gospel Music");
        gospelButton.setBackground(new Color(34, 139, 34));
        gospelButton.setForeground(Color.WHITE);
        gospelButton.setBorderPainted(false);
        gospelButton.setFocusPainted(false);
        JButton balladsButton = new JButton("Ballads Music");
        balladsButton.setBackground(new Color(70, 130, 180)); // steel blue
        balladsButton.setForeground(Color.WHITE);
        balladsButton.setBorderPainted(false);
        balladsButton.setFocusPainted(false);
        frame.add(rapButton, BorderLayout.SOUTH);
        frame.add(gospelButton, BorderLayout.WEST);
        frame.add(balladsButton, BorderLayout.EAST);
        rapButton.addActionListener(e ->
                JOptionPane.showMessageDialog(frame, "You selected Rap Music!"));
        gospelButton.addActionListener(e ->
                JOptionPane.showMessageDialog(frame, "You selected Gospel Music!"));
        balladsButton.addActionListener(e ->
                JOptionPane.showMessageDialog(frame, "You selected Ballads Music!"));

        frame.setVisible(true);

    }
}




