import javax.swing.*;
import java.awt.*;

public class MyPanel extends JFrame {
	public MyPanel() {
		//JPanel - a GUI component that functions as a container to hold other components.

		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0, 0, 250, 250);

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(750, 750);
		this.add(redPanel);


		this.setVisible(true);
	}
}
