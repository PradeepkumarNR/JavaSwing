import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class basicSwing extends JFrame {

	JPanel panel = new JPanel();
	JButton button = new JButton("Hello");
	JTextField textfield = new JTextField("Hi", 20);
	JTextArea textarea = new JTextArea("Hi\nhow \nare you", 5, 20);
	JLabel label = new JLabel("whats up");

	String choices[] = { "hello", "good", "morning" };
	JComboBox<String> combobox = new JComboBox<String>(choices);

	public static void main(String[] args) {
		new basicSwing();
	}

	public basicSwing() {

		super("BASIC SWING APP");

		setSize(400, 300);

		setResizable(true);

		panel.add(button);
		panel.add(textfield);
		panel.add(textarea);
		panel.add(label);
		panel.add(combobox);

		add(panel);
		setVisible(true);

	}

}
