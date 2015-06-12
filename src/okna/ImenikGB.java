package okna;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author tomaz
 */
public class ImenikGB {
  
  static int stevec = 0;
  
  public static void main(String[] args) {
    JFrame okno = new JFrame();
    
    okno.setLayout(new GridBagLayout());
    
    JLabel imeL = new JLabel("Ime:");
    JLabel priimekL = new JLabel("Primek:");
    final JTextField imeTF = new JTextField();
    final JTextField priimekTF = new JTextField();
    final JTextArea imenikTA = new JTextArea();
    
    JButton exitB = new JButton("Koncaj");
    JButton addB = new JButton("Dodaj");
    
    GridBagConstraints gbc;
    
    JPanel spodajP = new JPanel(new GridBagLayout());
    
    gbc = new GridBagConstraints();
    gbc.gridx=0;
    gbc.gridy=0;
    spodajP.add(addB, gbc);
    
    gbc = new GridBagConstraints();
    gbc.gridx=1;
    gbc.gridy=0;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.weightx=1;
    spodajP.add(new JPanel(), gbc);

    gbc = new GridBagConstraints();
    gbc.gridx=2;
    gbc.gridy=0;
    spodajP.add(exitB, gbc);
    
    
    
    gbc = new GridBagConstraints();
    gbc.gridx=0;
    gbc.gridy=0;
    gbc.insets = new Insets(5, 5, 0, 0);
    gbc.anchor = GridBagConstraints.WEST;
    okno.add(imeL, gbc);

    gbc = new GridBagConstraints();
    gbc.gridx=1;
    gbc.gridy=0;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.insets = new Insets(5, 5, 0, 5);
    gbc.weightx= 1;
    okno.add(imeTF, gbc);
    
    gbc = new GridBagConstraints();
    gbc.gridx=0;
    gbc.gridy=1;
    gbc.insets = new Insets(5, 5, 0, 0);
    gbc.anchor = GridBagConstraints.WEST;
    okno.add(priimekL, gbc);
    
    gbc = new GridBagConstraints();
    gbc.gridx=1;
    gbc.gridy=1;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.weightx= 1;
    gbc.insets = new Insets(5, 5, 0, 5);
    okno.add(priimekTF, gbc);
    
    gbc = new GridBagConstraints();
    gbc.gridx=0;
    gbc.gridy=2;
    gbc.gridwidth=2;
    gbc.fill = GridBagConstraints.BOTH;
    gbc.weightx= 1;
    gbc.weighty= 1;
    gbc.insets = new Insets(5, 5, 0, 5);
    okno.add(imenikTA, gbc);
    
    gbc = new GridBagConstraints();
    gbc.gridx=0;
    gbc.gridy=3;
    gbc.gridwidth=2;
    gbc.insets = new Insets(5, 5, 0, 0);
    okno.add(spodajP, gbc);
     
    addB.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        // ... kar napisem tu, se bo zgodilo, ko uporabnik pritisne na gumb
        stevec++;
        String ime = imeTF.getText();
        String priimek = priimekTF.getText();
        
        imenikTA.append(stevec + ". "+ ime + " " + priimek + "\n");
      }
    });
    
    imeL.addMouseListener(new MouseListener() {

      @Override
      public void mouseClicked(MouseEvent e) {
        imeTF.setText(imeTF.getText() + "A");
      }

      @Override
      public void mousePressed(MouseEvent e) {
        
      }

      @Override
      public void mouseReleased(MouseEvent e) {
        
      }

      @Override
      public void mouseEntered(MouseEvent e) {
  
      }

      @Override
      public void mouseExited(MouseEvent e) {
 
      }
    });
    
    priimekL.addMouseListener(new MouseAdapter() {

      @Override
      public void mouseEntered(MouseEvent e) {
        imeTF.setText(imeTF.getText() + "B");
      }

      @Override
      public void mouseExited(MouseEvent e) {
         imeTF.setText(imeTF.getText() + "C");
      }
      
            
    });
    
    
    
    okno.pack();
    okno.setVisible(true);
  }

}
