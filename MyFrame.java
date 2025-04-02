import javax.swing.*;
import javax.swing.border.Border;
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

		//Window Position
		this.setLocationRelativeTo(null); //centers the window

		//Size of Window
//		this.setSize(800, 600); // sets the x-dimension and y-dimension of frame
		this.setResizable(false); //prevent frame from being resized - cant be put to fullscreen either so be careful

		//Image Icon for Window
//		ImageIcon icon = new ImageIcon("assets/tux.png"); //creates an ImageIcon
//		this.setIconImage(icon.getImage()); //change icon of frame

		//Customize appearance
		this.getContentPane().setBackground(new Color(19, 115, 184)); //change background color (color name, rgb, hex value)

		//Border
		Border border = BorderFactory.createLineBorder(Color.BLACK,3); //creates border with parameters

		// Label Functionality
		JLabel label = new JLabel();
		label.setText("Hello World"); //setting the text for the label
		label.setIcon(new ImageIcon("assets/tux.png"));
		label.setVerticalAlignment(JLabel.BOTTOM); // set text LEFT,CENTER,RIGHT of image icon
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setVerticalTextPosition(SwingConstants.TOP); // set text TOP,CENTER,BOTTOM of image icon
		label.setHorizontalTextPosition(SwingConstants.CENTER);
		label.setForeground(new Color(0x00FF00)); //set font colour of text
		label.setFont(new Font("Serif", Font.BOLD, 20)); // set font of text
		label.setIconTextGap(10); //set gap of text to image
		label.setBackground(new Color(133, 99, 197));
		label.setOpaque(true); //to display background color set this to true
		label.setBorder(border); // sets the border
//		label.setBounds(100, 100, 850, 850); // set x,y position within frame as well as dimensions


		this.add(label);
//		this.setLayout(null); //when not using layout manager can put to null to define as you want
		this.pack(); // resizes the size of the frame to fit all components
		this.setVisible(true); // makes frame visible
	}
}