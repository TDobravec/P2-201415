package okna;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author tomaz
 */
public class GBLayoutTest1 extends JFrame {

  public GBLayoutTest1() {
    initComponents();
  }
  
  
  
  void initComponents() {
    setLayout(new GridBagLayout());
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    JButton gumb1 = new JButton("1");
    JButton gumb2 = new JButton("2");
    JButton gumb3 = new JButton("3");
    JButton gumb4 = new JButton("4");
    JButton gumb5 = new JButton("5");
    
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.gridx=0;
    gbc.gridy=0;
    gbc.weightx = 1;gbc.weighty = 1;
    gbc.fill = GridBagConstraints.BOTH;
    add(gumb1, gbc);
    
    gbc = new GridBagConstraints();
    gbc.gridx=1;
    gbc.gridy=0;
    gbc.weightx = 1;
    gbc.weighty = 1;
    gbc.fill = GridBagConstraints.BOTH;
    add(gumb2, gbc);
    
    gbc = new GridBagConstraints();
    gbc.gridx=2;
    gbc.gridy=0;
    gbc.weightx = 1;
    gbc.weighty = 1;
    gbc.fill = GridBagConstraints.BOTH;
    add(gumb3, gbc);
    
    gbc = new GridBagConstraints();
    gbc.gridx=0;
    gbc.gridy=1;
    gbc.gridwidth=3;
    gbc.fill = GridBagConstraints.BOTH;
    gbc.weightx = 1;
    gbc.weighty = 1;
    add(gumb4, gbc);
    
    gbc = new GridBagConstraints();
    gbc.gridx=1;
    gbc.gridy=2;
    gbc.gridwidth=2;
    gbc.weighty = 1;
    gbc.fill = GridBagConstraints.BOTH;
    gbc.insets = new Insets(10, 10, 10, 10);
    add(gumb5, gbc);
    
    pack();
  }
  
  
  public static void main(String[] args) {
    GBLayoutTest1 okno = new GBLayoutTest1();
    okno.setVisible(true);
  }
  
}
