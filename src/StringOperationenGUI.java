import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StringOperationenGUI {

    private JPanel mainPanel;
    private JButton charAtButton;
    private JButton substringButton;
    private JButton lengthButton;
    private JButton upperCaseButton;
    private JButton lowerCaseButton;
    private JButton indexOfButton;
    private JButton equalsButton;
    private JButton lastIndexOfButton;
    private JTextField ausgabeFeld;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField stringEingabe;
    int position1, position2;
    String ausgabeString;


    public StringOperationenGUI() {

        charAtButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                position1= Integer.parseInt(textField1.getText());
                ausgabeFeld.setText(String.valueOf(stringEingabe.getText().charAt(position1)));

            }
        });
        lengthButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ausgabeFeld.setText(String.valueOf(stringEingabe.getText().length()));

            }
        });

        substringButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                position2= Integer.parseInt(textField2.getText());
                position1= Integer.parseInt(textField1.getText());
                ausgabeFeld.setText(stringEingabe.getText().substring(position1 ,position2));

            }
        });
        upperCaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ausgabeFeld.setText(stringEingabe.getText().toUpperCase());

            }
        });
        lowerCaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ausgabeFeld.setText(stringEingabe.getText().toLowerCase());

            }
        });
        indexOfButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ausgabeFeld.setText(String.valueOf(stringEingabe.getText().indexOf(textField1.getText())));

            }
        });
        //------------------------------------geht nicht--------------------------------------
        equalsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                position1= Integer.parseInt(textField1.getText());
                ausgabeString=stringEingabe.getText();
                boolean a = ausgabeString.equals(position1);
                ausgabeFeld.setText(String.valueOf(a));
            }
        });
        //------------------------------------------geht nicht------------------------------------------
        lastIndexOfButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ausgabeFeld.setText(String.valueOf(stringEingabe.getText().lastIndexOf(textField1.getText())));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("StringOperationenGUI");
        frame.setContentPane(new StringOperationenGUI().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
