package okna;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author tomaz
 */
public class UrejavalnikBesedila {
  public static void main(String[] args) {
    JFrame okno= new JFrame();
    okno.setSize(300,300);
    okno.setLocation(200,200);
    
    JButton gumb1 = new JButton("OK");
    JButton gumb2 = new JButton("Prekliči");
    JTextArea besediloTA = new JTextArea();
    
    JPanel spodaj = new JPanel();
    spodaj.setBackground(Color.red);
    spodaj.setLayout(new FlowLayout(FlowLayout.RIGHT));
    spodaj.add(gumb1);spodaj.add(gumb2);
    
    
    Container vsebnik = okno.getContentPane();
    vsebnik.setLayout(new BorderLayout(20, 20)); // nastavim BorderLayout razporejevalnik
    
    vsebnik.add(besediloTA);
    vsebnik.add(spodaj, BorderLayout.PAGE_END);
    
    okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    okno.setVisible(true);
    
  }
}

