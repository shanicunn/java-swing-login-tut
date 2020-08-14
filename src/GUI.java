import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Have to manually implement ActionListener and method with override
public class GUI implements ActionListener {
    // Initialize variables as private static here so that they're global
    private static JLabel userLabel;
    private static JLabel pwdLabel;
    private static JTextField userText;
    private static JPasswordField pwdText;
    private static JLabel success;
    private static JButton button;

    public static void main(String[] args) {
        // Frame content
        JPanel panel = new JPanel();

        // Creation of frame
        JFrame frame = new JFrame();
        // Set sizing
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add panel to frame
        frame.add(panel);

        // Panel set-up
        panel.setLayout(null);

        userLabel = new JLabel("Username");
        // Label padding
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        // Create text field with length of 20
        userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        pwdLabel = new JLabel("Password");
        // Label padding x, y, width, height
        pwdLabel.setBounds(10, 50, 80, 25);
        panel.add(pwdLabel);

        pwdText = new JPasswordField(20);
        pwdText.setBounds(100, 50, 165, 25);
        panel.add(pwdText);

        button = new JButton("Login");
        button.setBounds(100, 80, 80, 25);
        button.addActionListener(new GUI());
        panel.add(button);

        // Confirms user login
        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);

        // Set visibility // Place at the bottom of class
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // System.out.println("Button clicked");
        String user = userText.getText();
        String pwd = pwdText.getText();
        // System.out.println(user);
        // System.out.println(pwd);
        if (user.equals("shani") && pwd.equals("purple")) {
            success.setText("Login was successful");
        } else {
            success.setText("Please, try again");
        }
    }
}