import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

// JTextField = A GUI textbox component that can be used to add, set or get text
public class MyTextField extends TemplateFrame implements ActionListener {

	JButton submitButton;
	JTextField textField;

	MyTextField(){
		this.setLayout(new FlowLayout());

		submitButton = new JButton("Submit");
		submitButton.addActionListener(this);

		textField = new JTextField();
		textField.setPreferredSize(new Dimension(250, 40));
		textField.setFont(new Font("Arial", Font.PLAIN, 35));
		textField.setForeground(Color.GREEN);
		textField.setBackground(Color.BLACK);
		textField.setCaretColor(Color.GREEN);
		textField.setText("username");

		this.add(submitButton);
		this.add(textField);
		this.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==submitButton) {
			System.out.println("Welcome " + textField.getText());
			submitButton.setEnabled(false);
			textField.setEditable(false);

		}
	}
}
