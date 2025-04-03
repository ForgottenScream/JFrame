import javax.swing.*;

public class MyDialogBox extends TemplateFrame{
		// JOptionPane =    pop up standard dialog box that prompts users for a value
		//                  or informs them of something.
	public MyDialogBox() {
//		JOptionPane.showMessageDialog(null, "This is a dialog box", "My Dialog Box", JOptionPane.INFORMATION_MESSAGE);
		//PLAIN_MESSAGE, INFORMATION_MESSAGE,WARNING_MESSAGE,QUESTION_MESSAGE

//		JOptionPane.showConfirmDialog(null, "Are you sure about that?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

//		System.out.println(JOptionPane.showConfirmDialog(null, "Are you sure about that?", "Confirm", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE));
		//YES= 0, NO = 1, CANCEL = 2, X = -1

//		int answer = JOptionPane.showConfirmDialog(null, "Are you sure about that?", "Confirm", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

//		String name = JOptionPane.showInputDialog("What is your name?");


		String[] responses = {"Thank you!", "No you are doing great!", "No I'm not.."};
		ImageIcon icon = new ImageIcon("assets/radiation.png");
		JOptionPane.showOptionDialog(null, "You are doing great!",
				"Motivational Message", JOptionPane.YES_NO_CANCEL_OPTION,
				JOptionPane.INFORMATION_MESSAGE, icon, responses, 0);
	}
}
