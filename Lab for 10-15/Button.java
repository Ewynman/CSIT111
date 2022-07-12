//Write a javaFX program that presents two buttons and a number(initally 50)
//Each time the Add button is pushed, increase the value by one. Likewise, 
//each time the Subtract button is pressed, decrease the value by one.

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class Button extends JFrame {
	 private JButton incBtn = new JButton("Increment");
	  private JButton decBtn = new JButton("Decrement");
	  private JPanel lowPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
	  private JLabel showLbl = new JLabel("50", JLabel.CENTER);
	  private Font myFont = new Font("Tahoma", Font.BOLD, 60);

	  private int valueInt;

	  public Button() {

	    setTitle("IncDec Application =)");
	    setDefaultCloseOperation(EXIT_ON_CLOSE);

	    lowPanel.add(incBtn);
	    lowPanel.add(decBtn);

	    incBtn.addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent e) {
	        valueInt = Integer.parseInt(showLbl.getText());
	        valueInt++;
	        if (valueInt >= 10) {
	          showLbl.setText(String.valueOf(valueInt));
	        } else {
	          showLbl.setText("0" + String.valueOf(valueInt));
	        }
	      }
	    });

	    decBtn.addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent e) {
	        valueInt = Integer.parseInt(showLbl.getText());
	        if (valueInt > 0) {
	          valueInt--;
	        }
	        if (valueInt >= 10) {
	          showLbl.setText(String.valueOf(valueInt));
	        } else {
	          showLbl.setText("0" + String.valueOf(valueInt));
	        }
	      }
	    });

	    showLbl.setFont(myFont);

	    add(showLbl, BorderLayout.CENTER);
	    add(lowPanel, BorderLayout.SOUTH);
	    pack();
	    setLocationRelativeTo(null);
	    setVisible(true);

	  }

	  public static void main(String[] args) {
	    new Button();
	  }
}