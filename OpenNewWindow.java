import javax.swing.*;

public class OpenNewWindow extends TemplateFrame{
	JButton myButton = new JButton("Open New Window");
	OpenNewWindow(){
		myButton.setBounds(100, 160, 200, 40);
		myButton.setFocusable(false);
		myButton.addActionListener(e -> {
			if(e.getSource()==myButton) {
				this.dispose(); //very very very important for project!
				MyFrame myFrame = new MyFrame();
			}
		});

		this.add(myButton);
		this.setLayout(null);


	}
}
