import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//One or more buttons in a grouping which only 1 may be selected per group
public class MyRadioButton extends TemplateFrame implements ActionListener {
	JRadioButton pizzaButton;
	JRadioButton cheeseburgerButton;
	JRadioButton hotdogButton;

	public MyRadioButton() {
		this.setLayout(new FlowLayout());

		pizzaButton = new JRadioButton("Pizza");
		cheeseburgerButton = new JRadioButton("Cheeseburger");
		hotdogButton = new JRadioButton("Hotdog");

		ButtonGroup group = new ButtonGroup();
		group.add(pizzaButton);
		group.add(cheeseburgerButton);
		group.add(hotdogButton);

		pizzaButton.addActionListener(this);
		cheeseburgerButton.addActionListener(this);
		hotdogButton.addActionListener(this);

		this.add(pizzaButton);
		this.add(cheeseburgerButton);
		this.add(hotdogButton);
		this.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == pizzaButton) {
			System.out.println("You ordered a pizza!");
		}
		else if(e.getSource() == cheeseburgerButton) {
			System.out.println("You ordered a cheeseburger!");
		}
		else if(e.getSource() == hotdogButton) {
			System.out.println("You ordered a hotdog!");
		}
	}
}
