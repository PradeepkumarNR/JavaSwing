import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class XOButton extends JButton implements ActionListener {

	ImageIcon X, O;
	byte value = 0;

	public XOButton() {
		X = new ImageIcon(this.getClass().getResource("X.png"));
		O = new ImageIcon(this.getClass().getResource("O.png"));
		this.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		value++;
		value %= 3;
		switch (value) {
		case 0:
			setIcon(null);
			break;
		case 1:
			setIcon(X);

		case 2:
			setIcon(O);
			break;
		default:
			break;
		}

	}

}
