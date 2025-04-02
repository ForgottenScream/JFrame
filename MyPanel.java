import javax.swing.*;
import java.awt.*;

public class MyPanel extends JFrame {
	public MyPanel() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(750, 750);

		ImageIcon icon = new ImageIcon("assets/tux.png", "tux penguin");

		JLabel label = new JLabel();
		label.setText("Hi");
		label.setIcon(icon);
//		label.setVerticalAlignment(SwingConstants.TOP); //use for border layout not null
		label.setBounds(0, 0, 75, 75); //places component at coordinates relative to container

		//JPanel - a GUI component that functions as a container to hold other components.
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0, 0, 250, 250);

		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(250, 0, 250, 250);

		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(0, 250, 500, 250);

		this.add(redPanel);
		redPanel.add(label); //adds the label with the tux image

		this.add(bluePanel);
		this.add(greenPanel);
		this.setVisible(true);

		//flow layouts - components that are added to this manager will be
		// stuck to the top. once first row is filled it goes to second and so on
	}
}
