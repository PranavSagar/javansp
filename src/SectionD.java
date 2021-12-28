import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.border.EmptyBorder;
import javax.swing.*;

public class SectionD extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField firstname;
    private JTextField lastname;
    private JTextField email;
    private JTextField username;
    private JTextField mob;
    private JPasswordField passwordField;
    private JButton btnNewButton;
    private JButton show;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    SectionD frame = new SectionD();
                    frame.getContentPane().setBackground( Color.decode("#C7DCF9") );
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public SectionD() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Desktop\\STDM.jpg"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewUserRegister = new JLabel("Section D Java Lab Entery pass" );
        lblNewUserRegister.setFont(new Font("Times New Roman", Font.PLAIN, 42));
        lblNewUserRegister.setBounds(220, 52, 800, 50);
        contentPane.add(lblNewUserRegister);

        JLabel lblName = new JLabel("First name");
        lblName.setFont(new Font("Cooper Black", Font.PLAIN, 20));
        lblName.setBounds(50, 142, 150, 43);
        contentPane.add(lblName);

        JLabel lblNewLabel = new JLabel("Last name");
        lblNewLabel.setFont(new Font("Cooper Black", Font.PLAIN, 20));
        lblNewLabel.setBounds(50, 233, 150, 29);
        contentPane.add(lblNewLabel);

        JLabel lblEmailAddress = new JLabel("Email\r\n address");
        lblEmailAddress.setFont(new Font("Cooper Black", Font.PLAIN, 20));
        lblEmailAddress.setBounds(50, 314, 154, 36);
        contentPane.add(lblEmailAddress);

        firstname = new JTextField();
        firstname.setFont(new Font("Tahoma", Font.PLAIN, 18));
        firstname.setBounds(214, 151, 228, 30);
        contentPane.add(firstname);
        firstname.setColumns(10);

        lastname = new JTextField();
        lastname.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lastname.setBounds(214, 235, 228, 30);
        contentPane.add(lastname);
        lastname.setColumns(10);

        email = new JTextField();

        email.setFont(new Font("Tahoma", Font.PLAIN, 18));
        email.setBounds(214, 320, 228, 30);
        contentPane.add(email);
        email.setColumns(10);

        username = new JTextField();
        username.setFont(new Font("Tahoma", Font.PLAIN, 18));
        username.setBounds(707, 151, 228, 30);
        contentPane.add(username);
        username.setColumns(10);

        JLabel lblUsername = new JLabel("Username");
        lblUsername.setFont(new Font("Cooper Black", Font.PLAIN, 20));
        lblUsername.setBounds(542, 149, 150, 29);
        contentPane.add(lblUsername);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setFont(new Font("Cooper Black", Font.PLAIN, 20));
        lblPassword.setBounds(542, 235, 150, 24);
        contentPane.add(lblPassword);

        JLabel lblMobileNumber = new JLabel("Mobile no.");
        lblMobileNumber.setFont(new Font("Cooper Black", Font.PLAIN, 20));
        lblMobileNumber.setBounds(542, 319, 150, 26);
        contentPane.add(lblMobileNumber);

        mob = new JTextField();
        mob.setFont(new Font("Tahoma", Font.PLAIN, 18));
        mob.setBounds(707, 320, 228, 30);
        contentPane.add(mob);
        mob.setColumns(10);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 18));
        passwordField.setBounds(707, 235, 228, 30);
        contentPane.add(passwordField);

        btnNewButton = new JButton("Create a pass");
        show = new JButton("show");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String firstName = firstname.getText();
                String lastName = lastname.getText();
                String emailId = email.getText();
                String userName = username.getText();
                String mobileNumber = mob.getText();
                int len = mobileNumber.length();
                String password = passwordField.getText();

                String msg = "" + firstName;
                msg += " \n";
                if (len != 10) {
                    JOptionPane.showMessageDialog(btnNewButton, "Enter a valid mobile number");
                }

                try {
                    Class.forName("org.sqlite.JDBC");
                    Connection connection = DriverManager.getConnection("jdbc:sqlite:D:\\Git\\javansp\\reg.db");
                    String query = "INSERT INTO section values('" + firstName + "','" + lastName + "','" + userName + "','" +
                            password + "','" + emailId + "','" + mobileNumber + "')";

                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);
                    if (x == 0) {
                        JOptionPane.showMessageDialog(btnNewButton, "This is alredy exist");
                    } else {
                        JOptionPane.showMessageDialog(btnNewButton,
                                "Welcome, " + msg + " Your entry pass is sucessfully created");
                    }
                    connection.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        });
        btnNewButton.setFont(new Font("Cooper Black", Font.PLAIN, 22));
        btnNewButton.setBounds(359, 447, 259, 74);
        contentPane.add(btnNewButton);
    }
}


