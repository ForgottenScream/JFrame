import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyCheckBox extends TemplateFrame implements ActionListener {
	JButton button;
	JCheckBox checkBox;
	MyCheckBox() {
		this.setLayout(new FlowLayout());

		button = new JButton("Submit");
		button.setVerticalTextPosition(SwingConstants.BOTTOM);
		button.addActionListener(this);

		checkBox = new JCheckBox();
		checkBox.setText("I am not a Robot I swear.");
		checkBox.setHorizontalTextPosition(SwingConstants.LEFT);
		checkBox.setFocusable(false);
		checkBox.setFont(new Font("Arial", Font.PLAIN, 12));

		this.add(checkBox);
		this.add(button);
		this.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//TODO
		if (e.getSource()==button) {
			System.out.println(checkBox.isSelected());
		}
	}
}
