import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class Login extends JFrame implements ActionListener{

    JButton login,cancel,signup;
    JTextField username,password;
    Choice logginin;
    Login(){
        super("Login Page");
        getContentPane().setBackground(new Color(0X78DEC7));
        setLayout(null);

        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(350,120,100,20);
        lblusername.setFont(new Font("MV BOli",Font.BOLD,14));
        add(lblusername);

        username = new JTextField();
        username.setBounds(450,120,150,20);
        add(username);

        JLable lblpassword = new JLabel("Password");
        lblpassword.setFont(new Font("MV BOli", Font.BOLD,14));
        lblpassword.setBounds(350,160,100,20);






    }
}
