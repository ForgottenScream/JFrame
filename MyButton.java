import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// JButton  = a button that performs an action when clicked on
public class MyButton extends JFrame { //implements ActionListener { (trying lambda expression)
	private JButton button;
	public MyButton() {

		ImageIcon icon = new ImageIcon("assets/small.png");

		button = new JButton();
		button.setBounds(200, 100, 250, 100);
		button.addActionListener(e -> System.out.println("Button clicked"));
		button.setText("Button");
		button.setFocusable(false); //takes the annoying border around text of button
		button.setIcon(icon);


		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500, 500);
		this.setVisible(true);
		this.add(button);
	}
//	@Override //use with implements ActionListener if not using lambda expression
//	public void actionPerformed(ActionEvent e){
//		if(e.getSource() == button){
//			System.out.println("Hello World");
//		}
//
//	}
}
