import javax.swing.*;
import java.awt.*;

public class MyGrid extends JFrame {
	public MyGrid() {

		// GridLayout = places components in a grid of cells
		//              each component takes all the available space within its cell
		//              and each cell is the same size

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(new GridLayout(3,3, 10, 0));

		this.add(new JButton("1"));
		this.add(new JButton("2"));
		this.add(new JButton("3"));
		this.add(new JButton("4"));
		this.add(new JButton("5"));
		this.add(new JButton("6"));
		this.add(new JButton("7"));
		this.add(new JButton("8"));
		this.add(new JButton("9"));
		this.add(new JButton("10"));

		this.setVisible(true);
	}
}
