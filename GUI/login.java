
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class login extends JFrame implements ActionListener{
    public static void main(String[] args) {
        login l=new login();
        l.setVisible(true);
        l.setSize(600, 800);
        l.setTitle("Login");
        l.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    JLabel userJLabel,passJLabel;
    JTextField usernameJTextField;
    JPasswordField passwordJPasswordField;
    JButton loginButton,resetButton;
    public login(){
        setLayout(new FlowLayout());
        userJLabel=new JLabel("Username: ");
        usernameJTextField=new JTextField();
        passJLabel=new JLabel("Passsword");
        passwordJPasswordField=new JPasswordField();
        loginButton= new JButton("Login");
        resetButton= new JButton("Reset");
        add(userJLabel);
        add(usernameJTextField);
        add(passJLabel);
        add(passwordJPasswordField);
        add(loginButton);
        add(resetButton);
        loginButton.addActionListener(this);
        resetButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){

        if (e.getSource()==loginButton) {
            String username=usernameJTextField.getText();
            String password=String.valueOf(passwordJPasswordField.getPassword());

            
    
            if(username.equals("admin") && password.equals("admin")){
                JOptionPane.showMessageDialog(this,"Login Successful");
            }
            else{
                JOptionPane.showMessageDialog(this,"Invalid Credentials");
            }
        }

        if(e.getSource()==resetButton){
            usernameJTextField.setText("");
            passwordJPasswordField.setText("");
        }
    }
}
