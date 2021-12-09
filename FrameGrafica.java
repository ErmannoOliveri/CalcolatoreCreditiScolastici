/**
 * @author Oliveri
 * @date 07/12/2021
 * @description Programma per calcolare i crediti scolastici di un alunno frequentante la classe terza,quarta,quinta
 */

package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameGrafica extends JFrame{
    private JTextField insufficienze;
    private JTextField crediti;
    private JTextField mediaVoti;
    private JLabel insufTesto;
    private JLabel mediaTesto;
    private JLabel creditiTesto;
    private JComboBox sceltaClasse;

    private JLabel testo1;
    private JButton pulsante1;

    public FrameGrafica(){
        super("Calcolatore Crediti Scolastici");
        String [] scelta = {"Terza", "Quarta", "Quinta"};
        pulsante1 = new JButton("Calcola");
        testo1 = new JLabel("Il Risultato apparirà qui");
        insufficienze = new JTextField();
        crediti = new JTextField();
        mediaVoti = new JTextField();
        insufTesto = new JLabel("Insufficienze:");
        mediaTesto = new JLabel("Media: ");
        creditiTesto = new JLabel("Crediti: ");
        sceltaClasse = new JComboBox<>(scelta);

        setLayout(new FlowLayout());

        pulsante1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String sceltaUtente = String.valueOf(sceltaClasse.getItemAt(sceltaClasse.getSelectedIndex()));
                String insufficienze1 = insufficienze.getText();
                String media = mediaVoti.getText();
                String crediti1 = crediti.getText();

                double media1 = Double.parseDouble(media);
                int insuf = Integer.parseInt(insufficienze1);
                int credit = Integer.parseInt(crediti1);

                if (media1 >= 0 && media1 <= 10){
                    if (sceltaUtente.equals("Terza")){
                        CreditoScolastico c1 = new CreditoScolastico(media1,insuf,credit);
                        c1.calcoloCreditiTerza();
                        int creditiTotali = c1.getCreditoScolastico();
                        String risultato = String.valueOf(creditiTotali);
                        testo1.setText("I Crediti sono: " + risultato);
                    }

                    else if (sceltaUtente.equals("Quarta")){
                        CreditoScolastico c1 = new CreditoScolastico(media1,insuf,credit);
                        c1.calcoloCreditiQuarta();
                        int creditiTotali = c1.getCreditoScolastico();
                        String risultato = String.valueOf(creditiTotali);
                        testo1.setText("I Crediti sono: " + risultato);
                    }

                    else if (sceltaUtente.equals("Quinta")){
                        CreditoScolastico c1 = new CreditoScolastico(media1,insuf,credit);
                        c1.calcoloCreditiQuinta();
                        int creditiTotali = c1.getCreditoScolastico();
                        String risultato = String.valueOf(creditiTotali);
                        testo1.setText("I Crediti sono: " + risultato);
                    }
                }
                else{
                    testo1.setText("Valori non Validi");
                }
            }
        });

        insufficienze.setColumns(5);
        mediaVoti.setColumns(5);
        crediti.setColumns(5);
        setSize(250,150);
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - getHeight()) / 2);
        setLocation(x,y);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        add(sceltaClasse);
        add(sceltaClasse);
        add(insufTesto);
        add(insufficienze);
        add(mediaTesto);
        add(mediaVoti);
        add(creditiTesto);
        add(crediti);
        add(pulsante1);
        add(testo1);
    }
}
