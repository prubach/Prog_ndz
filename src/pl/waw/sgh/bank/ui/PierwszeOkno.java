package pl.waw.sgh.bank.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by prubac on 11.06.2017.
 */
public class PierwszeOkno {

    public static void main(String[] args) {
        JFrame okno = new JFrame("Tytuł okna");
        okno.setSize(500,600);
        okno.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        okno.setLayout(new FlowLayout());

        JPanel panel = new JPanel();
        JLabel label = new JLabel("Witamy w aplikacji!!!");
        JTextField imie = new JTextField(30);
        JButton przycisk = new JButton("Naciśnij!!!");

        JButton przyciskNowyKlient = new JButton("Nowy klient!!!");
        panel.add(label);
        panel.add(imie);
        panel.add(przycisk);
        panel.add(przyciskNowyKlient);
        okno.add(panel);
        okno.setVisible(true);

        przycisk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(okno, imie.getText());
            }
        });

        przyciskNowyKlient.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JFrame okno = new JFrame("KlientUI");
                okno.setSize(500,600);
                okno.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                KlientUI klientUI = new KlientUI();
                okno.add(klientUI.getPanel1());
                okno.setVisible(true);
            }
        });





    }
}
