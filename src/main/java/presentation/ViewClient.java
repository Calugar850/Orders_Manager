package presentation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Clasa ViewClient: este clasa in care se realizeaza partea grafica pentru selectarea operatiilor din tabelul client si efectuarea acestora.
 */

public class ViewClient extends JFrame {
    private JLabel label1=new JLabel("Selectati operatia:",SwingConstants.CENTER);
    private JLabel label2=new JLabel("Intoduceti ID-ul clientului",SwingConstants.CENTER);
    private JLabel label3=new JLabel("Intoduceti noua adresa a clientului",SwingConstants.CENTER);
    private JLabel label4=new JLabel("Intoduceti numele clientului",SwingConstants.CENTER);
    private JLabel label5=new JLabel("Intoduceti adresa clientului",SwingConstants.CENTER);
    private JLabel emptyLabel1=new JLabel("");
    private JRadioButton button2=new JRadioButton("Stergere client dupa id");
    private JRadioButton button3=new JRadioButton("Actualizare client");
    private JRadioButton button4=new JRadioButton("Afisare clienti");
    private JRadioButton button5=new JRadioButton("Introducere client");
    private JLabel emptyLabel3=new JLabel("");
    private JLabel emptyLabel4=new JLabel("");
    private JLabel emptyLabel5=new JLabel("");
    private JLabel emptyLabel6=new JLabel("");
    private JButton submitButton= new JButton("Submit");
    private JButton submitButton1= new JButton("Submit");
    private JButton backButton= new JButton("Back");
    JTextField jTextField1=new JTextField();
    JTextField jTextField2=new JTextField();
    JTextField jTextField3=new JTextField();
    JTextField jTextField4=new JTextField();
    JTextField jTextField5=new JTextField();
    JTextField jTextField6=new JTextField();
    ButtonGroup group=new ButtonGroup();
    JPanel panel=new JPanel();
    JFrame frame=new JFrame();
    JTable jTable=new JTable();
    JScrollPane jScrollPane;
    public ViewClient (){
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(new Dimension(900,625));
        frame.repaint();

        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        JPanel panel1=new JPanel();
        panel1.setLayout(new GridLayout(0,2));

        panel1.add(label1);
        label1.setFont(new Font("Serif", Font.PLAIN, 20));
        panel1.add(emptyLabel1);

        panel1.add(button2);
        button2.setFont(new Font("Serif",Font.PLAIN,20));
        panel1.add(emptyLabel3);

        panel1.add(button3);
        button3.setFont(new Font("Serif",Font.PLAIN,20));
        panel1.add(emptyLabel4);

        panel1.add(button4);
        button4.setFont(new Font("Serif",Font.PLAIN,20));
        panel1.add(emptyLabel5);

        panel1.add(button5);
        button5.setFont(new Font("Serif",Font.PLAIN,20));
        panel1.add(emptyLabel6);

        panel.add(panel1);
        JPanel panel2= new JPanel();
        panel2.add(submitButton);
        submitButton.setFont(new Font("Serif",Font.PLAIN,18));
        panel.add(panel2);
        group.add(button2);
        group.add(button3);
        group.add(button4);
        group.add(button5);
        frame.setContentPane(panel);
        frame.setVisible(true);
    }

    public JRadioButton getButton2() { return button2; }
    public JRadioButton getButton3() { return button3; }
    public JRadioButton getButton4() { return button4; }
    public JRadioButton getButton5() { return button5; }
    public JButton getBackButton() { return backButton; }

    public void addButtonListener(ActionListener listener){ submitButton.addActionListener(listener); }
    public void addButtonListener1(ActionListener listener){ submitButton1.addActionListener(listener); }
    public void backButtonListener(ActionListener listener){ backButton.addActionListener(listener); }
    public JFrame getFrame() { return frame; }

    public JTextField getjTextField1() { return jTextField1; }
    public void setjTextField1(JTextField jTextField1) { this.jTextField1 = jTextField1; }
    public JTextField getjTextField2() { return jTextField2; }
    public void setjTextField2(JTextField jTextField2) { this.jTextField2 = jTextField2; }
    public JTextField getjTextField3() { return jTextField3; }
    public void setjTextField3(JTextField jTextField3) { this.jTextField3 = jTextField3; }
    public JTextField getjTextField4() { return jTextField4; }
    public void setjTextField4(JTextField jTextField4) { this.jTextField4 = jTextField4; }
    public JTextField getjTextField5() { return jTextField5; }
    public void setjTextField5(JTextField jTextField5) { this.jTextField5 = jTextField5; }
    public JTextField getjTextField6() { return jTextField6; }
    public void setjTextField6(JTextField jTextField6) { this.jTextField6 = jTextField6; }

