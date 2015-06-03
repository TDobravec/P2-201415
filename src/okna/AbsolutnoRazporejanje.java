package okna;

import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * Izris okna z absolutnim pozicioniranjem komponent.
 * @author tomaz
 */
public class AbsolutnoRazporejanje {
  public static void main(String[] args) {
    JFrame okno = new JFrame("Absolutno");
    okno.setBounds(500, 500, 600,300);
    
    Container vsebnik = okno.getContentPane();
    vsebnik.setLayout(null);
    
    JLabel napis1 = new JLabel("Prvi napis");
    napis1.setFont(new Font("Arial", 0, 20));
    napis1.setBounds(0,10, 200,30);

    JLabel napis2 = new JLabel("Drugi napis");
    napis2.setBounds(50,50,100,20);
    
    JButton gumb1 = new JButton("OK");
    gumb1.setBounds(460,100,135,170);
    
    JTextField vpis = new JTextField();
    vpis.setBounds(300, 100, 150, 20);
    
    
    vsebnik.add(napis1);
    vsebnik.add(napis2);
    vsebnik.add(vpis);
    vsebnik.add(gumb1);
    
    okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    okno.setVisible(true);
  }
}
