import javax.swing.*;
import java.awt.*;

public class MyFlow extends TemplateFrame {

	// FlowLayout = places components in a row, sized at their preferred size.
	//              If the horizontal space in the container is too small,
	//              the FlowLayout class uses the next available row.

	public MyFlow() {
		this.setLayout(new FlowLayout(FlowLayout.LEADING, 10, 10));

		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(100, 250));
		panel.setBackground(Color.lightGray);
		panel.setLayout(new FlowLayout());

		panel.add(new JButton("1"));
		panel.add(new JButton("2"));
		panel.add(new JButton("3"));
		panel.add(new JButton("4"));
		panel.add(new JButton("5"));
		panel.add(new JButton("6"));
		panel.add(new JButton("7"));
		panel.add(new JButton("8"));
		panel.add(new JButton("9"));


		this.add(panel);
	}
}
