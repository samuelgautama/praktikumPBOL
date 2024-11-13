import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Box;
import javax.swing.border.EmptyBorder;

public class Tugas3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Form by Samuel_056");
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CardLayout card = new CardLayout();
        frame.setLayout(card);

        // Panel 1  
        JPanel panel1 = new JPanel();
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        panel1.setBorder(new EmptyBorder(25, 25, 25, 25));
        
        JLabel signupLabel = new JLabel("SIGN UP");
        signupLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        signupLabel.setFont(new Font("Poppins", Font.BOLD, 28));
        signupLabel.setForeground(new Color(221, 84, 49));

        JPanel panelForm1 = new JPanel(new GridBagLayout());
        panelForm1.setAlignmentX(Component.CENTER_ALIGNMENT);
        panelForm1.setOpaque(false);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        JLabel fullnameLabel = new JLabel("Fullname");
        panelForm1.add(fullnameLabel, gbc);

        gbc.gridy++;
        JTextField fullnameField = new JTextField(20);
        panelForm1.add(fullnameField, gbc);

        gbc.gridy++;
        JLabel emailLabel1 = new JLabel("Email");
        panelForm1.add(emailLabel1, gbc);

        gbc.gridy++;
        JTextField emailField1 = new JTextField(20);
        panelForm1.add(emailField1, gbc);

        gbc.gridy++;
        JLabel passwordLabel1 = new JLabel("Password");          
        panelForm1.add(passwordLabel1, gbc);

        gbc.gridy++;
        JPasswordField passwordField1 = new JPasswordField(20);
        panelForm1.add(passwordField1, gbc);

        JButton signupButton = new JButton("Sign Up");
        signupButton.setBackground(new Color(104, 199, 193));
        signupButton.setForeground(Color.WHITE);
        signupButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        JPanel panelBottom1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel haveaccLabel = new JLabel("I've an account");
        JButton haveaccButton = new JButton("Login");

        haveaccButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(frame.getContentPane(), "noaccButton");
            }
        });

        panelBottom1.add(haveaccLabel);
        panelBottom1.add(haveaccButton);

        panel1.add(signupLabel);
        panel1.add(Box.createVerticalStrut(20));
        panel1.add(panelForm1);
        panel1.add(Box.createVerticalStrut(20));
        panel1.add(signupButton);
        panel1.add(Box.createVerticalStrut(10));
        panel1.add(panelBottom1);

        // Panel 2
        JPanel panel2 = new JPanel();
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
        panel2.setBorder(new EmptyBorder(20, 20, 20, 20));

        JLabel loginLabel = new JLabel("LOGIN");
        loginLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        loginLabel.setFont(new Font("Poppins", Font.BOLD, 28));
        loginLabel.setForeground(new Color(104, 199, 193));

        JPanel panelForm2 = new JPanel(new GridBagLayout());
        panelForm2.setAlignmentX(Component.CENTER_ALIGNMENT);
        panelForm2.setOpaque(false);

        gbc.gridy = 0;

        JLabel emailLabel2 = new JLabel("Email");
        panelForm2.add(emailLabel2, gbc);

        gbc.gridy++;
        JTextField emailField2 = new JTextField(20);
        panelForm2.add(emailField2, gbc);

        gbc.gridy++;
        JLabel passwordLabel2 = new JLabel("Password");
        panelForm2.add(passwordLabel2, gbc);

        gbc.gridy++;
        JPasswordField passwordField2 = new JPasswordField(20);
        panelForm2.add(passwordField2, gbc);

        JButton loginButton = new JButton("Login");
        loginButton.setBackground(new Color(221, 84, 49));
        loginButton.setForeground(Color.WHITE);
        loginButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        JPanel panelBottom2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel noaccLabel = new JLabel("I don't have an account");
        JButton noaccButton = new JButton("Register");

        noaccButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                card.show(frame.getContentPane(), "haveaccButton");
            }
        });

        panelBottom2.add(noaccLabel);
        panelBottom2.add(noaccButton);

        panel2.add(loginLabel);
        panel2.add(Box.createVerticalStrut(20));
        panel2.add(panelForm2);
        panel2.add(Box.createVerticalStrut(20));
        panel2.add(loginButton);
        panel2.add(Box.createVerticalStrut(10));
        panel2.add(panelBottom2);
        
        frame.add(panel1, "haveaccButton");
        frame.add(panel2, "noaccButton");

        frame.setVisible(true);
    }
}
