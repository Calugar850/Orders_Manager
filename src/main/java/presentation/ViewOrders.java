package presentation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Clasa ViewOrder: este clasa in care se realizeaza partea grafica pentru selectarea operatiilor din tabelul orders si efectuarea acestora.
 */

public class ViewOrders extends JFrame {
    private JLabel label1=new JLabel("Selectati operatia:",SwingConstants.CENTER);
    private JLabel label2=new JLabel("Intoduceti ID-ul comenzii:",SwingConstants.CENTER);
    private JLabel label5=new JLabel("Intoduceti id-ul clientului",SwingConstants.CENTER);
    private JLabel label6=new JLabel("Intoduceti id-ul produsului",SwingConstants.CENTER);
    private JLabel label7=new JLabel("Intoduceti cantitate",SwingConstants.CENTER);
    private JLabel label8=new JLabel("Intoduceti suma",SwingConstants.CENTER);
    private JLabel emptyLabel1=new JLabel("");
    private JRadioButton button2=new JRadioButton("Stergere comanda dupa id");
    private JRadioButton button4=new JRadioButton("Afisare comenzi");
    private JRadioButton button5=new JRadioButton("Introducere comanda");
    private JLabel emptyLabel3=new JLabel("");
    private JLabel emptyLabel5=new JLabel("");
    private JLabel emptyLabel6=new JLabel("");
    private JButton submitButton= new JButton("Submit");
    private JButton submitButton1= new JButton("Submit");
    private JButton backButton= new JButton("Back");
    JTextField jTextField1=new JTextField();
    JTextField jTextField2=new JTextField();
    JTextField jTextField3=new JTextField();
    JTextField jTextField5=new JTextField();
    JTextField jTextField6=new JTextField();
    JTextField jTextField7=new JTextField();
    JTextField jTextField8=new JTextField();
    ButtonGroup group=new ButtonGroup();
    JPanel panel=new JPanel();
    JFrame frame=new JFrame();
    JTable jTable=new JTable(12,5);
    JScrollPane jScrollPane;
    public ViewOrders (){
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
        group.add(button4);
        group.add(button5);
        frame.setContentPane(panel);
        frame.setVisible(true);
    }

    public JRadioButton getButton2() { return button2; }
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
    public JTextField getjTextField5() { return jTextField5; }
    public void setjTextField5(JTextField jTextField5) { this.jTextField5 = jTextField5; }
    public JTextField getjTextField6() { return jTextField6; }
    public void setjTextField6(JTextField jTextField6) { this.jTextField6 = jTextField6; }
    public JTextField getjTextField7() { return jTextField7; }
    public void setjTextField7(JTextField jTextField7) { this.jTextField7 = jTextField7; }
    public JTextField getjTextField8() { return jTextField8; }
    public void setjTextField8(JTextField jTextField8) { this.jTextField8 = jTextField8; }

    public void back(){
        frame.repaint();
        panel.removeAll();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(new Dimension(900,625));
        frame.repaint();
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
        group.add(button4);
        group.add(button5);
        frame.setContentPane(panel);
        frame.setVisible(true);
    }

    public void stergereDupaId() {
        frame.repaint();
        panel.removeAll();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(new Dimension(900, 625));
        frame.repaint();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(0, 2));
        panel1.removeAll();
        panel1.add(label2);
        label2.setFont(new Font("Serif", Font.PLAIN, 20));
        panel1.add(jTextField2);
        panel.add(panel1);
        JPanel panel2 = new JPanel();
        panel2.add(submitButton1);
        panel2.add(backButton);
        submitButton1.setFont(new Font("Serif", Font.PLAIN, 18));
        backButton.setFont(new Font("Serif", Font.PLAIN, 18));
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
        panel1.add(label5);
        label5.setFont(new Font("Serif", Font.PLAIN, 20));
        panel1.add(jTextField5);
        panel1.add(label6);
        label6.setFont(new Font("Serif", Font.PLAIN, 20));
        panel1.add(jTextField6);
        panel1.add(label7);
        label7.setFont(new Font("Serif", Font.PLAIN, 20));
        panel1.add(jTextField7);
        panel1.add(label8);
        label8.setFont(new Font("Serif", Font.PLAIN, 20));
        panel1.add(jTextField8);
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