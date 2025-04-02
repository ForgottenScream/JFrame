import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
	MyFrame() {
		// JFrame = GUI window to add components to
		//JFrame Title
		this.setTitle("JFrame title goes here"); // sets title of frame

		//Window Close Operations
		//JFrame.HIDE_ON_CLOSE - default - runs in background when closed
		//JFrame.DO_NOTHING_ON_CLOSE - does as it says on tin, don't use that
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application

		//Size of Window
		this.setSize(800, 600); // sets the x-dimension and y-dimension of frame
		this.setResizable(false); //prevent frame from being resized - cant be put to fullscreen either so be careful

		//Image Icon for Window
		ImageIcon icon = new ImageIcon("assets/tux.png"); //creates an ImageIcon
		this.setIconImage(icon.getImage()); //change icon of frame

		//Customize appearance
		this.getContentPane().setBackground(new Color(19, 115, 184)); //change background color (color name, rgb, hex value)

		//Label Time
		JLabel label = new JLabel();
//		JLabel label1 = new JLabel("Hello World"); //one way to create a label
		label.setText("Hello World"); //setting the text for the label
		this.add(label); // another way to create a label

		//Background Image
		ImageIcon image = new ImageIcon("assets/Health-PNG-image.png");
		label.setIcon(image);



		this.setVisible(true); // makes frame visible
	}
}
