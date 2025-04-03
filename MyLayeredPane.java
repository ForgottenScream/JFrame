import javax.swing.*;
import java.awt.*;

public class MyLayeredPane extends TemplateFrame {
	// JLayeredPane = Swing container that provides a third
	//                dimension for position components
	//                ex. depth, Z-index
	public MyLayeredPane() {
		this.setLayout(null);

		JLabel label1 = new JLabel();
		label1.setOpaque(true);
		label1.setBackground(Color.RED);
		label1.setBounds(50, 50, 200, 200);

		JLabel label2 = new JLabel();
		label2.setOpaque(true);
		label2.setBackground(Color.GREEN);
		label2.setBounds(100, 100, 200, 200);

		JLabel label3 = new JLabel();
		label3.setOpaque(true);
		label3.setBackground(Color.BLUE);
		label3.setBounds(150, 150, 200, 200);

		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 500, 500);

		layeredPane.add(label1, JLayeredPane.DEFAULT_LAYER);
		layeredPane.add(label2, JLayeredPane.DEFAULT_LAYER);
		layeredPane.add(label3, JLayeredPane.DRAG_LAYER);

		this.add(layeredPane);

	}
}