    public void back(){
        frame.repaint();
        panel.removeAll();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(new Dimension(900,625));
        frame.repaint();

        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        JPanel panel1=new JPanel();
        panel1.setLayout(new GridLayout(0,2));

        panel1.add(label1);
        label1.setFont(new Font("Serif", Font.PLAIN, 20));
        panel1.add(emptyLabel1);

        panel1.add(button2);
        button2.setFont(new Font("Serif",Font.PLAIN,20));
        panel1.add(emptyLabel3);

        panel1.add(button3);
        button3.setFont(new Font("Serif",Font.PLAIN,20));
        panel1.add(emptyLabel4);

        panel1.add(button4);
        button4.setFont(new Font("Serif",Font.PLAIN,20));
        panel1.add(emptyLabel5);

        panel1.add(button5);
        button5.setFont(new Font("Serif",Font.PLAIN,20));
        panel1.add(emptyLabel6);

        panel.add(panel1);
        JPanel panel2= new JPanel();
        panel2.add(submitButton);
        submitButton.setFont(new Font("Serif",Font.PLAIN,18));
        panel.add(panel2);
        group.add(button2);
        group.add(button3);
        group.add(button4);
        group.add(button5);
        frame.setContentPane(panel);
        frame.setVisible(true);
    }

    public void stergereDupaId(){
        frame.repaint();
        panel.removeAll();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(new Dimension(900,625));
        frame.repaint();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        JPanel panel1=new JPanel();
        panel1.setLayout(new GridLayout(0,2));
        panel1.removeAll();
        panel1.add(label2);
        label2.setFont(new Font("Serif", Font.PLAIN, 20));
        panel1.add(jTextField2);
        panel.add(panel1);
        JPanel panel2= new JPanel();
        panel2.add(submitButton1);
        panel2.add(backButton);
        submitButton1.setFont(new Font("Serif",Font.PLAIN,18));
        backButton.setFont(new Font("Serif",Font.PLAIN,18));
        panel.add(panel2);
        frame.setContentPane(panel);
    }

    public void actualizare(){
        frame.repaint();
        panel.removeAll();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(new Dimension(900,625));
        frame.repaint();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        JPanel panel1=new JPanel();
        panel1.setLayout(new GridLayout(0,2));
        panel1.removeAll();
        panel1.add(label2);
        label2.setFont(new Font("Serif", Font.PLAIN, 20));
        panel1.add(jTextField3);
        panel1.add(label3);
        label3.setFont(new Font("Serif", Font.PLAIN, 20));
        panel1.add(jTextField4);
        panel.add(panel1);
        JPanel panel2= new JPanel();
        panel2.add(submitButton1);
        panel2.add(backButton);
        submitButton1.setFont(new Font("Serif",Font.PLAIN,18));
        backButton.setFont(new Font("Serif",Font.PLAIN,18));
        panel.add(panel2);
        frame.setContentPane(panel);
    }

    public void afisare(JTable j){
        frame.repaint();
        panel.removeAll();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(new Dimension(900,625));
        frame.repaint();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        JPanel panel1=new JPanel();
        panel1.removeAll();
        jTable=j;
        jScrollPane=new JScrollPane(jTable);
        jScrollPane.setBounds(180,120,900,625);
        panel1.add(jScrollPane);
        panel.add(panel1);
        JPanel panel2= new JPanel();
        panel2.add(backButton);
        backButton.setFont(new Font("Serif",Font.PLAIN,18));
        panel.add(panel2);
        frame.setContentPane(panel);
    }

    public void introducere(){
        frame.repaint();
        panel.removeAll();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(new Dimension(900,625));
        frame.repaint();
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
        JPanel panel1=new JPanel();
        panel1.setLayout(new GridLayout(0,2));
        panel1.removeAll();
        panel1.add(label4);
        label4.setFont(new Font("Serif", Font.PLAIN, 20));
        panel1.add(jTextField5);
        panel1.add(label5);
        label5.setFont(new Font("Serif", Font.PLAIN, 20));
        panel1.add(jTextField6);
        panel.add(panel1);
        JPanel panel2= new JPanel();
        panel2.add(submitButton1);
        panel2.add(backButton);
        submitButton1.setFont(new Font("Serif",Font.PLAIN,18));
        backButton.setFont(new Font("Serif",Font.PLAIN,18));
        panel.add(panel2);
        frame.setContentPane(panel);
    }
}