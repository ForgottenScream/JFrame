import javax.swing.*;
import java.awt.*;

//useful for delegating components to borders i.e. north border for title etc
public class MyBorders extends JFrame {
	public MyBorders() {
		//Layout Manager = Defines the natural layout for components within a container

		// 3 common managers

		//Border Layout = Places components in 5 areas: NORTH, SOUTH, EAST, WEST, CENTER
		//                All extra space is placed in the center area

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(new BorderLayout(10,10));
		this.setVisible(true);

		// create the panels
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();

		// set the background colours
		panel1.setBackground(Color.red);
		panel2.setBackground(Color.green);
		panel3.setBackground(Color.yellow);
		panel4.setBackground(Color.magenta);
		panel5.setBackground(Color.blue);

		// define the size
		panel1.setPreferredSize(new Dimension(100, 100));
		panel2.setPreferredSize(new Dimension(100, 100));
		panel3.setPreferredSize(new Dimension(100, 100));
		panel4.setPreferredSize(new Dimension(100, 100));
		panel5.setPreferredSize(new Dimension(100, 100));

		//-------------sub panels----------------------------------------//
		// create the panels
		JPanel panel6 = new JPanel();
		JPanel panel7 = new JPanel();
		JPanel panel8 = new JPanel();
		JPanel panel9 = new JPanel();
		JPanel panel10 = new JPanel();

		// set the background colours
		panel6.setBackground(Color.black);
		panel7.setBackground(Color.darkGray);
		panel8.setBackground(Color.gray);
		panel9.setBackground(Color.lightGray);
		panel10.setBackground(Color.white);

		panel5.setLayout(new BorderLayout());

		// define the size
		panel6.setPreferredSize(new Dimension(50, 50));
		panel7.setPreferredSize(new Dimension(50, 50));
		panel8.setPreferredSize(new Dimension(50, 50));
		panel9.setPreferredSize(new Dimension(50, 50));
		panel10.setPreferredSize(new Dimension(50, 50));

		// add sub panels to panel 5
		panel5.add(panel6, BorderLayout.NORTH);
		panel5.add(panel7, BorderLayout.SOUTH);
		panel5.add(panel8, BorderLayout.WEST);
		panel5.add(panel9, BorderLayout.EAST);
		panel5.add(panel10, BorderLayout.CENTER);

		// add panels and assign to border layout
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.WEST);
		this.add(panel3, BorderLayout.EAST);
		this.add(panel4, BorderLayout.SOUTH);
		this.add(panel5, BorderLayout.CENTER);

	}
}
