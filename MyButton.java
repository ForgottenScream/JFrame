import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// JButton  = a button that performs an action when clicked on
public class MyButton extends JFrame { //implements ActionListener { (trying lambda expression)
	private JButton button;
	private JLabel label;

	public MyButton() {

		ImageIcon icon = new ImageIcon("assets/small.png");
		ImageIcon icon2 = new ImageIcon("assets/radiation.png");

		label = new JLabel();
		label.setIcon(icon2);
		label.setBounds(150, 250, 150, 150);
		label.setVisible(false);

		button = new JButton();
		button.setBounds(200, 100, 250, 100);
		button.addActionListener(e -> System.out.println("Button clicked"));
		button.addActionListener(e -> label.setVisible(true));
		button.setText("Button");
		button.setFocusable(false); //takes the annoying border around text of button
		button.setIcon(icon);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Tahoma", Font.BOLD, 14));
//		button.setIconTextGap(-15);
		button.setForeground(Color.white);
		button.setBackground(Color.gray);
		button.setBorder(BorderFactory.createLineBorder(Color.black));
//		button.setEnabled(false); //disables button


		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500, 500);
		this.setVisible(true);
		this.add(button);
		this.add(label);
	}
//	@Override //use with implements ActionListener if not using lambda expression
//	public void actionPerformed(ActionEvent e){
//		if(e.getSource() == button){
//			System.out.println("Hello World");
//			button.setEnabled(false); //click once then disable
//			label.setVisible(true);
//		}
//
//	}
}
