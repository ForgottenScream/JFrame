import javax.swing.*;

public class Main {
	public static void main(String[] args) {
		// JFrame = GUI window to add components to
		JFrame frame = new JFrame(); //creates a frame

		//JFrame Title
		frame.setTitle("JFrame title goes here"); // sets title of frame

		//Window Close Operations
		//JFrame.HIDE_ON_CLOSE - default - runs in background when closed
		//JFrame.DO_NOTHING_ON_CLOSE - does as it says on tin, don't use that
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application

		//Size of Window
		frame.setSize(800, 600); // sets the x-dimension and y-dimension of frame
		frame.setResizable(false); //prevent frame from being resized - cant be put to fullscreen either so be careful

		//Image Icon for Window
		ImageIcon icon = new ImageIcon("tux.png");


		frame.setVisible(true); // makes frame visible
	}
}
