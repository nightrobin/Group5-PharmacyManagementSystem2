import com.mysql.cj.protocol.x.XMessage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LoginForm<User> extends JDialog {
    private static Object parent;
    private JPanel loginPanel;
    private JButton btnOk;
    private JComboBox cbCombo;

    public LoginForm(JFrame parent) {
        super(parent);
        setTitle("Login");
        setContentPane(loginPanel);
        setMinimumSize(new Dimension(480, 500));
        setModal(true);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String [] args) {
        LoginForm loginForm = new LoginForm((JFrame) parent);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}