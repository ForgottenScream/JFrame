import javax.swing.*;
import java.awt.*;

// Visual aid to let the user know that an operation is processing
public class MyProgressBar extends TemplateFrame{
	JProgressBar bar = new JProgressBar(0,100);
	JLabel label = new JLabel("Health:");

	public MyProgressBar() {
		this.setLayout(null);
		bar.add(label);
		label.setFont(new Font("Arial", Font.PLAIN, 20));

		bar.setValue(0); //sets initial value
		bar.setBounds(0, 0, 400, 50);
		bar.setStringPainted(true); //adds percentage to bar, changes in real time
		bar.setFont(new Font("Arial", Font.BOLD, 20));
		bar.setForeground(Color.RED);
		bar.setBackground(Color.BLACK);

		this.add(label);
		this.add(bar);
		this.pack();
		fill();
	}
	public void fill() {
		int counter = 100;
		while (counter > 0) {
			bar.setValue(counter);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			counter-=1;
		}
		bar.setString("You Lose.");
	}
}
