import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class MyMenuBar extends TemplateFrame implements ActionListener {
	MyMenuBar() {
		this.setLayout(new FlowLayout());

		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenu editMenu = new JMenu("Edit");
		JMenu helpMenu = new JMenu("Help");

		JMenuItem loadItem = new JMenuItem("Load");
		JMenuItem saveItem = new JMenuItem("Save");
		JMenuItem exitItem = new JMenuItem("Exit");

		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);

//		fileMenu.setMnemonic(KeyEvent.VK_F); // alt f
//		editMenu.setMnemonic(KeyEvent.VK_E); // alt + e
//		helpMenu.setMnemonic(KeyEvent.VK_H); // alt + h
//		loadItem.setMnemonic(KeyEvent.VK_L); // l for load
//		saveItem.setMnemonic(KeyEvent.VK_S); // s for save
//		exitItem.setMnemonic(KeyEvent.VK_E); // e for exit

		fileMenu.add(loadItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);

		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);

		this.setJMenuBar(menuBar);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
			case "Load" -> System.out.println("File loaded");
			case "Save" -> System.out.println("File saved");
			case "Exit" -> System.exit(0);
		}
	}
}
