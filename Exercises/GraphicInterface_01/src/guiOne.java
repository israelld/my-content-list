import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class guiOne {
    private JButton button1;
    private JPanel panel1;
    private JTextField user;
    private JPasswordField passwordField1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("guiOne");
        frame.setContentPane(new guiOne().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public guiOne() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

}
