import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyComboBox extends TemplateFrame implements ActionListener {
	JComboBox comboBox;
	MyComboBox() {
		this.setLayout(new FlowLayout());

		String[] animals = {"dog", "cat", "bird"};

		comboBox = new JComboBox(animals);
		comboBox.addActionListener(this);

//		comboBox.setEditable(true); //can type in the value, if not in list returns -1
//		System.out.println(comboBox.getItemCount()); //returns number of items
//		comboBox.addItem("horse"); //adds a horse
//		comboBox.insertItemAt("pig", 0);
//		comboBox.setSelectedIndex(0); //defines which item to show first
//		comboBox.removeItem("dog"); //removes item
//		comboBox.removeItemAt(0); //removes item at index
//		comboBox.removeAllItems(); //removes all items

		this.add(comboBox);
		this.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == comboBox) {
			System.out.println(comboBox.getSelectedItem());
//			System.out.println(comboBox.getSelectedIndex());
		}
	}
}
