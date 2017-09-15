package convertidorp.d;

import java.sql.ResultSet;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.Scanner;

/**
 *
 * @author adria
 * @version 1.0
 * @see https://github.com/Esquivias23
 */
public class Into extends JFrame implements ActionListener {

    public double resultado;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, covertidor, limpiar;
    JTextField t1;
    JLabel l1;

    public Into() {
        setTitle("Convertidor");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);
        setBounds(100, 100, 700, 400);

        l1 = new JLabel("Convertidor");
        l1.setBounds(10, 10, 100, 100);
        add(l1);

        t1 = new JTextField();
        t1.setBounds(200, 10, 200, 30);
        t1.enable(false);
        add(t1);

        b1 = new JButton("1");
        b1.setBounds(20, 100, 50, 50);
        add(b1);
        b1.addActionListener(this);

        b2 = new JButton("2");
        b2.setBounds(70, 100, 50, 50);
        add(b2);
        b2.addActionListener(this);

        b3 = new JButton("3");
        b3.setBounds(120, 100, 50, 50);
        add(b3);
        b3.addActionListener(this);

        b4 = new JButton("4");
        b4.setBounds(20, 150, 50, 50);
        add(b4);
        b4.addActionListener(this);

        b5 = new JButton("5");
        b5.setBounds(70, 150, 50, 50);
        add(b5);
        b5.addActionListener(this);

        b6 = new JButton("6");
        b6.setBounds(120, 150, 50, 50);
        add(b6);
        b6.addActionListener(this);

        b7 = new JButton("7");
        b7.setBounds(20, 200, 50, 50);
        add(b7);
        b7.addActionListener(this);

        b8 = new JButton("8");
        b8.setBounds(70, 200, 50, 50);
        add(b8);
        b8.addActionListener(this);

        b9 = new JButton("9");
        b9.setBounds(120, 200, 50, 50);
        add(b9);
        b9.addActionListener(this);

        b10 = new JButton(".");
        b10.setBounds(70, 250, 50, 50);
        add(b10);
        b10.addActionListener(this);

        covertidor = new JButton("Convierte");
        covertidor.setBounds(300, 100, 100, 50);
        add(covertidor);
        covertidor.addActionListener(this);

        limpiar = new JButton("Limpiar");
        limpiar.setBounds(300, 250, 100, 50);
        add(limpiar);
        limpiar.addActionListener(this);

        setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1){
            t1.setText(t1.getText()+ "1");
        }else{
            if(e.getSource() == b2){
                t1.setText(t1.getText()+ "2");
            }else{
                if(e.getSource() == b3){
                    t1.setText(t1.getText()+ "3");
                }else{
                    if(e.getSource() == b4){
                        t1.setText(t1.getText()+ "4");
                    }else{
                        if(e.getSource() == b5){
                            t1.setText(t1.getText()+ "5");
                        }else{
                            if(e.getSource() == b6){
                                t1.setText(t1.getText()+ "6");
                            }else
                                if(e.getSource() == b7){
                                    t1.setText(t1.getText()+ "7");
                                }else{
                                    if(e.getSource() == b8){
                                        t1.setText(t1.getText()+ "8");
                                    }else{
                                        if(e.getSource() == b9){
                                            t1.setText(t1.getText()+ "9");
                                        }else{
                                            if(e.getSource() == b10){
                                                t1.setText(t1.getText()+ ".");
                                            }
                                            else{
                                                if(e.getSource() == covertidor){
                                                    convertir();
                                                    t1.setText(toString().valueOf(resultado));
                                                }
                                                else{
                                                    t1.setText("");
                                                }
                                            }
                                        }
                                    }
                                }
                        }
                    }
                }
            }
        }
    }

    private void convertir() {
        double jaja = Double.parseDouble(t1.getText());
        resultado = jaja / 7;
        
    }
}
