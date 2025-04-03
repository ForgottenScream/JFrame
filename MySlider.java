import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

// GUI component that lets user enter a value by using an adjustable sliding knob on a track
public class MySlider extends TemplateFrame implements ChangeListener {
	JPanel panel;
	JLabel label;
	JSlider slider;

	MySlider () {
		this.setTitle("Slider Demo");
		panel = new JPanel();
		label = new JLabel();
		slider = new JSlider(0, 100, 50);

		slider.setPreferredSize(new Dimension(400, 200));

		slider.setPaintTicks(true); //enable ticks
		slider.setMinorTickSpacing(5); //ticks every 10 units

		slider.setPaintTrack(true); //enables major ticks
		slider.setMajorTickSpacing(25); //major ticks every 25 units

		slider.setPaintLabels(true); //gives labels for the units
		slider.setFont(new Font("Serif", Font.PLAIN, 12));

		slider.setOrientation(SwingConstants.VERTICAL); //looks like a thermometer

		label.setText("Thermometer is " + slider.getValue() + "°C");
		label.setFont(new Font("Serif", Font.PLAIN, 20));

		slider.addChangeListener(this);

		panel.add(slider);
		panel.add(label);
		this.add(panel);

	}
	@Override
	public void stateChanged(ChangeEvent e) {
		label.setText("Thermometer is " + slider.getValue() + "°C");
	}
}
