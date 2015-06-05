package okna;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author tomaz
 */
public class GridLayoutTest {
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
    vsebnik.setLayout(new GridLayout(3, 2));
    
    vsebnik.add(gumb1);
    vsebnik.add(gumb2);
    vsebnik.add(gumb3);
    vsebnik.add(gumb4);
    vsebnik.add(gumb5);
    
    // Na gumb dodam "akcijo" - ob kliku se odpre okno
    gumb1.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showInputDialog("Vpiši ime");
      }
    });
    
    JTextField vpisTF = new JTextField();
    vsebnik.add(vpisTF);
    
    okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    okno.setVisible(true);
    
  }
}
