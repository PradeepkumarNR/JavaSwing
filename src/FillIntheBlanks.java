import javax.swing.JOptionPane;

public class FillIntheBlanks {

	public static void main(String[] args) {

		new FillIntheBlanks();

	}

	public FillIntheBlanks() {
		boolean done = false;
		while (!done) {
			done = true;

			String answer[] = new String[11];

			String[] colors = { "orange", "blue", "green", "yellow", "red", "purple" };

			JOptionPane.showMessageDialog(null, "lets make a story", "fill in the blank",
					JOptionPane.INFORMATION_MESSAGE);

			int color_index = JOptionPane.showOptionDialog(null, "whats your fav color? ", "color", 0,
					JOptionPane.QUESTION_MESSAGE, null, colors, 0);
			answer[0] = colors[color_index];

			answer[1] = JOptionPane.showInputDialog(null, "what is your fav drink?", "liquid",
					JOptionPane.QUESTION_MESSAGE);

			answer[2] = JOptionPane.showInputDialog("Name something which people bring to school(plural noun)");

			//answer[3] = JOptionPane.showInputDialog("Name something which people bring to office(plural noun)");

			int input = JOptionPane.showConfirmDialog(null, "are you sure you are ready to see the result");
			if (input == 1 || input == 2) {
				done = false;
			} else {
				input = JOptionPane.showConfirmDialog(null, "this is your last chance", " ", JOptionPane.YES_NO_OPTION);
				if (input == 1) {
					done = false;
				} else {
					input = JOptionPane.showConfirmDialog(null,
							"OK we will move on but you can still press cancel" + "", " ",
							JOptionPane.OK_CANCEL_OPTION);

				}

			}

			if (done) {
				JOptionPane.showMessageDialog(null, "each spring the sky turns  " + answer[0]+ "gaint drops of  " + answer[1]+ "and we carry  "+ answer[2]);
			} else {
				JOptionPane.showInternalMessageDialog(null, "Ok we will start over again");
			}

		}
	}
}