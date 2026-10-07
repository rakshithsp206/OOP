
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CalculatorApp extends JFrame implements ActionListener{
    public static void main(String[] args) {
        CalculatorApp ca=new CalculatorApp();
        ca.setVisible(true);
        ca.setSize(1000, 300);
        ca.setTitle("Calculator");
        ca.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    JLabel num1Label,num2Label;
    JTextField num1Field,num2Field;
    JButton addBtn,subtractBtn,multiplyBtn,divideBtn;

    public CalculatorApp(){
        setLayout(new FlowLayout());

        num1Label= new JLabel("Number 1");
        num1Field= new JTextField(10);

        num2Label= new JLabel("Number 2");
        num2Field= new JTextField(10);

        addBtn= new JButton("Add");
        subtractBtn= new JButton("Subtract");
        multiplyBtn= new JButton("Multiply");
        divideBtn= new JButton("Divide");

        add(num1Label);
        add(num1Field);
        add(num2Label);
        add(num2Field);
        add(addBtn);
        add(subtractBtn);
        add(multiplyBtn);
        add(divideBtn);
        addBtn.addActionListener(this);
        subtractBtn.addActionListener(this);
        multiplyBtn.addActionListener(this);
        divideBtn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        int n1=Integer.parseInt(num1Field.getText());
        int n2=Integer.parseInt(num2Field.getText());
        if(e.getSource()==addBtn){
            JOptionPane.showMessageDialog(this, "Result : "+ (n1+n2));
        }

        if(e.getSource()==subtractBtn){
            JOptionPane.showMessageDialog(this, "Result : "+ (n1-n2));
        }

        if(e.getSource()==multiplyBtn){
            JOptionPane.showMessageDialog(this, "Result : "+ n1*n2);
        }

        if(e.getSource()==divideBtn){
            JOptionPane.showMessageDialog(this, "Result : "+ (float)n1/n2);
        }
    }
}
