package presentation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Clasa View: este clasa in care se realizeaza partea grafica pentru selectarea tabelului pe care se doreste efectuarea operatiilor.
 */

public class View extends JFrame {
    private JLabel label1=new JLabel("Selectati tabelul pe care doriti sa efectuati operatiile:",SwingConstants.CENTER);
    private JLabel emptyLabel1=new JLabel("");
    private JRadioButton button1=new JRadioButton("Operatii pentru tabelul client");
    private JRadioButton button2=new JRadioButton("Operatii pentru tabelul product");
    private JRadioButton button3=new JRadioButton("Operatii pentru tabelul orders");
    private JLabel emptyLabel2=new JLabel("");
    private JLabel emptyLabel3=new JLabel("");
    private JLabel emptyLabel4=new JLabel("");
    private JButton submitButton= new JButton("Submit");
    private JButton backButton= new JButton("Back");
    ButtonGroup group=new ButtonGroup();
    JFrame frame=new JFrame();
    JPanel panel=new JPanel();
    public View (){
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(new Dimension(900,625));
        frame.repaint();

        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        JPanel panel1=new JPanel();
        panel1.setLayout(new GridLayout(0,2));

        panel1.add(label1);
        label1.setFont(new Font("Serif", Font.PLAIN, 20));
        panel1.add(emptyLabel1);

        panel1.add(button1);
        button1.setFont(new Font("Serif",Font.PLAIN,20));
        panel1.add(emptyLabel2);

        panel1.add(button2);
        button2.setFont(new Font("Serif",Font.PLAIN,20));
        panel1.add(emptyLabel3);

        panel1.add(button3);
        button3.setFont(new Font("Serif",Font.PLAIN,20));
        panel1.add(emptyLabel4);

        panel.add(panel1);

        JPanel panel2= new JPanel();
        panel2.add(submitButton);
        submitButton.setFont(new Font("Serif",Font.PLAIN,18));
        panel.add(panel2);

        group.add(button1);
        group.add(button2);
        group.add(button3);

        frame.setContentPane(panel);
        frame.setVisible(true);
    }

    public void addButtonListener(ActionListener listener){ submitButton.addActionListener(listener); }
    public void backButtonListener(ActionListener listener){ backButton.addActionListener(listener); }
    public JRadioButton getButton1() { return button1; }
    public JRadioButton getButton2() { return button2; }
    public JRadioButton getButton3() { return button3; }
    public JFrame getFrame() { return frame; }
}
