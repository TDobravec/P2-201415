package okna;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author tomaz
 */
public class BorderLayoutTest {
  public static void main(String[] args) {
    JFrame okno= new JFrame();
    okno.setSize(300,300);
    okno.setLocation(200,200);
    
    JButton gumb1 = new JButton("1");
    JButton gumb2 = new JButton("2");
    JButton gumb3 = new JButton("3");
    JButton gumb4 = new JButton("4");
    JButton gumb5 = new JButton("5");
    
    
    Container vsebnik = okno.getContentPane();
    vsebnik.setLayout(new BorderLayout()); // nastavim BorderLayout razporejevalnik
    
    vsebnik.add(gumb1, BorderLayout.LINE_START);
    vsebnik.add(gumb2);
    vsebnik.add(gumb3, BorderLayout.PAGE_START);
    //vsebnik.add(gumb4);
    //vsebnik.add(gumb5);
    
    
    okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    okno.setVisible(true);
    
  }
}
