package okna;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author tomaz
 */
public class JFrameTest {
  public static void main(String[] args) {
    JFrame okno = new JFrame();
    okno.setSize(300, 300);
    okno.setLocation(200, 200);
    okno.setTitle("Prvi program");
    
    JDialog dialog = new JDialog(okno,true);
    dialog.setSize(100, 100);
    dialog.setLocation(250, 250);
    dialog.setTitle("Prvi dialog");
    //dialog.setResizable(false);
    
    JDialog dialog2 = new JDialog(okno,true);
    dialog.setSize(100, 100);
    dialog.setLocation(250, 250);

    JButton gumb = new JButton("OK");
    //dialog.getContentPane().add(gumb);
    
    
    JPanel panel1 = new JPanel();
    //panel1.setBackground(Color.red);
    panel1.setBorder(BorderFactory.createTitledBorder("Okvir"));
    dialog.getContentPane().add(panel1);
    
    okno.getContentPane().setLayout(null);
    gumb.setBounds(10,10,50,50);
    okno.add(gumb);
    
    okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    okno.setVisible(true);
    //dialog.setVisible(true);
  }
}
